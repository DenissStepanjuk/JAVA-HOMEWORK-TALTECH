/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deniss
 */
public class Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Pi_Leibnic=0;
        double Pi_Nilakant=3;
        int a = 2,b=3,c=4,z=1,l=1;
        for (int i=0;i<500;i+=1){
            Pi_Nilakant+=z*(4.0/((a*b*c)));
            z*=-1;
            a += 2;
            b += 2;
            c += 2;
        }
        Pi_Nilakant=Math.round(Pi_Nilakant*100000000)/100000000.0;
        System.out.println("Число Пи с помощью ряда Нилаканта"
                + "(8 знаков после запятой):"+Pi_Nilakant);
        z=1;
        for (int i=0;i<500000000;i+=1){
            Pi_Leibnic+=z*(4.0/l);
            z*=-1;
            l+=2;
        }
        Pi_Leibnic=Math.round(Pi_Leibnic*100000000)/100000000.0;
        System.out.println("Число Пи с помощью ряда Лейбница"
                + "(8 знаков после запятой):"+Pi_Leibnic);
        
    }
    
}
