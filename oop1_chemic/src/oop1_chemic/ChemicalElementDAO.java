/*

 */
package oop1_chemic;

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
public class ChemicalElementDAO {
    public static List<ChemicalElement> chemicalElements = new ArrayList();
    static{
        try{
            Scanner scn = new Scanner (new FileReader ("elements.csv"));
            String title = scn.next();
            while (scn.hasNext()){
                String[] line = scn.nextLine().split(",");

                //System.out.println(line);
                
                if (line.length==9){
                ChemicalElement book = new ChemicalElement(line[0],Integer.parseInt(line[1]),line[2],line[3],line[4],line[5],line[6],line[7],line[8]);
                chemicalElements.add(book);
                }
                
                if (line.length==8){
                ChemicalElement book = new ChemicalElement(line[0],Integer.parseInt(line[1]),line[2],line[3],line[4],line[5],line[6],line[7]);
                chemicalElements.add(book);
                }                
                
                if (line.length==4){
                ChemicalElement book = new ChemicalElement(line[0],Integer.parseInt(line[1]),line[2],line[3]);
                chemicalElements.add(book);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ChemicalElementDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // поиск элемента по имени
        public static List<ChemicalElement> findByName(String type){
            List<ChemicalElement> findbooks=new ArrayList();
            for (ChemicalElement b : chemicalElements)
                if (b.getElement().toUpperCase().equals(type.toUpperCase())){
                    findbooks.add(b);}
            return findbooks;
        }
    //находим массу элемента по символу
        public static Double findNumberBySymbol(String type){
            Double number = 0.0;
            for (ChemicalElement b : chemicalElements)
                if (b.getSymbol().toUpperCase().equals(type.toUpperCase())){
                    number = Double.parseDouble(b.getWeight());}
            return number;
        }    
}
