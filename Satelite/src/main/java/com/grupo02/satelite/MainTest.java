package com.grupo02.Satelite;

import DAO.UsuarioDAOImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agustin
 */
public class MainTest {
    public static void main(String[] args){
        
        try {
            DTO.Usuario _usuario = new UsuarioDAOImpl().Autenticar("18408449k", "123");
            System.out.println(_usuario.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
