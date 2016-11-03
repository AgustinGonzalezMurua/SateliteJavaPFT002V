/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.json.simple.parser.JSONParser;

/**
 *
 * @author Agus
 */
public interface IBaseDAO {
    //Se declara el parser ya que es utilizado siempre.
    final JSONParser JSONPARSER = new JSONParser();
    //Inicia el controlador del cliente
    final org.tempuri.IControladorServicio SERVICIO = new Servicio().GetConeccion();
}
