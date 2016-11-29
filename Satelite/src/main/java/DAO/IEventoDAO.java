/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Agus
 */
public interface IEventoDAO extends IBaseDAO{
    public void AgregarNuevoEvento(DTO.Evento evento, int cantidad, int precio);
    public void ModificarEvento(DTO.Evento evento);
    public void EliminarEvento(DTO.Evento evento);
}
