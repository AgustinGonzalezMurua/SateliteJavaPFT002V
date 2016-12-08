/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.util.ArrayList;
/**
 *
 * @author agustin
 */
public interface IVentaDAO extends IBaseDAO{
    public ArrayList<DTO.Venta> ReporteVentas();
}
