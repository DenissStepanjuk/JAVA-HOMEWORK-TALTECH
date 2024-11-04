/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_5;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Praktika_5 {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        // TODO code application logic here
        int table_width = 13;
        /**
         * Ввод данных
         */
        double credit = enter("money amount");
        double year_percent = enter("year percent");
        int term = enter ("payment term (month)");
        double month_percent = (year_percent/term)/100;
        double loan_payment = (credit*month_percent)/(1-(1/Math.pow(1+month_percent,term)));
        double main_part = 0;
        double percent = 0;
        double loan = 0;
        /**
         * С помощью методов создается начальная строчка таблицы
         */
        line(table_width);
        spaceText("Kuu",8);
        spaceText("Laenu algjaak",table_width);
        spaceText("Laenumakse",table_width);
        spaceText("Intressimakse",table_width);
        spaceText("Pohiosamakse",table_width);
        spaceText("Laenu Lopjaak",table_width);
        System.out.print("|\n");
        line(table_width);
        /**
         * Цикл производит расчёт значений и заполнение таблицы с помощью
         * методов
         */
        
        for (double i = 1;i<=term;i+=1){
            
            double percent_payment = credit * month_percent;
            double payment_main_part = loan_payment - percent_payment;
            percent += percent_payment;
            main_part += payment_main_part;
            loan += loan_payment;
            space(i,4);
            System.out.print(".kuu");
            space(credit,table_width);
            space(loan_payment,table_width);
            space(percent_payment,table_width);
            space(payment_main_part,table_width);
            
            credit -= payment_main_part;
            
            space(credit,table_width);
            System.out.print("|\n");

            line(table_width);
        }
        /**
         * С помощью методов создается финальная строчка таблицы
         */
        spaceText("Kokku",8);
        spaceText(" ",table_width);
        space(loan,table_width);
        space(percent,table_width);
        space(main_part,table_width);
        spaceText(" ",table_width);
        System.out.print("|\n");
        line(table_width);
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
     * Данный метод принимает число и ширину столбца, округляет число до 2
     * знаков после запятой, считает кол-во знаков в числе,
     * находит разницу и заполняет пробелами недостаюшие место чтобы
     * выравнять границы столбца
     * @param enter
     * @param numb 
     */
    static void space(double enter, int numb){
        enter=Math.round(enter*100)/100.0;
        String text = Double.toString(enter);
        numb -= text.length();
        System.out.print("|    "+ANSI_RED+text+ANSI_RESET);
        for (int i = 0;i<=numb;i+=1){
            System.out.print(" ");
                }

        }
    /**
     * Данный метод принимает текст и ширину столбца, считает кол-во знаков в тексте,
     * находит разницу и заполняет пробелами недостаюшие место чтобы
     * выравнять границы столбца
     * @param text
     * @param numb 
     */
    static void spaceText(String text, int numb){
        numb -= text.length();
        System.out.print("|    "+ANSI_GREEN+text+ANSI_RESET);
        for (int i = 0;i<=numb;i+=1){
            System.out.print(" ");
                }

        }
    /**
     * Данный метод рисует линию с помощью символа "-"
     * @param table_width 
     */
    static void line(int table_width){
        for (int g = 0;g<=(table_width+5)*5+18;g+=1){
        System.out.print("-");
}
        System.out.print("\n");
        }
}

