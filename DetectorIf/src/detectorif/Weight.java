/*
 * Перевод из кг в другие единицы измерения.
 */
package detectorif;

import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Weight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Обьявляем обьект Scanner.
        Scanner scn = new Scanner(System.in);
        // Выберите единицу измерения в которую переводить.
        System.out.println("Enter g,mg,tonn,tsenter");
        String tegevus = scn.nextLine();
        // Введите вес в кг.
        System.out.println("Enter weight kg:");
        int num_1 = scn.nextInt();
        // Иницилизируем переменную для ответа.
        double vastus = 0;
        
        // Исходя из выбраной операции выполняем действие.
        switch (tegevus) {
            case "g":vastus = num_1*1000;System.out.println("g: "+ vastus);break;
                
            case "mg":vastus = num_1*1000000;System.out.println("mg: "+ vastus);break;
        
            case "tonn":vastus = num_1/1000;System.out.println("tonn: "+ vastus);break;
       
            case "tsenter":vastus = num_1/100;System.out.println("tsenter: "+ vastus);break;
     
            default: System.out.println("viga");break; }
    }
}
