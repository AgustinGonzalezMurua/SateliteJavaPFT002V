package DTO;

import org.json.simple.JSONObject;

public class Usuario {
    private String RUN;
    private int tipo;
    private String Nombre;

    public Usuario(JSONObject jobject) {
        this.setRUN(jobject.get("RUN").toString());
        this.setTipo(Integer.parseInt(jobject.get("Tipo").toString()));
        this.setNombre(jobject.get("Nombre").toString());
    }

    public Usuario() {
    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "RUN=" + RUN + ", tipo=" + tipo + ", Nombre=" + Nombre + '}';
    }
}
