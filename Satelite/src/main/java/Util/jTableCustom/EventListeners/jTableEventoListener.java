/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jTableCustom.EventListeners;

import Util.jTableCustom.Models.jTableModelEvento;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Agus
 */
public class jTableEventoListener implements TableModelListener{

    @Override
    public void tableChanged(TableModelEvent e) {
        jTableModelEvento model = (jTableModelEvento)e.getSource();
        model.ModificarEvento(e.getFirstRow());
    }
    
}
