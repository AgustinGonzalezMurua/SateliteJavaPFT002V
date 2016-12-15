package DTO;


import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class Usuario {
    private String RUN;
    private int Tipo;
    private String Nombre;
    private int Fono;
    private String Email;

    
    public Usuario() {
    }

   public Usuario(JSONObject jobject) throws ParseException, java.text.ParseException{
        this.setRUN(jobject.get("RUN").toString());
        this.setTipo(Integer.parseInt(jobject.get("Tipo").toString()));
        this.setNombre(jobject.get("Nombre").toString());
        this.setFono(Integer.parseInt(jobject.get("Fono").toString()));
        this.setEmail(jobject.get("Email").toString());        
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
    
    @Override
    public String toString() {
        return "{"
                + "\"RUN\" : \"" + RUN + "\","
                + "\"Tipo\" : \"" + Tipo + "\","
                + "\"Nombre\" : \"" + Nombre + "\"," 
                + "\"Fono\" : \"" + Fono + "\","
                + "\"Correo\" : \"" + Email + "\""                 
                +'}';
    }
    
    
public String toJSONString(){
        return org.json.simple.JSONValue.toJSONString(this);
    }
}
