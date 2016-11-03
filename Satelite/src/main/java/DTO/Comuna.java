/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.json.simple.JSONObject;

/**
 *
 * @author Agus
 */
public class Comuna {
    public int Codigo;
    public String Nombre;

    public Comuna() {
    }

    public Comuna(JSONObject json) {
        this.Codigo = Integer.parseInt(json.get("Codigo").toString());
        this.Nombre = json.get("Nombre").toString();
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

    public void setNombre(String Comuna) {
        this.Nombre = Comuna;
    }
    
    
}
