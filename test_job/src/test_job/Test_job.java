/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_job;

/**
 *
 * @author Deniss
 */
public class Test_job {

    /**
     * @param args the command line arguments
     */
    //private static final char SEPARATOR = 0x20;
   // private static final int MESSAGE_TYPE = 1;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // System.out.println(SEPARATOR + MESSAGE_TYPE + "=A");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println("0x70: " + 0x70);
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x70) {
            System.out.println("We found it");
            }
        
        
    }
        
    }
    
}
