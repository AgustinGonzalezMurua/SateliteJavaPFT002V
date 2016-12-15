/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jListCustom.Models;

import DTO.TipoGeneric;

/**
 *
 * @author Agus
 */
public class jListModelComunas extends javax.swing.DefaultListModel{
    public jListModelComunas(java.util.ArrayList<DTO.Comuna> comunas){
        this.addElement(comunas);
    }
    public void addElement(java.util.ArrayList<DTO.Comuna> comunas) {
        comunas.forEach((comuna) -> {
            super.addElement(comuna.getNombre());
        });
    }
}
