/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Agus
 */
public class Evento {
    private String Nombre;
    private Date Fecha;
    private Date FechaCreacion;
    private String Tipo;
    private Recinto Recinto;
    private Organizacion Organizacion;
    private boolean Estado;

    public Evento() {
    }

    public Evento(JSONObject json) throws ParseException, java.text.ParseException {
        SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        
        this.Nombre         = json.get("Nombre").toString();
        this.Fecha          = sdt.parse(json.get("Fecha").toString());
        this.FechaCreacion  = sdt.parse(json.get("FechaCreacion").toString());
        this.Tipo           = json.get("Tipo").toString();
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
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

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Evento{" + "Nombre=" + Nombre + ", Fecha=" + Fecha + ", FechaCreacion=" + FechaCreacion + ", Tipo=" + Tipo + ", Recinto=" + Recinto + ", Organizacion=" + Organizacion + ", Estado=" + Estado + '}';
    }    
}
