/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_6;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Deniss
 */
public class Praktika_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ь/меню
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int menu = 0, count =0;
        int chance=0, rnd_num=0;     
        int bik=0, korova=0;
        
        do{
        System.out.println("Enter 1,2,3:");
        menu = scn.nextInt();
        switch (menu){
            case 1:{ 
                //загадываем число и пытаемся угадать в цикле
                rnd_num=rnd.nextInt(15);
                do {
             
                    
                    System.out.println("random number: "+rnd_num);
                    System.out.println("Try:");
                    chance = scn.nextInt();  
                    count +=1;
                    if (rnd_num == chance){
                        System.out.println("Win. Score: "+count);
                    }
                    else{
                        System.out.println("Lose. Score: "+count);
                    }
                        
                        
                        
                
                }
                    while(rnd_num != chance);

                    count = 0;
                    break;}   
            case 2:{ 
                //1) В массив записал 4 рандомных значения (от 0 до 9)

////// Кроме адреса [3] (0-8)+1, чтобы нулем не было.
                int [] random= {rnd.nextInt(9),rnd.nextInt(9),rnd.nextInt(9),rnd.nextInt(8)+1};
                
                //2) В цикле 4 раза проверяем чтобы каждое число в массиве не было равно другому.

                //2.1) если цифры совпадают, то число в массиве перезаписывается на Рандомное.
               
                for (int g=0; g < 4; g+=1){
                if (random[0]==random[1]||random[0]==random[2]||random[0]==random[3]){
                
                    random[0]=rnd.nextInt(9);
                
                }
                if (random[1]==random[0]||random[1]==random[2]||random[1]==random[3]){
                
                    random[1]=rnd.nextInt(9);
                
                }
                if (random[2]==random[1]||random[2]==random[0]||random[2]==random[3]){
                
                    random[2]=rnd.nextInt(9);
                
                }                
                }
                
                //3) Рандомное число без повторения цифр = массив [3]*1000 + 
                //массив[2]*100+массив[1]*10+ массив[0]
                rnd_num = random[3]*1000+random[2]*100+random[1]*10+random[0];
                System.out.println("Guess next number: "+rnd_num);
                // В цикле вводим значение и проверяем на совпадение с заганым компьютером.
                //расчитываем кол-во коров и быков
                do{
                System.out.println("Try:");
                chance = scn.nextInt(); 
                int [] split_chance = split(chance);
                
                for(int i = 0; i < 4; i+=1){
                    if(split_chance[i]==random[i]){
                    //System.out.println(random[i]+"- bik");
                    bik+=1;
                    }
                    else if(split_chance[i]!=random[i]){
                    for(int j = 0; j < 4; j+=1){
                        if(split_chance[i]==random[j]){
                        System.out.println(random[j]+"- korova");
                        korova+=1;
                    }
                    }
                    }

                }
                
                
                System.out.println("korova: "+korova+"bik: "+bik);
                
                korova=0;
                bik=0;
                }
                while(rnd_num != chance);
                break; 
            
            }
            case 3: break; 
            default: System.out.println("Viga");
        }
        }
    while (menu!=3);
        }
    ///функция расщепляет число на отдельные числа для сравнения
        static int [] split(int number){
        int [] variable = new int [4];
        int num_1,num_2;
        for (int i = 0; i < 4;i+=1){
            num_1 = number/10;
            num_2= number - num_1*10;
            variable[i]=num_2;
            number/=10;
        }
        return variable;
        }
}