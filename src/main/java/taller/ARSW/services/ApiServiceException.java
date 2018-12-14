/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.ARSW.services;

/**
 *
 * @author Karen Mora
 */
public class ApiServiceException extends Exception{
    
    public ApiServiceException(String message, Throwable problema){
        super(message,problema);
    }
    public ApiServiceException(String message){
        super(message);
    }
}
