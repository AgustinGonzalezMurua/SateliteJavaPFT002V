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
public class TipoGeneric {
    private int Codigo;
    private String Descripcion;

    public TipoGeneric(JSONObject jObject) {
        this.Codigo = Integer.parseInt(jObject.get("Codigo").toString());
        this.Descripcion = jObject.get("Descripcion").toString();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "TipoGeneric{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + '}';
    }
}
