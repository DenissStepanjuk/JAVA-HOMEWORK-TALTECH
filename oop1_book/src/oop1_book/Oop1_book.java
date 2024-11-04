/*
Deniss Stepanjuk EDTR31
 */
package oop1_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
//Ülesanne - Raamatud
//Loo klass Book, mis sisaldab välju, meetodeid get/ set (omadused), konstruktoreid, toString meetodit, ja (teine klass) meetodeid, mis realiseerivad järgmisi ülesandeid: 

//Näita  määratud kategooria (nt Database, Programming ...) raamatuid

//Näita raamatuid, mis kuuluvad teatud hinnaklassi (näiteks raamatu hind, vahemikus 15-30 eurot)

//Otsi raamatuid erinevate kriteeriumite järgi (nt autor, pealkiri, pealkirja fragment ...)

//Andmed on failis Books.csv

//Создайте класс Book, который содержит поля, методы get/set (свойства), конструкторы, метод toString и методы, реализующие следующие задачи:

//Отобразите книги определенной категории (например, Database, Programming ...)

//Отобразите книги, которые принадлежат определенному диапазону цен (например, книги стоимость, которых от 15 до 30 Евро)

//Осуществите поиск книг по нескольким критериям (например, по автору, названию, фрагменту названия...)
public class Oop1_book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menu
        List<Book> books=BooksDAO.books;
        List<Book> kroxa=new ArrayList();
        

            
          /*  
        kroxa = BooksDAO.findByCriteries(false, false, false, false, true, false, "SY333", "Hardware", "Ajax", "", 29.99, 0);
        for (Book b : kroxa)
            System.out.println(b);
        
        
        */
        
        
        
        
        
        //меню
        Scanner scn = new Scanner(System.in);
        String text;
        int menu;
        boolean choice = false;
        Double priceMax = 0.0;
        Double priceMin = 0.0;

        do{
        
        System.out.println("1) Отобразить книги определенной категории.");
        System.out.println("2) Отобразить книги в диапазону цен.");
        System.out.println("3) Осуществить поиск книг по нескольким критериям.");
        System.out.println("4) Выход.");
        System.out.println("Введите действие:");
        menu = scn.nextInt();
        scn.nextLine();
        //выбор между действиями
        switch (menu){
            case 1:{ 
                System.out.println("Отобразить книги определенной категории");
                System.out.println("Введите категорию:");
                
                text = scn.nextLine();
                kroxa = BooksDAO.findByType(text);
                for (Book b : kroxa)
                System.out.println(b);   
                menu = 4;
                break;}   
            case 2:{ 
                System.out.println("Введите минимальную цену (Double(0,0))");
                priceMin = scn.nextDouble();
                scn.nextLine();
                System.out.println("Введите максимальную цену (Double(0,0))");
                priceMax = scn.nextDouble();
                kroxa = BooksDAO.findByPrice(priceMin,priceMax);
                for (Book b : kroxa)
                System.out.println(b);   
                menu = 4;
                break;}
            case 3:{ 
                boolean idBool = setBool("id");
                String id = write("id", idBool);
                
                
                boolean typeBool= setBool("type");
                String type = write("type", typeBool);

                boolean titleBool= setBool("title");
                String title = write("title", titleBool);
                
                boolean authorBool= setBool("author");
                String author = write("author", authorBool);
                
                boolean priceBool= setBool("price");
                Double price = 0.0;
                if (priceBool){
                    System.out.println("Введите price?");
                    price = scn.nextDouble();
            }
                
                int qty = 0;
                boolean qtyBool= setBool("qty");
                if (qtyBool){
                    System.out.println("Введите qty?");
                    qty = scn.nextInt();
            }
                
                kroxa = BooksDAO.findByCriteries(idBool,typeBool, titleBool, authorBool, priceBool, qtyBool, id,  type,  title,  author,  price, qty);
                
                for (Book b : kroxa)
                System.out.println(b); 
                menu = 4;
                break;}
            
            case 4: break;
            
            default: System.out.println("Viga");
        }
        
        }
    while (menu!=4);
        
     
    }



    static boolean setBool(String text){
        String answer = "";
        Scanner scn = new Scanner(System.in);
        System.out.println("Использовать критерий " + text + "? (y/n)");
        answer = scn.nextLine();
            if (answer.equals("y")){
                return true;}
            else{
                return false;
            }
    }
    
    
        static String write(String text, boolean check){
            String answer = "";
            Scanner scn = new Scanner(System.in);

            if (check){
                System.out.println("Введите " + text + "?");
                answer = scn.nextLine();
            }
        
            return answer;
            }
    }
