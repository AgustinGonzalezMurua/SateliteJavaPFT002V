package DAO;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public interface IUsuarioDAO extends IBaseDAO{
    public DTO.Usuario Autenticar(String usuario, String contrasena);
    public DTO.Usuario CrearUsuario(String nombre, String run, int telefono, String email, int tipo_usuario, 
                                    String contrasena );
    public DTO.Usuario ObtenerUsuario(String RUN);
    public ArrayList<DTO.Usuario> RecuperarUsuario_Todos();

}
