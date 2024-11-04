/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepanjuk_praktika_1;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Stepanjuk_Praktika_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner temp = new Scanner(System.in);
   double cels, faren, koef;
   System.out.print("Enter temperatur in celsius: ");  
   cels = temp.nextFloat();
   koef = 1.8;
   faren = (cels*koef)+32;
   System.out.print("Temperatur in farengeit: " + faren);  
    }
    
}
