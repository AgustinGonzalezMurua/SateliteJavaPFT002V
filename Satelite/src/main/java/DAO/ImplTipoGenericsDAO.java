/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TipoGeneric;
import Exceptions.ServiceError;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ImplTipoGenericsDAO implements ITipoGenericsDAO {

    @Override
    public ArrayList<TipoGeneric> RecuperarTipoEventos() {
        try {
            ArrayList<TipoGeneric> _tipoEventos = new ArrayList<>();
            
            String result = SERVICIO.recuperarTipoEventos();
            Object _resultado = JSONPARSER.parse(result);
            
            if (!ContieneErrores(_resultado)){
            } else{
                JSONArray _jeventos = (JSONArray)_resultado;
                Iterator iterator = _jeventos.iterator();
                
                while(iterator.hasNext()){
                    JSONObject _jTipoEvento = (JSONObject) iterator.next();
                    DTO.TipoGeneric _tipoEvento = new DTO.TipoGeneric(_jTipoEvento);
                    _tipoEventos.add(_tipoEvento);
                }
            }
            
            return _tipoEventos;
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
