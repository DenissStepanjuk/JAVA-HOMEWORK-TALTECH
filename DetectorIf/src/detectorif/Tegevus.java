/*
 * CALCULATOR
 */
package detectorif;
import java.util.Scanner;
/**
 *
 * @author Deniss
 */
public class Tegevus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Обьявляем обьект Scanner.
        Scanner scn = new Scanner(System.in);
        // Выберите действие введя один из символов(+,-,/,*).
        System.out.println("Enter + or - or / or *");
        String tegevus = scn.nextLine();
        // Введите значение для 1 переменой.
        System.out.println("enter number 1:");
        int num_1 = scn.nextInt();
        // Введите значение для 2 переменой.
        System.out.println("enter number 2:");
        int num_2 = scn.nextInt();
        // Иницилизируем переменную для ответа.
        double vastus = 0;
        
        // Исходя из выбраной операции выполняем действие.
        if (tegevus.equals("+")) {
            vastus = num_1+num_2;
            System.out.println("Vastus: "+vastus); }    
        else if (tegevus.equals("-")) {
            vastus = num_1-num_2;
            System.out.println("Vastus: "+vastus); }  
        else if (tegevus.equals("*")) {
            vastus = num_1*num_2;
            System.out.println("Vastus: "+vastus); }          
        if (tegevus.equals("/")) {
            if (num_2!=0) {
            vastus = num_1/num_2;
            System.out.println("Vastus: "+vastus); }
        else { System.out.println("VIga"); }        
        }   
    }
}
