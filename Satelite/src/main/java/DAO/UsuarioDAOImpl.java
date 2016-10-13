package DAO;

import DTO.Usuario;
import org.json.simple.JSONObject;

public class UsuarioDAOImpl implements IUsuarioDAO {    
    @Override
    public Usuario Autenticar(String run, String contrasena) {
        Usuario _usuario = new Usuario();
        
        try {            
            //Consume un método del servicio
            String result = SERVICIO.validarUsuario(run, contrasena);
            //Convierte el resultado en un objeto
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(result);
            
            if(_resultado.get("Respuesta").toString().equals("True")){
                //Consume un mètodo del servicio
                JSONObject _jsonUsuario = (JSONObject)JSONPARSER.parse(SERVICIO.recuperarUsuario(run));
                
                //Mapea los datos al objeto DAL
                _usuario.RUN = run;
                _usuario.tipo = Integer.parseInt(_jsonUsuario.get("Tipo").toString());
                _usuario.Nombre = _jsonUsuario.get("Nombre").toString();
            }else{
                throw new IllegalArgumentException("Usuario o contraseña inválido.");
            }
            //Retorna el usuario
            return _usuario;
            
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
