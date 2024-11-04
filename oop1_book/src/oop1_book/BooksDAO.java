/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop1_book;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deniss
 */
public class BooksDAO {
    public static List<Book> books=new ArrayList();
    
        static{
        try {
            
            Scanner scn = new Scanner (new FileReader("Books.csv"));
            String title = scn.next();
            while (scn.hasNext()){
                String[] line = scn.nextLine().split(";");
                if (line.length==6){
                Book book = new Book(line[0],line[1],line[2],line[3],Double.parseDouble(line[4].replace(',', '.')),Integer.parseInt(line[5]));
                books.add(book);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BooksDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    
        }
        
        public static List<Book> findByType(String type){
            List<Book> findbooks=new ArrayList();
            for (Book b : books)
                if (b.getType().toUpperCase().equals(type.toUpperCase())){
                    findbooks.add(b);}
            return findbooks;
        }
        
        
                
        public static List<Book> findByPrice(Double min, Double max){
            List<Book> findbooks=new ArrayList();
            for (Book b : books)
                if (b.getPrice() >= min && b.getPrice() <= max){
                    findbooks.add(b);}
            return findbooks;
        }
        
        
        
        //*Функция поиска по критиреям.
        //булеаны показывают по каким критериям искать, остальные вводные переменные это переменные сравнения
            public static List<Book> findByCriteries(boolean idBool, boolean typeBool, boolean titleBool, boolean authorBool, boolean priceBool, boolean qtyBool,
                    String id, String type, String title, String author, Double price, int qty){
            List<Book> findbooks=new ArrayList();
            
            for (int i = 0; i < books.toArray().length; i++) {
                
                boolean block = true;
                
                if (idBool){
                    
                    if (books.get(i).getId().toUpperCase().contains(id.toUpperCase()) && block){
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }
                    
                if (typeBool){
                    if (books.get(i).getType().toUpperCase().contains(type.toUpperCase()) && block){
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }                
            
                if (titleBool){
                    if (books.get(i).getTitle().toUpperCase().contains(title.toUpperCase()) && block){
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }
                
                
                if (authorBool){
                    if (books.get(i).getAuthor().toUpperCase().contains(author.toUpperCase()) && block){
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }                
                
                if (priceBool){
                    
                    if (books.get(i).getPrice().equals(price) && block){
                        
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }                   
                
                if (qtyBool){
                    if (books.get(i).getQty()== qty && block){
                        findbooks.add(books.get(i));
                    }
                    else{block = false;findbooks.remove(books.get(i));}
                    }                    
                
}
            
            
            
            //Удаляем повторы
            if (findbooks.toArray().length>1){
                for (int i = 0; i < findbooks.toArray().length-1; i++) {
                    if (findbooks.get(i).equals(findbooks.get(i+1))){
                        findbooks.remove(findbooks.get(i));
                }
            }
            }
            return findbooks;
        }
        
        
        

        
}
