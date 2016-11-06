/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.TipoGeneric;

/**
 *
 * @author Agus
 */
public class jListModelTipoGenerics extends javax.swing.DefaultListModel{
    public jListModelTipoGenerics(java.util.ArrayList<TipoGeneric> generic){
        this.addElement(generic);
    }
    public void addElement(java.util.ArrayList<TipoGeneric> generic) {
        generic.forEach((tipoGeneric) -> {
            super.addElement(tipoGeneric.getDescripcion());
        });
    }
}
