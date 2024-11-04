package oop2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelena
 */
public class FreeWare extends Software {

    public FreeWare(String name) {
        super(name);
    }
    
    @Override
    public String toString() {
        return   "Freeware=" + super.toString() ;
    }

    @Override
    public boolean isTimeLimit() {
        return false; 
    }
    
    
}
