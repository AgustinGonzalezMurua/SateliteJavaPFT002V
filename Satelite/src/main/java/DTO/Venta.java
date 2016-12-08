/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author agustin
 */
public class Venta {

    private String Codigo;
    private int Total;
    private Calendar FechaOperacion;
    private Evento Evento;

    public DateFormat  sdt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    
    public Venta(JSONObject json) throws ParseException, java.text.ParseException { 
        this.Codigo     = json.get("Codigo").toString();
        this.Total      = Integer.parseInt(json.get("Total").toString());
        this.FechaOperacion.setTime(sdt.parse(json.get("Fecha").toString()));
        this.Evento     = new Evento((JSONObject) new JSONParser().parse(json.get("Evento").toString()));
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public Calendar getFechaOperacion() {
        return FechaOperacion;
    }

    public void setFechaOperacion(Calendar FechaOperacion) {
        this.FechaOperacion = FechaOperacion;
    }

    public Evento getEvento() {
        return Evento;
    }

    public void setEvento(Evento Evento) {
        this.Evento = Evento;
    }
    
}
