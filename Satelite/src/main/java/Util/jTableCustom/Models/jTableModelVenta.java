/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.Models;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus
 */
public class jTableModelVenta extends DefaultTableModel{

    private boolean Editable = false;
    
    public jTableModelVenta(boolean editable) {
        this.setColummns();
        this.Editable = editable;
    }

    public jTableModelVenta() {
        this.setColummns();
    }
    
    private void setColummns(){
        this.addColumn("Codigo");
        this.addColumn("Total");
        this.addColumn("Fecha Operación");
        this.addColumn("Evento");
    }
    
    public void cargarDatos(DTO.Venta venta) {
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        super.addRow(new Object[]{
            venta.getCodigo()
            ,venta.getTotal()
            ,sdt.format(venta.getFechaOperacion().getTime())
            ,venta.getEvento().getNombre()
        });
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return Editable;
    }
}
