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
public class Seconds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * вводим кол-во сек через метод энтэр
         * получаем полные минуты,часы, кол-во лишних сек
         * Java метод может возвращать только одну переменную,
         * поэтому чтобы вернуть часы,минуты,секунды используется массив
         */
        int seconds = enter("seconds");
        fullMin(seconds);
        fullHour(seconds);
        secondsInLastMinute(seconds);
        int [] hour_min_sec = correctTimeFromSeconds(seconds);
        System.out.println(hour_min_sec[0]+" hour "+hour_min_sec[1]+" min "+hour_min_sec[2]+" sec");
    }
    static int enter(String text){
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter "+ text + ": ");
        int variable = scn.nextInt();
        return variable;
        }
    /**
     * Я так понял, что в задании мы ограничены сутками, поэтому каждый
     * метод проверяет чтобы кол-во секунд небыло больше возможного
     * @param seconds 
     * метод fullMin вычисляет кол-во полных мин делением на 60
     */
    static void fullMin(int seconds){
        if(seconds<=86400&&seconds>0){
            int full_min=seconds/60;
            System.out.println(seconds+" sec is "+full_min+" full min");
        }
        else{
            System.out.println("Mistake");
        }
    }
    /**
     * метод fullHour вычисляет кол-во полных часов делением на 3600
     * @param seconds 
     */
    static void fullHour(int seconds){
        if(seconds<=86400&&seconds>0){
            int full_hour=seconds/3600;
            System.out.println(seconds+" sec is "+full_hour+" full hours");
        }
        else{
            System.out.println("Mistake");
        }        
    }
    /**
     * местод secondsInLastMinute вычисляет кол-во секунд в полных минутах
     * и вычитает из общего кол-ва сек
     * @param seconds 
     */
    static void secondsInLastMinute(int seconds){
        if(seconds<=86400&&seconds>0){
            int sec_last_min=seconds-((seconds/60)*60);
            System.out.println("Last minute contains "+sec_last_min+" sec");
        }
        else{
            System.out.println("Mistake");
        }
    }   
    /**
     * метод correctTimeFromSeconds использует все те же расчеты
     * что были выше, но при расчёте мин из всего кол-ва мин
     * вычитается кол-во мин в часах.
     * возвращает массив[часы.мин.сек], так как Java метод
     * возвразает только одну переменную
     * @param seconds
     * @return 
     */
    static int[] correctTimeFromSeconds(int seconds){
        if(seconds<=86400&&seconds>0){
            int full_hour=seconds/3600;
            int full_min=(seconds/60)-((seconds/3600)*60);
            int sec_last_min=seconds-((seconds/60)*60);
            int [] return_variable = new int []{full_hour, full_min,sec_last_min};
            return return_variable;
            
        }
        else{
            System.out.println("Mistake");
            int [] return_variable = new int []{0, 0,0};
            return return_variable;
        }   
    }
    
}
