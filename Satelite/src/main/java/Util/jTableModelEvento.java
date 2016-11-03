/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import DTO.Evento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus
 */
public class jTableModelEvento extends DefaultTableModel{

    public jTableModelEvento() {
        this.addColumn("Nombre");
        this.addColumn("Fecha");
        this.addColumn("Fecha Creación");
        this.addColumn("Tipo");
        this.addColumn("Recinto");
        this.addColumn("Organización");
    }

    public void addRow(Evento evento) {
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        super.addRow(new Object[]{
            evento.getNombre()
            ,sdt.format(evento.getFecha())
            ,sdt.format(evento.getFechaCreacion())
            ,evento.getTipo()
            ,evento.getRecinto().getNombre()
            ,evento.getOrganizacion().getNombre()});
    }
    
    
}
