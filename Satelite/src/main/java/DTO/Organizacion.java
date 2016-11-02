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
public class Organizacion {
    private String Run;
    private String Nombre;
    private String RazonSocial;
    private String Direccion;
    private String Telefono;
    private boolean Estado;
    private Usuario Organizador;

    public Organizacion() {
    }

    public String getRun() {
        return Run;
    }

    public void setRun(String Run) {
        this.Run = Run;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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

    @Override
    public String toString() {
        return "Organizacion{" + "Run=" + Run + ", Nombre=" + Nombre + ", RazonSocial=" + RazonSocial + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Estado=" + Estado + ", Organizador=" + Organizador + '}';
    }
}
