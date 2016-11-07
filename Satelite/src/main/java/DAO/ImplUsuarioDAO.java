package DAO;

import DTO.Usuario;
import Exceptions.ServiceError;
import org.json.simple.JSONObject;
import java.security.MessageDigest;

public class ImplUsuarioDAO implements IUsuarioDAO {    
    @Override
    public Usuario Autenticar(String run, String contrasena) {
        Usuario _usuario = new Usuario();
        try {            
            //Consume un método del servicio
            String result = SERVICIO.validarUsuario(run, MD5(contrasena));            
            //Convierte el resultado en un objeto
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(result);
            
            if(_resultado.get("Respuesta").toString().equals("True")){
                //Consume un mètodo del servicio
                JSONObject _jsonUsuario = (JSONObject)JSONPARSER.parse(SERVICIO.recuperarUsuario(run));
                
                //Mapea los datos al objeto DAL
                _usuario = new Usuario(_jsonUsuario);
            }else{
                throw new IllegalArgumentException("Usuario o contraseña inválido.");
            }
            //Retorna el usuario
            return _usuario;
            
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public Usuario CrearUsuario(String nombre, String run, int telefono, String email, int tipo_usuario, String contrasena) {
        Usuario _usuario = new Usuario();
        try {
             //String result = SERVICIO.registrarUsuario(run);
             return _usuario;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
 
    }

    @Override
    public Usuario ObtenerUsuario(String RUN) {
        Usuario _usuario = new Usuario();
        try {            
            String result = SERVICIO.recuperarUsuario(RUN);            
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(result);
            
            if (_resultado.containsKey("Error")) {
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());
            }else{
                _usuario.setRUN(RUN);
                _usuario.setTipo(Integer.parseInt(_resultado.get("Tipo").toString()));
                _usuario.setNombre(_resultado.get("Nombre").toString());
            }
            return _usuario;
            
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    private String MD5(String cadena){
        try{
            byte[] bytes = cadena.getBytes("UTF-8");
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] procesed = md5.digest(bytes);
            
            return new java.math.BigInteger(1,procesed).toString(16);
        } catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
