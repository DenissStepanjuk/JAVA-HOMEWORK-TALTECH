/*
Deniss Stepanjuk EDTR31

Ülesanne1_2
Ülesanne. Keemiliste elementide perioodilisuse tabel

Analüüsige fail elements.csv. Looge klass ChemicalElement, mis sisaldab välju, meetodeid get/ set (omadused), konstruktoreid, toString.
Otsi element nimetuse järgi massiivist

*Kasutaja sisestab molekulaarvalemi, näiteks, H2O ja programm arvutab molekulaarkaalu.
 */
package oop1_chemic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Oop1_chemic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text;
        Double answer = 0.0;
        Scanner scn = new Scanner(System.in);
        List<ChemicalElement> books=ChemicalElementDAO.chemicalElements;
        List<ChemicalElement> kroxa=new ArrayList();
        //for (ChemicalElement b : books)
          //  System.out.println(b);
        
        System.out.println("Введите имя химического элемента:");
        text = scn.nextLine();  
        kroxa = ChemicalElementDAO.findByName(text);
        System.out.println(kroxa);
        
        System.out.println("Введите молекулярную формулу:");
        text = scn.nextLine();  
        answer = calculate(text);
        System.out.println("Молекулярная масса:"+answer);        


        
}
    
    
    
            static Double calculate(String text){
            Double answer = 0.0;
            String [] words = text.split("(?!^)");
            Scanner scn = new Scanner(System.in);
            for (int i = 0; i < words.length; i++)
                if(words[i].equals(words[i].toLowerCase())){
                    words[i-1]+=words[i];
                    words[i]="";
                }
            for (String w : words){
                
                if (w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)").length >1){
                    answer += ChemicalElementDAO.findNumberBySymbol(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[0])*Integer.parseInt(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[1]);
                    System.out.println(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[0]);
                    System.out.println(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[1]);
                }
                else{
                    answer += ChemicalElementDAO.findNumberBySymbol(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[0]);
                    System.out.println(w.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)")[0]);
                }
            }
            //System.out.println(answer);
            return answer;
            }
    }

