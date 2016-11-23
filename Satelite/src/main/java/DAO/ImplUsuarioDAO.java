package DAO;

import static DAO.IBaseDAO.JSONPARSER;
import static DAO.IBaseDAO.SERVICIO;
import DTO.Usuario;
import Exceptions.ServiceError;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
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

    public void CrearUsuario(Usuario usuario) {

        try {
          JSONObject _resultado = (JSONObject)JSONPARSER.parse(SERVICIO.registrarUsuarioDesdeAdmin(usuario.toJSONString()));
          if(_resultado.containsKey("Error")){
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());              
          }  
           
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
    
    @Override
    public ArrayList<Usuario> RecuperarUsuario_Todos() {
        try {
            ArrayList<Usuario> _usuarios = new ArrayList<>();
            
            String result = SERVICIO.recuperarUsuarioTodos();
            Object _resultado = JSONPARSER.parse(result);
            
                 JSONArray _jusuarios = (JSONArray)_resultado;
                Iterator iterator = _jusuarios.iterator();
               
                while(iterator.hasNext()){
                    JSONObject jsonObject = (JSONObject) iterator.next();
                    DTO.Usuario _usuario = new DTO.Usuario(jsonObject);
                    _usuarios.add(_usuario);
                
            }
            
            return _usuarios;
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void Eliminar_Usuario(Usuario usuario) {
        try{
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(SERVICIO.eliminarUsuario(String.valueOf(usuario.getRUN())));
            if (ContieneErrores(_resultado)) {
                throw new ServiceError("Ha ocurrido un error al eliminar el evento:" + _resultado.get("Error").toString());
            }
        } catch (Exception e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    
    private boolean ContieneErrores(Object obj) throws ServiceError{
        if (obj instanceof JSONObject) {
                if (((JSONObject)obj).containsKey("Error")) {
                    throw new ServiceError("Ha ocurrido un error: " + ((JSONObject)obj).get("Error").toString());
                }else{
                    return false;
                }
        }else{
            return true;
        }
    }

   
   
}
