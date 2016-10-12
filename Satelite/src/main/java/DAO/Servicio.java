/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Agustin
 */
public class Servicio {
    public org.tempuri.IControladorServicio GetConeccion(){
        org.tempuri.ControladorServicio service = new org.tempuri.ControladorServicio();
        return service.getBasicHttpBindingIControladorServicio();
    }
}
