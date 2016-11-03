/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public interface IOrganizacionDAO extends IBaseDAO{
    public DTO.Organizacion RecuperarOrganizacio_RUT(String RUT);
    public DTO.Organizacion RecuperarOrganizacion_RUN(DTO.Usuario usuario);
    public ArrayList<DTO.Evento> RecuperarEventos(DTO.Organizacion organizacion);
}
