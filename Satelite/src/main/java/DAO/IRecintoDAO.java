/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Recinto;
import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public interface IRecintoDAO extends IBaseDAO{
    public ArrayList<Recinto> RecuperarRecinto_Todos();
}
