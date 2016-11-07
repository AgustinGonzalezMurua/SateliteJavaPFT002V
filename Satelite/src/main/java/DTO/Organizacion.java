/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Agus
 */
public class Organizacion {
    private String RUT;
    private String Nombre;
    private String RazonSocial;
    private String Direccion;
    private Comuna Comuna;
    private String Fono;
    private String Email;
    private boolean Estado;
    private Usuario Organizador;

    public Organizacion() {
    }

    public Organizacion(JSONObject json) throws ParseException {
        this.RUT            = json.get("RUT").toString();
        this.Nombre         = json.get("Nombre").toString();
        this.RazonSocial    = json.get("RazonSocial").toString();
        this.Direccion      = json.get("Direccion").toString();
        this.Comuna         = new Comuna((JSONObject) new JSONParser().parse(json.get("Comuna").toString()));
        this.Fono           = json.get("Fono").toString();
        this.Email          = json.get("Email").toString();
        this.Estado         = Boolean.parseBoolean(json.get("Estado").toString());
        this.Organizador    = new Usuario((JSONObject) new JSONParser().parse(json.get("Organizador").toString()));
    }
    
    public String getRUT() {
        return RUT;
    }

    public void setRUT(String Run) {
        this.RUT = Run;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFono() {
        return Fono;
    }

    public void setFono(String Telefono) {
        this.Fono = Telefono;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Usuario getOrganizador() {
        return Organizador;
    }

    public void setOrganizador(Usuario Organizador) {
        this.Organizador = Organizador;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "{" 
                + "\"RUT\" : \"" + RUT + "\","
                + "\"Nombre\" : \"" + Nombre + "\","
                + "\"RazonSocial\" : \"" + RazonSocial + "\","
                + "\"Direccion\" : \"" + Direccion + "\","
                + "\"Comuna\" : " + Comuna + ","
                + "\"Fono\" : \"" + Fono + "\","
                + "\"Email\" : \"" + Email + "\","
                + "\"Estado\" :" + Estado + ","
                + "\"Organizador\" : " + Organizador 
                + '}';
    }


    
}
