/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lavanderia.utils;

import java.util.Date;

/**
 *
 * @author lucfg
 */
public class DateUtils {
    
    //Usar esse método pra converter as datas pro formato do sql nos DAOs
    public static java.sql.Date javaDateToSQLDate(Date data) {
        return new java.sql.Date(data.getTime());
    }
    
}
