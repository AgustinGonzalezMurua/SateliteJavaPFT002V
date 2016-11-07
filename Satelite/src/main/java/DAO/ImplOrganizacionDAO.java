/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.IBaseDAO.JSONPARSER;
import static DAO.IBaseDAO.SERVICIO;
import DTO.Evento;
import DTO.Organizacion;
import DTO.Usuario;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import Exceptions.ServiceError;
import java.util.ArrayList;
import java.util.Iterator;


public class ImplOrganizacionDAO implements IOrganizacionDAO {

    @Override
    public Organizacion RecuperarOrganizacion_RUT(String RUT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Organizacion RecuperarOrganizacion_RUN(Usuario _organizador) {
        try {         
            Organizacion _organizacion = new Organizacion();
            
            String result = SERVICIO.recuperarOrganizacionRUN(_organizador.getRUN());            
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(result);
            
            if (_resultado.containsKey("Error")) {
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());
            }else{
                _organizacion = new Organizacion(_resultado);
                if (_organizacion.getOrganizador().getRUN().equals(_organizador.getRUN())) {
                    _organizacion.setOrganizador(_organizador);
                }
            }
            return _organizacion;
            
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    @Override
    public ArrayList<Evento> RecuperarEventos(Organizacion organizacion) {
        try {         
            ArrayList<Evento> _eventos = new ArrayList<>();
            
            String result = SERVICIO.recuperarEventosOrganizacion(organizacion.getRUT());
            Object _resultado = JSONPARSER.parse(result);
            
            if (!ContieneErrores(_resultado)){
            } else{
                JSONArray _jeventos = (JSONArray)_resultado;
                Iterator iterator = _jeventos.iterator();
                
                while(iterator.hasNext()){
                    JSONObject _jevento = (JSONObject) iterator.next();
                    Evento _evento = new Evento(_jevento);
                    _eventos.add(_evento);
                }
            }
            return _eventos;
        } catch (Exception e) {
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
