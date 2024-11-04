/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_8;
import java.util.Random;
/**
 *
 * @author Deniss
 */
public class Praktika_8 {
        static boolean growArr(int [] massiv){
            int previos_e = 0;
            for (int e :massiv){
                if (previos_e > e){
                    return false;
                
        }
                previos_e=e;
        }
        return true;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] massiv= new int [10];
        int count = 0;
        int count_max=0;
        int max = 0;
        int min = 20;
        int middle =0;
        int count_middle=0;
        int min_2 = 20;
        boolean sequence;
        for (int i = 0;i<10;i+=1){
            massiv[i]= rnd.nextInt(19)+1;
            System.out.println("["+i+"]: "+ massiv[i]);
        
        
        }
            System.out.println("Even numbers: ");
        
        for (int e :massiv){
            
            if (e%2==0){
            System.out.println("["+count+"]= "+ e);
            }
            if (max<e){
                max = e;   
            }
            if (min>e){
                min = e;
            }
            count+=1;
        }
        count = 0;
        for (int e :massiv){
            if (e == max){
                System.out.println("Element ["+count+"] is max");
                count_max+=1;
        }
            if(e != max && e != min){
                middle += e;
                count_middle +=1;
            }
            if(e!=min && min_2>e){
                min_2 = e;
            }
            count+=1;
            
        }
        
        middle/=count_middle;
        
        System.out.println("Amount of max elemets is "+count_max);
        System.out.println("max: "+max+"  min: "+ min);
        System.out.println("middle: "+middle);
        System.out.println("growing sequence: "+growArr(massiv));
        System.out.println("min 2: "+min_2);
    }
        // TODO code application logic here
    }

