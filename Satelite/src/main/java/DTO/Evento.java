/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Agus
 */
public class Evento {
    private int Codigo;
    private String Nombre;
    private Calendar Fecha;
    private Date FechaCreacion;
    private TipoGeneric Tipo;
    private Recinto Recinto;
    private Organizacion Organizacion;
    private boolean Estado;

    public DateFormat  sdt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    
    public Evento() {
        this.Fecha = Calendar.getInstance();
    }

    public Evento(JSONObject json) throws ParseException, java.text.ParseException {
        
        this.Codigo         = Integer.parseInt(json.get("Codigo").toString());
        this.Nombre         = json.get("Nombre").toString();
        this.Fecha          = Calendar.getInstance();
        this.Fecha.setTime(sdt.parse(json.get("Fecha").toString()));
        this.FechaCreacion  = sdt.parse(json.get("FechaCreacion").toString());
        this.Tipo           = new TipoGeneric((JSONObject) new JSONParser().parse(json.get("Tipo").toString()));
        this.Recinto        = new Recinto((JSONObject) new JSONParser().parse(json.get("Recinto").toString()));
        this.Organizacion   = new Organizacion ((JSONObject) new JSONParser().parse(json.get("Organizacion").toString()));
        this.Estado         = Boolean.getBoolean(json.get("Estado").toString());
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }
    
    public void setFecha(Date Fecha) {
        this.Fecha.setTime(Fecha);
    }

    public String fechaToString(){
        SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return _dateFormat.format(this.Fecha.getTime());
    }
    
    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public TipoGeneric getTipo() {
        return Tipo;
    }

    public void setTipo(TipoGeneric Tipo) {
        this.Tipo = Tipo;
    }


    public Recinto getRecinto() {
        return Recinto;
    }

    public void setRecinto(Recinto Recinto) {
        this.Recinto = Recinto;
    }

    public Organizacion getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.Organizacion = organizacion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public int estadoToString(){
        if (Estado) {
            return 1;
        }else{
            return 0;
        }
    }
    
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getCodigo() {
        return Codigo;
    }
    
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    @Override
    public String toString() {
        return "{" + 
                     "\"Codigo\" : \"" + Codigo + "\"" +
                    ",\"Nombre\" : \"" + Nombre + "\"" +
                    ",\"Fecha\" : \"" + fechaToString() + "\"" +
                    ",\"FechaCreacion\" : \"" + FechaCreacion + "\"" +
                    ",\"Tipo\" : " + Tipo.getCodigo() +  
                    ",\"Recinto\" : \"" + Recinto.getCodigo() + "\""+  
                    ",\"Organizacion\" : \"" + Organizacion.getRUT() + "\"" +  
                    ",\"Estado\" : " + estadoToString() +
                "}";
    }

    public String toJSONString(){
        return org.json.simple.JSONValue.toJSONString(this);
    }
}
