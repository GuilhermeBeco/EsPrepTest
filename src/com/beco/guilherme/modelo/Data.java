/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beco.guilherme.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author guilherme
 */
public class Data {
    private Calendar calendar;

    public Data(int dia, int mes, int ano) {
        this.calendar = new GregorianCalendar(dia, mes, ano);
    }

    public static Data parse(String data) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.setTime(dateFormat.parse(data));
            
            if(!calendar.isLenient()){
                return null;
            }
            return new Data(calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));
        } catch (Exception e) {
            return null;
        }
        
        
      

    }

    public int getDia() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getMes() {
        return calendar.get(Calendar.MONTH);
    }

    public int getAno() {
        return calendar.get(Calendar.YEAR);
    }

    public Calendar getCalendar() {
        return calendar;
    }
    

    @Override
    public String toString() {
        return "Data:" + getDia() + "/" + getMes() + "/" + getAno();
    }
  
    
    
}
