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
public class Praktika_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        int z=0;
        //Цикл 1
        for (int i =1;i<=10000;i+=1 ){
            
        //System.out.println("i////////////////////////////////////////////// : "+ i); 
        int summa_delitelei=0;
        int summa_delitelei_2=0;
        count+=1;
        // цикл 2
        for (int o =1;o<=count;o+=1 ){
        z= o;
        if (count%z==0){
        //System.out.println("o : "+ o);
        summa_delitelei+=o;
        
        }     
        }
        summa_delitelei-=z;
        //System.out.println("summa_delitelei:///////////////////////// "+ summa_delitelei); 
        // Цикл 3
        for (int p =1;p<summa_delitelei;p+=1 ){
        if (summa_delitelei%p==0){
        summa_delitelei_2+=p;
        ///System.out.println("p : "+ p);
        
        //System.out.println("summa_delitelei 2: "+ summa_delitelei_2); 
        
        
        }
        }
        if (count==summa_delitelei_2&&i!=summa_delitelei){
        System.out.println("Druzhestvinie: "+ i+"/"+summa_delitelei); 
        }
        if (count==summa_delitelei_2&&i==summa_delitelei){
        System.out.println("Sovershenoe: "+ i); 
        }        
        }
    }
    
}
