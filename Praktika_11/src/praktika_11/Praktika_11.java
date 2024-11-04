/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_11;
import java.util.Random;
/**
 *
 * @author Deniss
 */
public class Praktika_11 {
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] month_names = {"January:","February:","March:",
            "April:","May:","June:","July:","August:","September:",
            "October:","November:","December:"};
        int [][]table = new int [12][];
        double average;
        int min = 0;
        int max = 0;
        
        
        //цикл создаёт строки в зубчатом массиве и заполняет все элементы температурой
        for (int i = 0;i<table.length;i++){
            table[i] = new int [month[i]];
            
            
            
            for (int o = 0;o<table[i].length;o++){
                table[i][o]=o+1+5;
                switch(i){
                    case 11:case 0:case 1:table[i][o]=rnd.nextInt(30)*-1;break;
                    case 2:case 3:case 4:table[i][o]=(rnd.nextInt(10)*(-1))+rnd.nextInt(15);break;
                    case 5:case 6:case 7:table[i][o]=rnd.nextInt(20)+10;break;
                    case 8:case 9:case 10:table[i][o]=(rnd.nextInt(10)*(-1))+rnd.nextInt(15);break;
                    
                }

            }
        }
        
        
        
        
        
        
        
        
        ////цикл находит минимум и максимум
        for (int i = 0;i<table.length;i++){
            for (int o = 0;o<table[i].length;o++){
                min = min>table[i][o]?table[i][o]:min;
                max = max<table[i][o]?table[i][o]:max;
            }
        }        
        
        
        
        
        
        
        
        ///цикл вырисовывает таблицу с помощью методов
        
        line(27);
        spaceText("Month/Day", 10);
        
        
        for (int i = 1;i<=31;i++){
            space (i,2,ANSI_RED);
        }
        spaceText("|Average:", 9);
        System.out.print("|\n");
        line(27);
        
        
        for (int i = 0;i<table.length;i++){
            average = 0;
            spaceText(month_names[i], 10);
            
            
            for (int o = 0;o<table[i].length;o++){
                average += table[i][o];
                if (table[i][o]==min){
                    space (table[i][o],2,ANSI_BLUE);
                }
                else if (table[i][o]==max){
                    space (table[i][o],2,ANSI_YELLOW);
                }                
                else {
                    space (table[i][o],2,ANSI_BLACK);
                }
                
                if (o+1==table[i].length){
                    System.out.print("|");
                    average/=table[i].length;
                    average=Math.round(average*100)/100.0;
                    String text = Double.toString(average);
                    if (table[i].length==30){
                        System.out.print("     ");
                    }
                    if (table[i].length==29){
                        System.out.print("          ");
                    }
                    spaceText(text,8);
                    System.out.print("|\n");
                    line(27);
                }
            }
        }
        System.out.println(ANSI_BLUE+"Min: "+min+"\nDate: "+ANSI_RESET);
        
        for (int i = 0;i<table.length;i++){
            for (int o = 0;o<table[i].length;o++){
               if(min==table[i][o]){
                   System.out.println((i+1)+"."+(o+1));
               }

            }
        }             
        
        
        
                System.out.println(ANSI_RED+"Max: "+max+"\nDate: "+ANSI_RESET);
        
        for (int i = 0;i<table.length;i++){
            for (int o = 0;o<table[i].length;o++){
               if(max==table[i][o]){
                   System.out.println((i+1)+"."+(o+1));
               }
            }
        }  
        
    }
    
    //методы для отцентровки значений массива в таблтце: 
    
    
    static void spaceText(String text, int numb){
        numb -= text.length();
        System.out.print("|"+ANSI_GREEN+text+ANSI_RESET);
        for (int i = 0;i<=numb;i+=1){
            System.out.print(" ");
                }

        }    
    
    static void space(int enter, int numb,String color){
        String text = Integer.toString(enter);
        numb -= text.length();
        System.out.print("| "+color+text+ANSI_RESET);
        for (int i = 0;i<=numb;i+=1){
            System.out.print(" ");
                }

        }    
    
    
        static void line(int table_width){
        for (int g = 0;g<=(table_width+5)*5+17;g+=1){
        System.out.print("-");
}
        System.out.print("\n");
        }
    
}
