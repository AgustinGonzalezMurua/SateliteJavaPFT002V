package DAO;

import org.json.simple.parser.JSONParser;

/**
 *
 * @author Agustin
 */
public interface IUsuarioDAO {
    //Se declara el parser ya que es utilizado siempre.
    final JSONParser JSONPARSER = new JSONParser();
    //Inicia el controlador del cliente
    final org.tempuri.IControladorServicio SERVICIO = new Servicio().GetConeccion();
    public DTO.Usuario Autenticar(String usuario, String contrasena);
    public DTO.Usuario CrearUsuario(String nombre, String run, int telefono, String email, int tipo_usuario, 
                                    String contrasena );
}
