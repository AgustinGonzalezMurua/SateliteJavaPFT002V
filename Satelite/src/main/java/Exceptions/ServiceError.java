/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Agus
 */
public class ServiceError extends Exception{
    public ServiceError(){}
    
    public ServiceError(String message){
        super(message);
    }
}
