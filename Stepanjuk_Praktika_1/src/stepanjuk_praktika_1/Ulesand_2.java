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
public class Ulesand_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int enter_num, num_1, num_2;
        System.out.print("Enter number(2 simbols): ");  
        enter_num = enter.nextInt();
        num_1 = enter_num / 10;
        num_2 = enter_num % 10;
        System.out.print("First number is: " + num_1 + "Second number is: " + num_2);
        // TODO code application logic here
    }
    
}
