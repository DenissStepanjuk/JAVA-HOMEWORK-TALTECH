/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktika_9;

import java.util.Scanner;
import java.util.Arrays;


/**
 *
 * @author Deniss
 */
public class Praktika_9 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //меню
        Scanner scn = new Scanner(System.in);
        String text;
        int menu;
        boolean choice = false;

        
        do{
        
        System.out.println("1) Вывод предложения в оригинале, в верхнем или нижнем регистре.");
        System.out.println("2) Вывод количества слов в предложении.");
        System.out.println("3) Вывод самого короткого и самого длинного слова.");
        System.out.println("4) Вывод отсортированных слов в порядке возрастания или убывания.");
        System.out.println("5) Поиск слова в  предложении.");
        System.out.println("6) Вывести все слова, у которых первая и последняя буквы одинаковые.");
        System.out.println("7) Вывести слова, которые являются анаграммами, палиндромами.");
        System.out.println("8) Выход.");
        System.out.println("Введите текст:");
        text = scn.nextLine();
        String [] words = text.split(" ");
        System.out.println("Введите действие:");
        menu = scn.nextInt();
        
        //выбор между действиями
        switch (menu){
            case 1:{ 
                System.out.println("1) Вывод предложения в оригинале.");
                System.out.println("2) Вывод предложения в верхнем регистре.");
                System.out.println("3) Вывод предложения в нижнем регистре.");
                System.out.println("4) Выход.");
                menu = scn.nextInt();
                registr (menu, text);

                break;}   
            case 2:{ 
                System.out.println("количество слов в предложении:" +words.length);
                break;}
            case 3:{ 
                int max = 0;
                String max_word = " ";
                int min = 15;
                String min_word = " ";
                for (String e :words){
                    if (max < e.length()){
                        max = e.length();
                        max_word = e;
                }
                    if (min > e.length()){
                        min = e.length();
                        min_word = e;
                }                    
                    
                }
                System.out.println("Самое короткое слово: "+min_word);
                System.out.println("Самое длинное слово: "+max_word);
                break;}
            case 4:{ 
                
                System.out.println("1) Вывод слов по возрастанию.");
                System.out.println("2) Вывод слов по убыванию.");
                System.out.println("3) Выход.");
                menu = scn.nextInt();
                switch (menu){
                    case 1:{ 
                        choice = true;
                        sortArr(words,choice);
                            break;}
                    case 2:{ 
                        choice=false;
                        sortArr(words,choice);
                            break;}
                    case 3: break;
            
                    default: System.out.println("Viga");
                        
                        }                

                break;}
            case 5:{ 
                
                System.out.println("Введите слово для поиска: "+scn.nextLine());
                String search = scn.nextLine();
                
                searchWord(words, search);
                break;}
            case 6:{ 
                //Если буквы одинаковые, функция возвращает true, в цикле функция проверяет каждое слово.
                for (String e: words){
                    
                    if (firstAndLastLetter(e)){
                        System.out.println(ANSI_GREEN+"Cлово, у которого первая и последняя буквы одинаковые: "+ANSI_RESET+e);
                        
                    }
                    
                
                }
                
                
                
                break;}
            case 7:{ 
                
                for (String e: words){
                    
                    if(palindrom(e)){
                        System.out.println(ANSI_GREEN+"Палиндром: "+ANSI_RESET+e);
                    
                    }
                    
                }
                
                for (String e: words){
                    for (String r: words){
                        if(anagramma(e,r)){
                            System.out.println(ANSI_GREEN+"Анаграмма: "+ANSI_RESET+e+" / "+ r);
                    
                    }
                    }
                }
                
                
                
                break;}
            case 8: break;
            
            default: System.out.println("Viga");
        }
        scn.nextLine();
        }
    while (menu!=8);
        }
    
    //метод преобразования регистра
    static void registr (int menu, String text){
        switch (menu){
            case 1:{ 
                System.out.println(text);
            break;}
            case 2:{ 
                System.out.println(text.toUpperCase());
            break;}
            case 3:{ 
                System.out.println(text.toLowerCase());
            break;}
            case 4: break;
            
            default: System.out.println("Viga");
                        
                        }
    }
    //метод сортирующий массив
    static String [] sortArr(String [] Arr, boolean choice){
        for(int i = Arr.length-1; i > 0;i-=1){
            
        for(int j = 0; j < i; j+=1){
            
            if(Arr[j].length() > Arr[j+1].length()){

                String temp = Arr[j];
                Arr[j] = Arr[j+1];
                Arr[j+1] = temp;
            }
        }
        }
            if (choice==true){
                System.out.println("Отсортированые слова по убыванию: ");
                for(String e: Arr){
                    System.out.println(e);
                }
            }
            if (choice==false){
                System.out.println("Отсортированые слова по возрастанию: ");
                for(int i = Arr.length-1; i >= 0;i-=1){
                    System.out.println(Arr[i]);
                }
            }

        return Arr;
        
    }
    
    
    
    //метод находит слово
    static void searchWord(String [] Arr, String word){
        int length = Arr.length;
        for (int i=0;i<length;i++){
            if (Arr[i].equals(word)){
                System.out.print(ANSI_RED+Arr[i]+" "+ANSI_RESET);
            }
            else{
                System.out.print(Arr[i]+" ");
            }
            
            
        }
        System.out.print("\n");
        
    }
    //сравнивает первую и последнюю буквы
    static boolean firstAndLastLetter(String word){
        int length = word.length();
        char symbol_1 = word.charAt(0);
        char symbol_2 = word.charAt(length-1);
        if( symbol_2 == symbol_1){
            return true;
        }
        else {
            return false;
        }

        
    }   
        //метод для поиска палиндромов
        static boolean palindrom(String word){
        int length = word.length();
        char [] symbols = word.toCharArray();
        boolean answer = false;
        int count = length-1;
        
        for (int i = 0;i<=length/2;i++){
            //System.out.println("i: "+symbols[i]+"     count:  "+symbols[count]);
            answer =symbols[i] == symbols[count]?true:false;
            i = answer == false?length/2:i;
            count--;      
        }
        //System.out.println(answer);
        return answer;
        
    }  
        //метод для поиска анаграмм
        static boolean anagramma(String word_1, String word_2){
        word_1 = word_1.toLowerCase();
        word_2 = word_2.toLowerCase();
        int length_1 = word_1.length();
        int length_2 = word_2.length();
        char [] symbols_1 = word_1.toCharArray();
        char [] symbols_2 = word_2.toCharArray();
        //System.out.println("Symbols 1: "+symbols_1[4]);
        //System.out.println("Symbols 2: "+symbols_2[4]);
        Arrays.sort(symbols_1);
        Arrays.sort(symbols_2);
        //System.out.println("Symbols 1: "+symbols_1[3]);
        //System.out.println("Symbols 2: "+symbols_2[3]);
        boolean answer = true;
        
        
        if (length_1 == length_2 && word_1 != word_2) {
            for (int i = 0;i<=length_1-1;i++){
                answer = symbols_1[i]!=symbols_2[i]?false:answer;

            }
        }
        else{
            answer = false;
        }
        //System.out.println(answer);
        return answer;
        
    } 
    }    