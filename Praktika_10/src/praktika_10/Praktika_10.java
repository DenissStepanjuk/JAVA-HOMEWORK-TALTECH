/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_10;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Deniss
 */
public class Praktika_10 {
    public static final String ANSI_RESET = "\u001B[0m"; 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    
    public static void main(String[] args) {
        
        //объявление массивов и переменных
        int [][] position = new int [5][9];
        int [][] position_pc = new int [5][9];
        boolean attack = true;
        boolean attack_pc = true;
        Scanner scn= new Scanner(System.in);
        
        int [][] ship_4_1 = new int [2][4];
        int [][] ship_4_2 = new int [2][4];
        int [][] ship_3_1 = new int [2][3];
        int [][] ship_3_2 = new int [2][3];
        int [][] ship_2_1 = new int [2][2];
        int [][] ship_2_2 = new int [2][2];
        
        
        int [][] pc_ship_4_1 = new int [2][4];
        int [][] pc_ship_4_2 = new int [2][4];
        int [][] pc_ship_3_1 = new int [2][3];
        int [][] pc_ship_3_2 = new int [2][3];
        int [][] pc_ship_2_1 = new int [2][2];
        int [][] pc_ship_2_2 = new int [2][2];
        
        
        //System.out.println("vertical: "+index[0]+"   horizontal: "+index[1]);
        
        //присвоение кораблям координат
        ships(4, position, true,ship_4_1);
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
        

        ships(4, position, true,ship_4_2); 
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
           
        
        ships(3, position, true,ship_3_1);
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
        
        
        ships(3, position, true,ship_3_2); 
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
        
        
        ships(2, position, true,ship_2_1); 
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
         
        
        ships(2, position, true,ship_2_2); 
        
        ships(4, position_pc, false,pc_ship_4_1);    
        ships(4, position_pc, false,pc_ship_4_2);
        ships(3, position_pc, false,pc_ship_3_1);
        ships(3, position_pc, false,pc_ship_3_2);
        ships(2, position_pc, false,pc_ship_2_1);
        ships(2, position_pc, false,pc_ship_2_2);
        
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
        print (position_pc,"_");
        
        //бой
        do{
        attack = true;
        attack_pc = true;
        attack (position_pc, true);
        attack (position, false);
        
        System.out.println(ANSI_RED+"     1   2   3   4   5   6   7   8   9 "+ANSI_RESET);
        print (position,"¯");
        line(36);
        print (position_pc,"_");   
        
        for(int i = 0;i<5;i++){
            for(int j = 0; j<9;j++){
                attack = position[i][j] == 1?false:attack;
                attack_pc = position_pc[i][j] == 1?false:attack_pc;
            }
        
            }
        
        kill (position,ship_4_1,4);
        kill (position,ship_4_2,4);
        kill (position,ship_3_1,3);
        kill (position,ship_3_2,3);
        kill (position,ship_2_1,2);
        kill (position,ship_2_2,2);

        
        kill (position_pc,pc_ship_4_1,4);
        kill (position_pc,pc_ship_4_2,4);
        kill (position_pc,pc_ship_3_1,3);
        kill (position_pc,pc_ship_3_2,3);
        kill (position_pc,pc_ship_2_1,2);
        kill (position_pc,pc_ship_2_2,2);        
        
        
        }
 
        while(attack == false && attack_pc == false);
        
        if (attack==true){
            System.out.println(ANSI_GREEN+"PC WIN"+ANSI_RESET);
        }
        if (attack_pc==true){
            System.out.println(ANSI_GREEN+"YOU WIN"+ANSI_RESET);
        }
    }
    
    //метод меняет значение в массиве куда мы выстрелили
    //выводит сообщение об полном уничтожении
    static void kill (int [][]position,int [][]ship,int limit){
        boolean kill=true;
        /////////////////////////////////////////////////////////////////////////////////
        
        for (int j = 0;j<limit;j++){
            kill = position[ship[0][j]][ship[1][j]]==2?kill:false;
                
            }
        
        if (kill){
            System.out.println(ANSI_YELLOW+"Ship "+limit+" was killed"+ANSI_RESET);
        }
    }
    
    // метод производит аттаку/выстрел
    static void attack (int [][] position, boolean fill){
        Random rnd = new Random();
        int [] index = new int [2];

        if (fill == true){
            System.out.println(ANSI_RED+"Attack: "+ANSI_RESET);
            index = enterIndex();   
            if(position [index [0]] [index [1]] == 1){
                System.out.println(ANSI_RED+"YOU HIT"+ANSI_RESET);
            }
            else{
                System.out.println(ANSI_RED+"YOU MISS"+ANSI_RESET);
            }            
            }
        
        if (fill == false){
            index [0] = rnd.nextInt(5);
            index [1] = rnd.nextInt(9);
            if(position [index [0]] [index [1]] == 1){
                System.out.println(ANSI_RED+"PC HIT"+ANSI_RESET);
            }
            else{
                System.out.println(ANSI_RED+"PC MISS"+ANSI_RESET);
            }              
            }

        position [index [0]] [index [1]] = 2;
    }
    
    // метод для вывода поля.
    static void print (int [][] position, String text){
        String [] letters = {"A","B","C","D","E"};
        for(int i = 0;i<5;i++){
            System.out.print(ANSI_BLUE+letters[i]+": "+ANSI_RESET);
            for(int j = 0; j<9;j++){
                if (position[i][j] == 0){
                    spaceText(text, 1,text,ANSI_BLACK);
                }
                else if (position[i][j] == 1){
                    spaceText("@", 1,text,ANSI_GREEN);
                }
                else{
                    spaceText("+", 1,text,ANSI_RED);
                }
                
            }
            System.out.print("|\n");
        }
    }
    //метод для записи координат корабля в массив
    static void ships(int limit, int [][] position, boolean fill, int [][] ship){
        String direction = " ";
        boolean repeat = false;
        Random rnd = new Random();
        Scanner scn= new Scanner(System.in);
        
        
        
        do{
        int count = 0;
        int [] index = new int [2];
        boolean check_v = true;
        boolean check_h = true;
        
        
        if (fill == true){
            System.out.println("Class of ship "+limit);
            index = enterIndex();
            System.out.println("Verical or horizontal: [v/h]");
            direction = scn.nextLine();            
            }
        
        if (fill == false){
            index [0] = rnd.nextInt(5);
            index [1] = rnd.nextInt(9);
            int dir = rnd.nextInt(2);
            if (dir == 0){
                direction = "v";
                }
            if (dir == 1){
                direction = "h";
            }
            }
  
        // vertical check
        if (direction.equals("v") && (5 - index[0])>=limit){
        for (int i = index [0];i<index[0]+limit;i++){
            check_v = position [i][index[1]]==0?check_v:false;
            
        }
}
        //horizontal check
        if (direction.equals("h") && (9 - index[1])>=limit){
        for (int j = index [1];j<index[1]+limit;j++){
            check_h = position [index[0]] [j] == 0?check_h:false;
            
        }
    }
        //vertical
        if (direction.equals("v") && (5 - index[0])>=limit && check_v == true){
        for (int i = index [0];i<index[0]+limit;i++){
            position [i][index[1]]=1;
            
            ship [0][count]= i;
            ship [1][count]= index[1];
            
            count++;
            
            repeat = true;
        }
} 
        
        //horizontal
        else if (direction.equals("h") && (9 - index[1])>=limit && check_h == true){
        for (int j = index [1];j<index[1]+limit;j++){
            position [index[0]] [j] = 1;
            
            ship [0][count]= index[0];
            ship [1][count]= j;
            
            count++;            
            
            repeat = true;
        }
    }
        else{
            repeat = false;
            if (fill == true){
                System.out.println("Viga");
                System.out.println("On your vertical way another ship: "+check_v);
                System.out.println("On your horizontal way another ship: "+check_h);
            }
            
        }
    }
        while(repeat != true);
        }    
    
    
    
    // ввод кооординат(буквенно-цифровое обозначения переводит в адресс массива)
    static int [] enterIndex(){
        int [] variable = new int [2];
        Scanner scn= new Scanner(System.in);
        int count = 0;
        boolean check_letters = false;
        boolean check_numbers = false;
        char [] letters = {'a','b','c','d','e'};
        char [] numbers = {'1','2','3','4','5','6','7','8','9'};
        
        
        do{
        System.out.print("Enter index [A6]: ");
        String index = scn.nextLine();
        index = index.toLowerCase();
        char [] symbols = index.toCharArray();
        
        if (index.length() == 2){
        
        for (char e : letters){
        variable[0] = symbols[0]==e?count:variable[0];
        check_letters = symbols[0]==e?true:check_letters;
        count ++;
        }
        count = 0;
        for (char e : numbers){
        variable[1] = symbols[1]==e?count:variable[1];
        check_numbers = symbols[1]==e?true:check_numbers;
        count ++;
        }
        if (check_letters!=true){
            System.out.println("Wrong letter");
        }
        if (check_numbers!=true){
            System.out.println("Wrong number");
        }
        }
        else {
            System.out.println("Wrong. Amount of symbols: "+index.length()+", must be 2");
        }
        
        }
        while (check_letters!=true || check_numbers!=true);
        return variable;
        
    
    }      
    //метод для вывода
    static void spaceText(String text, int numb,String znak,String cvet){
        numb -= text.length();
        System.out.print("|"+znak+cvet+text+ANSI_RESET);
        for (int i = 0;i<=numb;i+=1){
            System.out.print(znak);
                }
}
        
        //отрисовка линии
    static void line(int table_width){
        for (int g = 0;g<=table_width+3;g+=1){
        System.out.print("-");
        }
        System.out.print("\n");
        }        
}