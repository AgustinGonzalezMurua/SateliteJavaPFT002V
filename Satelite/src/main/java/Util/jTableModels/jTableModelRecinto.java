/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableModels;

import java.text.SimpleDateFormat;
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
        this.addColumn("Nombre");
        this.addColumn("Dirección");
        this.addColumn("Comuna");
        this.addColumn("Capacidad Máxima");
        this.addColumn("Teléfono");
    }
    
    public void cargarDatos(DTO.Recinto recinto) {
        super.addRow(new Object[]{
            recinto.getNombre()
            ,recinto.getDireccion()
            ,recinto.getComuna().getNombre()
            ,recinto.getCapacidadMaxima()
            ,recinto.getFono()
        });
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return Editable;
    }
}
