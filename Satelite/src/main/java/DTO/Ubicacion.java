/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Agus
 */
public class Ubicacion {
    private int Codigo;
    private int Numero;
    private int Fila;
    private boolean Habilitado;

    public Ubicacion() {
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getFila() {
        return Fila;
    }

    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    public boolean isHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(boolean Habilitado) {
        this.Habilitado = Habilitado;
    }

    @Override
    public String toString() {
        return "{"
                + "\"Codigo\" : \"" + Codigo + "\","
                + "\"Numero\" : \"" + Numero + "\","
                + "\"Fila\" : \"" + Fila + "\","
                + "\"Habilitado\" : \"" + Habilitado + "\""
                + '}';
    }
    
    
}
