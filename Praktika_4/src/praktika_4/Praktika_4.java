/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_4;
import java.util.Scanner;
/**
 *
 * @author Deniss
 */
public class Praktika_4 {
    public static void main(String[] args) {
        // TODO code application logic here
  /**
   * введите день,месяц,год
   */
    int day=enter("day");
    int month = enter("month");
    int year = enter("year");
    /**
     * получите проверку на корректность ввода даты,след.день и 
     * кол-во дней до нг
     */
    dateCorrectChek(day,month,year);
    nextDay(day,month,year);
    whenIsNewYear(day,month,year);
    }
    /**
     * метод ввода
     * @param text -поясняет что ввести надо
     * @return присваивает переменной введеное значение
     */
    static int enter(String text){
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter "+ text + ": ");
        int variable = scn.nextInt();
        return variable;
        
    
    }    
    /**
     * метод проверяет на корректность введеную дату
     * @param day
     * @param month
     * @param year 
     */
    static void dateCorrectChek(int day, int month,int year){
        /**
         * в массиве расположены количество дней в месяце по порядку
         */
        int [] day_limit = new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        /**
         * проверка месяца
         * проверка дня
         */
        if (month <= 12 && month > 0){
            if(day <= day_limit [month] && day>0){
                System.out.println(day+"."+month+"."+year+" is correct");
            }
            /**
             * проверка високосного года
             */
            else if(day==29&&month==2){
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.println(day+"."+month+"."+year+" is correct");
                }
                else{
                System.out.println(day+"."+month+"."+year+" is uncorrect");
                }
            }    
            
            else{
                System.out.println(day+"."+month+"."+year+" is uncorrect");
            }
        }
  
        else{
            System.out.println(day+"."+month+"."+year+" is uncorrect");
        }

    }  
    /**
     * метод вычисляющий след день
     * @param day
     * @param month
     * @param year 
     */
    static void nextDay (int day, int month,int year){
        int [] day_limit = new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        /**
         * проверка правильности дня и месяца
         * если день не последний, то +1 день и вывод
         * если день последний, а месяц нет, то выводим 1 число и месяц +1
         * если день и месяц последние, то выводмим новый год год+1
         */
        if (month <= 12 && month > 0){
            if (day<day_limit[month]&&day>0){
                System.out.println("Next day is "+(day+1)+"."+month);
        }
            else if(day==day_limit[month]&&month!=12){
                System.out.println("Next day is "+1+"."+(month+1)+"."+year);
        }
            else if(day==31&&month==12){
                System.out.println("Next day is new "+(year+1)+" year");
        }
            else{
                System.out.println("Mistake");
            }
        }
        else{
        System.out.println("Mistake");
        }
    }
    /**
     * метод считает кол-во дней до нг
     * Цикл ограничен 12, начало цикла это введеный месяц
     * Цикл складывает кол-во дней в месяце по порядку начиная с введеного месяца
     * вычитаем кол-во дней в этом месяце
     * если год високосный +1 день
     * @param day
     * @param month
     * @param year 
     */
    static void whenIsNewYear (int day, int month,int year){
        int [] day_limit = new int []{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int newYearAfter=0;
        if (month <= 12 && month > 0){
            if(day <= day_limit [month] && day>0){
                for (int i = month;i<=12;i+=1){
                    newYearAfter+=day_limit[i];
            }
            newYearAfter-=day;
            }
            else{
                System.out.println("Mistake");
        }
        }
    
        else{
        System.out.println("Mistake");
        }
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            newYearAfter+=1;
        }
        System.out.println("New year after "+newYearAfter+" days");
    }
}
    

    
