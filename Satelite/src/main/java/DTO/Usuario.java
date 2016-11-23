package DTO;

import javax.swing.JTable;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Usuario {
    private String RUN;
    private int Tipo;
    private String Nombre;
    private int Fono;
    private String Email;
    private int Estado;
    private String Clave;
    
    public Usuario() {
    }

   public Usuario(JSONObject jobject) throws ParseException, java.text.ParseException{
        this.setRUN(jobject.get("RUN").toString());
        this.setTipo(Integer.parseInt(jobject.get("Tipo").toString()));
        this.setNombre(jobject.get("Nombre").toString());
        this.setFono(Integer.parseInt(jobject.get("Fono").toString()));
        this.setEmail(jobject.get("Email").toString());
        this.setEstado(Integer.parseInt(jobject.get("Estado").toString()));
     //   this.setClave(jobject.get("Contraseña").toString());
        this.setClave(jobject.get("Contraseña").toString());
   }
     public int getEstado()
   {
       return Estado;
   }
   public void setEstado(int estado)
   {
       this.Estado = estado;
   }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String correo) {
        this.Email = correo;
    }  
   public int getFono()
   {
       return Fono;
   }
   public void setFono(int fono)
   {
       this.Fono = fono;
   }
    
    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int tipo) {
        this.Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     public String getClave()
   {
       return Clave;
   }
   public void setClave(String Clave)
   {
       this.Clave = Clave;
   }
    
 /*      public String getClave() {
        return Clave;
    }
    
    public void setClave(String Clave) {
        this.Clave = Clave;
    } */
    
    @Override
    public String toString() {
        return "{"
                + "\"RUN\" : \"" + RUN + "\","
                + "\"tipo\" : \"" + Tipo + "\","
                + "\"Nombre\" : \"" + Nombre + "\"" 
                + "\"Fono\" : \"" + Fono + "\""
                + "\"Correo\" : \"" + Email + "\"" 
                + "\"Estado\" : \"" + Estado + "\"" 
                +'}';
    }
    
public String toJSONString(){
        return org.json.simple.JSONValue.toJSONString(this);
    }
}
