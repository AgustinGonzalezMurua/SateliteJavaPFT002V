/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util.jComboBoxCustom.Models;

import DTO.Comuna;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Akira
 */
public class jComboBoxModelComuna extends AbstractListModel implements ComboBoxModel{
    private ArrayList<Comuna> Comunas;
    private Comuna selection = null;

    public jComboBoxModelComuna(ArrayList<Comuna> comunas) {
        this.Comunas = comunas;
    }
      
    @Override
    public int getSize() {
        return this.Comunas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.Comunas.get(index);
    }

    @Override
    public void setSelectedItem(Object comuna) {
        selection = (Comuna)comuna;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
}
