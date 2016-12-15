/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.Models;

import DTO.Ubicacion;
//import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathy
 */
public class jTableModelUbicaciones extends DefaultTableModel{
 
        public jTableModelUbicaciones(){
          
        this.addColumn("Codigo");
        this.addColumn("Fila");
        this.addColumn("Recinto");
        
    
    }
        
                

    public void cargarDatos(Ubicacion ubicacion) {
    

        super.addRow(new Object[]{
            ubicacion.getCodigo(),
            ubicacion.getFila(),
            ubicacion.getRecinto(),           
                
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
