/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2_software;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deniss
 */
public class SoftwareDAO {
    public static List<Software> softwares = new ArrayList();
    static{
        try{
            Scanner scn = new Scanner (new FileReader ("Software.csv"));
            String title = scn.next();
            while (scn.hasNext()){
                String[] line = scn.nextLine().split(",");

                //System.out.println(line);
                
                if (line.length==4){
                Software book = new Freeware(line[1],line[2],line[3]);
                softwares.add(book);
                }
                
                if (line.length==5){
                Software book = new Shareware(line[1],line[2],line[3],line[4]);
                softwares.add(book);
                }                
                
                if (line.length==6){
                Software book = new CommercialSoftware(line[1],line[2],line[3],line[4],line[5]);
                softwares.add(book);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SoftwareDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    // Функция для поиска по критериям.
    // softwares.get(i).isTimeLimit() - проверка срока годности (Freeware можно использовать всегда)
    
            public static List<Software> findByCriteries(boolean poBool, boolean titleBool, boolean developerBool,
                    String po, String title, String developer){
            List<Software> findbooks=new ArrayList();
            
            for (int i = 0; i < softwares.toArray().length; i++) {
                if(softwares.get(i).isTimeLimit()){
                boolean block = true;

                
                    if (poBool){
                    
                        if (softwares.get(i).toString().toUpperCase().contains(po.toUpperCase()) && block){
                            findbooks.add(softwares.get(i));
                    }
                        else{block = false;findbooks.remove(softwares.get(i));}
                        }
                    
                    if (titleBool){
                        if (softwares.get(i).getTitle().toUpperCase().contains(title.toUpperCase()) && block){
                            findbooks.add(softwares.get(i));
                        }
                        else{block = false;findbooks.remove(softwares.get(i));}
                        }                
            
                    if (developerBool){
                       if (softwares.get(i).getDeveloper().toUpperCase().contains(developer.toUpperCase()) && block){
                            findbooks.add(softwares.get(i));
                        }
                        else{block = false;findbooks.remove(softwares.get(i));}
                       }
            
                
                }

            
            }
            //Удаляем повторы
                if (findbooks.toArray().length>1){
                    for (int i = 0; i < findbooks.toArray().length-1; i++) {
                        if (findbooks.get(i).equals(findbooks.get(i+1))){
                            findbooks.remove(findbooks.get(i));
                }
            }
            }
            
                return findbooks;
        }    
            
    
    
    
}
