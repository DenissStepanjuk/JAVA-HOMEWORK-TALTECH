/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_software;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Deniss
 */
public class Shareware extends Software  {
    
    
    public Shareware(String title, String developer, String dateInstall, String timeLimit){
        this.title = title;
        this.developer = developer;
        this.dateInstall = dateInstall;
        this.timeLimit = timeLimit;
        
}    
    


    

    
    @Override
    public String toString() {
        return "Shareware{" + "title=" + title + ", developer=" + developer + ", dateInstall=" + dateInstall + ", timeLimit=" + timeLimit +'}';
    }        
    
    @Override
    public boolean isTimeLimit() {
        String [] getDate = dateInstall.split("/");
        
        
        Calendar dayInstall = new GregorianCalendar();
        dayInstall.set(Calendar.YEAR, Integer.parseInt(getDate[2]));
        dayInstall.set(Calendar.MONTH, Integer.parseInt(getDate[1])-1);
        dayInstall.set(Calendar.DAY_OF_MONTH, Integer.parseInt(getDate[0]));

        //System.out.println(dayInstall.getTime());
        //System.out.println(Integer.parseInt(timeLimit));
        Calendar lastDay = dayInstall;
        lastDay.set(Calendar.DAY_OF_MONTH,+ Integer.parseInt(getDate[0]) +Integer.parseInt(timeLimit));
        
        Calendar dayNOW = new GregorianCalendar();
        
        //System.out.println(dayInstall.getTime());
        //System.out.println("///"+dayNOW.getTime());
        if (dayNOW.after(lastDay)){
            return false;
        }
        else{
            return true;}
    }
    
}
