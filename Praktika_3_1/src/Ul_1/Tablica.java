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
public class Tablica {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn= new Scanner(System.in);
        int counter = 0;
        for(int i = 0; i < 5; i += 1){
            int a = (int) (Math.random()*10);
            int b = (int) (Math.random()*10);
            System.out.println(a+" * "+b+" = ");
            int proverka = a*b;
            int otvet = scn.nextInt();
            counter = proverka == otvet?counter+=1:counter;
            System.out.println(proverka == otvet?ANSI_GREEN+"Tubli":ANSI_RED+"Viga");
        }
        switch(counter)
        {    
            case 1: case 2:System.out.println("Nork: "+ counter); break;
            case 3: case 4:System.out.println("Rahuldav: "+ counter);break;
            case 5: System.out.println("Tubli: "+ counter);break;
                
        }    
    
}
}
