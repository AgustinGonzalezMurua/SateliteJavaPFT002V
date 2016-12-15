/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Agus
 */
public class Recinto {
    private int Codigo;
    private String Nombre;
    private String Direccion;
    private Comuna Comuna;
    private int CapacidadMaxima;
    private int Fono;
    private ArrayList<Ubicacion> Ubicaciones;

    public Recinto() {
        
    }

    public Recinto(JSONObject json)throws ParseException, java.text.ParseException {
        this.Codigo             = Integer.parseInt(json.get("Codigo").toString());
        this.Nombre             = json.get("Nombre").toString();
        this.Direccion          = json.get("Direccion").toString();
        this.Comuna             = new Comuna((JSONObject) new JSONParser().parse(json.get("Comuna").toString()));
        this.CapacidadMaxima    = Integer.parseInt(json.get("CapacidadMaxima").toString());
        this.Fono               = Integer.parseInt(json.get("Fono").toString());
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getFono() {
        return Fono;
    }

    public void setFono(int Fono) {
        this.Fono = Fono;
    }

    public ArrayList<Ubicacion> getUbicaciones() {
        return Ubicaciones;
    }

    public void setUbicaciones(ArrayList<Ubicacion> Ubicaciones) {
        this.Ubicaciones = Ubicaciones;
    }
    
    public void AgregarUbicacion(Ubicacion ubicacion){
        this.Ubicaciones.add(ubicacion);
    }
    
    public void RemoverUbicacion(Ubicacion ubicacion){
        this.Ubicaciones.remove(ubicacion);
    }

    public Comuna getComuna() {
        return Comuna;
    }

    public void setComuna(Comuna Comuna) {
        this.Comuna = Comuna;
    }

    @Override
    public String toString() {
        return "{" 
                + "\"Codigo\" : \"" + Codigo + "\","
                + "\"Nombre\" : \"" + Nombre + "\","
                + "\"Direccion\" : \"" + Direccion + "\","
                + "\"Comuna\" : " + Comuna + ","
                + "\"CapacidadMaxima\" : \"" + CapacidadMaxima + "\","
                + "\"Fono\" : \"" + Fono + "\""
                + '}';
    }
    
     public String toJSONString(){
        return org.json.simple.JSONValue.toJSONString(this);
    }
}
