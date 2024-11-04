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
public abstract class Software {
    public String title;
    public String developer;
    public String dateInstall;
    public String price;
    public String timeLimit;    
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String element) {
        this.title = element;
    }    
    
    
    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String element) {
        this.developer = element;
    }        
    

    public String getDateInstall() {
        return dateInstall;
    }

    public void setDateInstall(String element) {
        this.dateInstall = element;
    }        
    
    
    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String element) {
        this.timeLimit = element;
    }        


    public String getPrice() {
        return price;
    }

    public void setPrice(String element) {
        this.price = element;
    }   
    
    
    public abstract boolean isTimeLimit();
    
}
