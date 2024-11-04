/*
 * IF_and_SWITCH.
 */
package detectorif;
import java.util.Scanner;
/**
 *
 * @author Deniss
 */
public class DetectorIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Обьявляем обьект Scanner.
        Scanner scn = new Scanner(System.in);
        // Просим ввести в консоль число от 1 одного до 5.
        System.out.print("Enter number from 1 to 5: ");
        int number = scn.nextInt();
        // Каждой цифре соответствует слово и его надо вывести.
        
        //Реализация на IF.
        // Проверяем что введённое число от 1 до 5, если нет, то выводим ошибку.
        if (number >= 1 && number <= 5) {
            if (number==1){ System.out.println("Nork"); } 
            else if (number==2 || number==3){ System.out.println("Rahuldav"); }
            else if (number==4){ System.out.println("HEA"); }       
            else if (number==5){ System.out.println("Tubli"); }             
        }
        else { System.out.println("Viga"); }
        
        //Реализация на SWITCH.
        switch(number) {    
            case 1: System.out.println("Nork"); break;
            case 2: case 3: System.out.println("Rahuldav");break;
            case 4: System.out.println("HEA");break;
            case 5: System.out.println("Tubli");break;
            default: System.out.println("Viga");break;    
        }    
        }
        }    
    
    

