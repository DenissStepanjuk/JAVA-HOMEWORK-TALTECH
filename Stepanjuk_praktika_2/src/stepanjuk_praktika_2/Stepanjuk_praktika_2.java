/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stepanjuk_praktika_2;
import java.util.Scanner;
/**
 *
 * @author Deniss
 */
public class Stepanjuk_praktika_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter your sex (male/female): ");
        String sex = enter.nextLine(),male="male",female="female";
        int age,height,weight;
        System.out.print("Enter your age: ");
        age = enter.nextInt(); 
        System.out.print("Enter your height: ");
        height = enter.nextInt();  
        System.out.print("Enter your weight: ");
        weight = enter.nextInt();  
        double mid=0, r=0,kind, tihedus,ruumala,pindala,coef_1,y;
        if (sex.equals(male)){
            System.out.println("you are male");
            mid =(3*height-450+age)*0.250+45;
            r=((weight-mid)/weight)*100+15;
        } else if (sex.equals(female)){
            System.out.println("you are female");
            mid =(3*height-450+age)*0.225+40.5;
            r=((weight-mid)/weight)*100+22;
         
        } else {
            System.out.print("Wrong: uncorrect gender");
        }
        coef_1 = height*0.01;
        kind = weight/(Math.pow(coef_1, 2));
        tihedus =8.9*r+11*(100-r);
        ruumala = (1000*weight)/tihedus;
        y=(35.75-Math.log10(weight))/53.2;
        pindala=(Math.pow((1000*weight), y)*Math.pow(height, 0.3))/3118.2;
        System.out.println("Sex: "+sex+"\t Age: "+age+"\tHeight: "+height+"\tWeight"+weight);
        System.out.println("Ideaalne mass: "+mid+"\tRasvaprotsent :"+r+"\tKehamassi indeks: "+kind+"\tTihedus: "+tihedus);
        System.out.println("Ruumala: "+ruumala+"\tPindala: "+pindala);
        if(kind<18){
            System.out.println("Hinnang: kohn");
        }else if (kind>=18 && kind <=25){
            System.out.println("Hinnang: normaal");
        }else if (kind>25 && kind <=30){
            System.out.println("Hinnang: Ulekaal");
        }else{
            System.out.println("Hinnang: ei voi olla");
        }        
    }        
        // TODO code application logic here
    }
    

