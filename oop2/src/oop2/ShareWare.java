/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2;

import java.time.LocalDate;

/**
 *
 * @author jelena
 */
public class ShareWare extends Software{

    private LocalDate dateOfUse ;

    public LocalDate getDateOfUse() {
        return dateOfUse;
    }

    public void setDateOfUse(LocalDate dateOfUse) {
        this.dateOfUse = dateOfUse;
    }
   
    public ShareWare(String name, LocalDate dateOfUse ) {
        super(name);
        this.dateOfUse=dateOfUse;
        
    }
    
    @Override
    public String toString() {
        return   "ShareWare=" + super.toString()+" date of use "+ this.dateOfUse;
    }

    @Override
    public boolean isTimeLimit() {
       //_??????
        return true;
    }
    
}
