/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.Models;

import DTO.Usuario;
//import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathy
 */
public class jTableModelUsuarios extends DefaultTableModel{
 
        public jTableModelUsuarios(){
          
        this.addColumn("Run");
        this.addColumn("Nombre");
        this.addColumn("Telefono");
        this.addColumn("Email");
        this.addColumn("Perfil");
    
    }
        
                

    public void cargarDatos(Usuario usuario) {
    //    SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        super.addRow(new Object[]{
            usuario.getRUN(),
            usuario.getNombre(),
            usuario.getFono(),
            usuario.getEmail(),
            usuario.getTipo(),
                
        } 
                
        );
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
