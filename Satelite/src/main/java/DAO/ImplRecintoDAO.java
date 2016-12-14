/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.IBaseDAO.JSONPARSER;
import static DAO.IBaseDAO.SERVICIO;
import DTO.Recinto;
import DTO.Ubicacion;
import Exceptions.ServiceError;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class ImplRecintoDAO implements IRecintoDAO {

    @Override
    public ArrayList<Recinto> RecuperarRecinto_Todos() {
        try {
            ArrayList<Recinto> _recintos = new ArrayList<>();
            
            String result = SERVICIO.recuperarRecintoTodos();
            Object _resultado = JSONPARSER.parse(result);
            
            if (!ContieneErrores(_resultado)){
            } else{
                JSONArray _jeventos = (JSONArray)_resultado;
                Iterator iterator = _jeventos.iterator();
                
                while(iterator.hasNext()){
                    JSONObject jsonObject = (JSONObject) iterator.next();
                    DTO.Recinto _recinto = new DTO.Recinto(jsonObject);
                    _recintos.add(_recinto);
                }
            }
            
            return _recintos;
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
        public void CrearUbicacion(Ubicacion ubicacion, int codigo, char fila, int recinto) {

        try {
          JSONObject _resultado = 
                  (JSONObject)JSONPARSER.parse(SERVICIO.registrarUbicacion(ubicacion.toJSONString(), codigo, codigo, recinto));
          if(_resultado.containsKey("Error")){
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());              
          }  
           
        } catch (Exception e) {
                        throw new IllegalArgumentException(e.getMessage());
  
        }
    }
        public void CrearRecinto(Recinto recinto) {

        try {
          JSONObject _resultado = 
                  (JSONObject)JSONPARSER.parse(SERVICIO.registrarRecinto(recinto.toJSONString()));
          if(_resultado.containsKey("Error")){
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());              
          }  
           
        } catch (Exception e) {
                        throw new IllegalArgumentException(e.getMessage());
  
        }
 
    }
}

