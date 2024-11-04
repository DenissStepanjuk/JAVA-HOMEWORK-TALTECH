/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_7;

/**
 *
 * @author Deniss
 */
public class UL2 {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        for(int i =2; i <=30; i +=1){
            int count=0;
            System.out.println(ANSI_RED+"Для числа: "+ ANSI_RESET +i);
            int g =i;
            max = 0;
            do {
            if (g%2==0){
            g/=2;
            count+=1;
            System.out.println("Точка высоты: "+ g);
            if (max<g){
            max = g;
            }
            }
            
            else{
            g=(g*3+1)/2;
            count+=1;
            System.out.println("Точка высоты: "+ g);
            if (max<g){
            max = g;
            }
            }
            }
            while(g!=1);
        System.out.println(ANSI_GREEN+"Кол-во точек: " +ANSI_RESET+ count);
        System.out.println(ANSI_GREEN+"Максимум: " +ANSI_RESET+ max);
        
        }
    }
    
}
