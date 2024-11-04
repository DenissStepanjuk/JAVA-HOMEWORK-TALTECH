/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jelena
 */
public class Oop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Software> softwares=new ArrayList();
        
           softwares.add(new FreeWare("NetBeans"));
              
            softwares.add( new ShareWare("ZIP",LocalDate.of(2020,10,1)));
            softwares.add( new CommercialWare("SolidWorks",LocalDate.of(2022,11,27), 559.99));
  
    
    for(Software s : softwares){
        System.out.println(s);
    }
    {
        
    }
    }

    
    
}
