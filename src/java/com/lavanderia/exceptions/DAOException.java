/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lavanderia.exceptions;

/**
 *
 * @author lucfg
 */
public class DAOException extends Exception{
    
    public DAOException() {}
    
    public DAOException(String string) {
        super(string);
    }
    
    public DAOException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }    
}
