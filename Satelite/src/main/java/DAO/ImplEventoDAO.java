/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Evento;
import Exceptions.ServiceError;
import org.json.simple.JSONObject;

/**
 *
 * @author Agus
 */
public class ImplEventoDAO implements IEventoDAO{

    @Override
    public void AgregarNuevoEvento(Evento evento) {
        try {
            JSONObject _resultado = (JSONObject)JSONPARSER.parse(SERVICIO.registrarEvento(evento.toJSONString()));
            if (_resultado.containsKey("Error")) {
                throw new ServiceError("Ha ocurrido un error: " + _resultado.get("Error").toString());
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
}
