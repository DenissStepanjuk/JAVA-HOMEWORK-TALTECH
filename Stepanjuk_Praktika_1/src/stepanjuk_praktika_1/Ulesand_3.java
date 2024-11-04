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
public class Ulesand_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int enter_number,num_1,num_2,num_3;
    enter_number = scan.nextInt();
    num_1 = enter_number/100;
    System.out.println("First number: " + num_1);
    num_2 = (enter_number%100)/10;
    System.out.println("Second number: " + num_2);
    num_3 = enter_number%10;
    System.out.println("Third number: " + num_3);
    int sum,multip;
    sum = num_1+num_2+num_3;
    multip = num_1*num_2*num_3;
    System.out.println("sum = "+sum+"   multiply ="+multip);
    int ul_1,ul_2,ul_3;
    ul_1 = num_3*100+num_2*10+num_1;
    System.out.println("From right to left: "+ul_1);
    ul_2 = num_2*100+num_3*10+num_1;
    System.out.println("Second - First - Third: "+ul_2);
    ul_3 = num_1*100+num_3*10+num_2;
    System.out.println("First - Third - Second: "+ul_3);
    // TODO code application logic here
    }
    
}
