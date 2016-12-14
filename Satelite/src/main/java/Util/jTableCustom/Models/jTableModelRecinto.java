/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.Models;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus
 */
public class jTableModelRecinto extends DefaultTableModel{

    private boolean Editable = false;
    
    public jTableModelRecinto(boolean editable) {
        this.setColummns();
        this.Editable = editable;
    }

    public jTableModelRecinto() {
        this.setColummns();
    }
    
    private void setColummns(){
        this.addColumn("Codigo");
        this.addColumn("Nombre");
        this.addColumn("Dirección");
        this.addColumn("Comuna");
        this.addColumn("Teléfono");
        this.addColumn("Capacidad Máxima");
        
    }
    
    public void cargarDatos(DTO.Recinto recinto) {
        super.addRow(new Object[]{
            recinto.getCodigo()
            ,recinto.getNombre()
            ,recinto.getDireccion()
            ,recinto.getComuna().getNombre()
            ,recinto.getFono()
            ,recinto.getCapacidadMaxima()
            
        });
    }
    
    public boolean[] editable = new boolean[]{
        false
        ,true
        ,true
    };
    
        @Override
       public boolean isCellEditable(int row, int column){
        return editable[column];
    } 
      public void removerDatos(){
        this.setRowCount(0);
    }     
}
