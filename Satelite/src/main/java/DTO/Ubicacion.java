/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author AgusNuel
 */
public class Ubicacion {
    private int Codigo;
    private char Fila; 
    private int Recinto;

    public Ubicacion(JSONObject json) throws ParseException, java.text.ParseException {
        this.Codigo = Integer.parseInt(json.get("Codigo").toString());
        this.Fila = json.get("Fila").toString().charAt(0);
        this.Recinto = Integer.parseInt(json.get("Recinto").toString());
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public char getFila() {
        return Fila;
    }

    public void setFila(char Fila) {
        this.Fila = Fila;
    }
    
    public int getRecinto() {
        return Recinto;
    }

    public void setRecinto(int Recinto) {
        this.Recinto = Recinto;
    }
    
    @Override
    public String toString() {
        return "{"
                + "\"Codigo\" : \"" + Codigo + "\","                
                + "\"Fila\" : \"" + Fila + "\","   
                + "\"Recinto\" : \"" + Recinto + "\""  
                + '}';
    }
    
    public String toJSONString(){
        return org.json.simple.JSONValue.toJSONString(this);
    }

    
}
