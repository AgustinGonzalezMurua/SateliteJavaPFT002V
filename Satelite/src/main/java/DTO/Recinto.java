/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.ArrayList;
import org.json.simple.JSONObject;

/**
 *
 * @author Agus
 */
public class Recinto {
    private int Codigo;
    private String Nombre;
    private String Direccion;
    private int CapacidadMaxima;
    private String Fono;
    private ArrayList<Ubicacion> Ubicaciones;

    public Recinto() {
    }

    public Recinto(JSONObject json) {
        this.Codigo             = Integer.parseInt(json.get("Codigo").toString());
        this.Nombre             = json.get("Nombre").toString();
        this.Direccion          = json.get("Direccion").toString();
        this.CapacidadMaxima    = Integer.parseInt(json.get("CapacidadMaxima").toString());
        this.Fono               = json.get("Fono").toString();
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

    public String getFono() {
        return Fono;
    }

    public void setFono(String Fono) {
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
}
