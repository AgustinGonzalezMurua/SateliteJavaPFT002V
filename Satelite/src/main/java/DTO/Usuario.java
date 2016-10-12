/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Agustin
 */
public class Usuario {
    public String RUN;
    public int tipo;
    public String Nombre;

    @Override
    public String toString() {
        return "Usuario{" + "RUN=" + RUN + ", tipo=" + tipo + ", Nombre=" + Nombre + '}';
    }
    
    
}
