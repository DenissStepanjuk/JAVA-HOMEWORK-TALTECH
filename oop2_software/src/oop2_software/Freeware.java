/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_software;

/**
 *
 * @author Deniss
 */
public class Freeware extends Software {
    
    public Freeware(String title, String developer, String dateInstall){
        this.title = title;
        this.developer = developer;
        this.dateInstall = dateInstall;
        

}
    

    @Override
    public String toString() {
        return "Freeware{" + "title=" + title + ", developer=" + developer + ", dateInstall=" + dateInstall + '}';
    }    

    @Override
    public boolean isTimeLimit() {
        return true;
    }
    
}
