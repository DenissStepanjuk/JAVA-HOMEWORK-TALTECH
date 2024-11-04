/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_8;

import java.util.Random;

/**
 *
 * @author Deniss
 */
public class UL2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rnd = new Random();
        int popitka = 100000;
        int[] massiv= new int [popitka];
        int[] pods4jot= new int[13];
        
        
        for (int i=0; i < popitka;i+=1){
        massiv[i]=rnd.nextInt(11)+2;
        System.out.println("["+i+"]: "+massiv[i]);
            for (int j=2; j <=12;j+=1){
                if (massiv[i]==j)
                    pods4jot[j]+=1;
                
            
            }
        }
        System.out.println("Combination: ");
        System.out.println("[2] ----- "+pods4jot[2]);
        System.out.println("[3] ----- "+pods4jot[3]);
        System.out.println("[4] ----- "+pods4jot[4]);
        System.out.println("[5] ----- "+pods4jot[5]);
        System.out.println("[6] ----- "+pods4jot[6]);
        System.out.println("[7] ----- "+pods4jot[7]);
        System.out.println("[8] ----- "+pods4jot[8]);
        System.out.println("[9] ----- "+pods4jot[9]);        
        System.out.println("[10] ----- "+pods4jot[10]);
        System.out.println("[11] ----- "+pods4jot[11]);
        System.out.println("[12] ----- "+pods4jot[12]);
        
        
    }
    
}
