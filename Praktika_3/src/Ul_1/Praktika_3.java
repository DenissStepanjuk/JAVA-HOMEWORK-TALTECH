/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ul_1;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Praktika_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // TODO code application logic here
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = scn.nextInt();
        System.out.print("Enter day: ");
        int day = scn.nextInt();

        switch(month)
        {    
            case 1: System.out.println(day<=19?"kozerog":"vodolei"); break;
            case 2: System.out.println(day<=18?"vodolei":"ribi"); break;
            case 3: System.out.println(day<=20?"ribi":"oven"); break;
            case 4: System.out.println(day<=19?"oven":"telec"); break;
            case 5: System.out.println(day<=20?"telec":"blizneci"); break;
            case 6: System.out.println(day<=21?"blizneci":"rak"); break;
            case 7: System.out.println(day<=22?"rak":"lev"); break;
            case 8: System.out.println(day<=22?"lev":"deva"); break;
            case 9: System.out.println(day<=22?"deva":"vesi"); break;
            case 10: System.out.println(day<=22?"vesi":"skorpion"); break;
            case 11: System.out.println(day<=22?"skorpion":"strelec"); break;
            case 12: System.out.println(day<=21?"strelec":"kozerog"); break;
            default: System.out.println("Viga");break;
                
        }    
        }
        }    