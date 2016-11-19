/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.Models;

import DTO.Evento;
import DTO.Organizacion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus
 */
public class jTableModelEvento extends DefaultTableModel{
    
    public jTableModelEvento() {
        this.addColumn("Codigo");
        this.addColumn("Nombre");
        this.addColumn("Fecha");
        this.addColumn("Fecha Creación");
        this.addColumn("Tipo");
        this.addColumn("Recinto");
        this.addColumn("Organización");
    }

    public void cargarDatos(Evento evento) {        
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        super.addRow(new Object[]{
            evento.getCodigo()
            ,evento.getNombre()
            ,sdt.format(evento.getFecha().getTime())
            ,sdt.format(evento.getFechaCreacion())
            ,evento.getTipo().getDescripcion()
            ,evento.getRecinto().getNombre()
            ,evento.getOrganizacion().getNombre()});
    }
    
    public boolean[] editable = new boolean[]{
        false
        ,false
        ,false
        ,false
        ,false
        ,false
        ,false
    };
    
    @Override
    public boolean isCellEditable(int row, int column){
        return editable[column];
    }
    
    public void removerDatos(){
        this.setRowCount(0);
    }

    public void assignTable(JTable jTableEventos) {
        jTableEventos.setModel(this);
    }
    
    public ArrayList<Evento> refrescarEventos(ArrayList<Evento> eventos, Organizacion organizacion){
        eventos = new DAO.ImplOrganizacionDAO().RecuperarEventos(organizacion);

        this.removerDatos();
        
        eventos.forEach((evento) -> {
            this.cargarDatos(evento);
        });
        
        this.isCellEditable(0, 0);
        
        return eventos;
    }
}
