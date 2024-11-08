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
public class CommercialWare extends ShareWare {
    
    private double  price;
    
    public CommercialWare(String name, LocalDate dateOfUse, double  price) {
        super(name, dateOfUse);
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     @Override
    public String toString() {
        return   "CommercialWare=" + super.toString()+" price "+ this.price;
    }
    
}
