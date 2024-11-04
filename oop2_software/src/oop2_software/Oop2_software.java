/*
Deniss Stepanjuk EDTR31

Программное обеспечение:
Создайте абстрактный класс Software
Создайте производные классы:  Freeware (название, производитель, дата установки), Shareware (название, производитель, дата установки, срок бесплатного использования), CommercialSoftware (название, производитель, цена, дата установки, срок использования)
Создайте массив из n видов программного обеспечения или список ArrayList
Необходимо вывести полную информацию из массива на экран, а также организовать поиск программного обеспечения, которое допустимо использовать на текущую дату, по типу ПО и названию (фрагменту названия), производителю
Используй текстовый файл для хранения информации ПО
 */
package oop2_software;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Deniss
 */
public class Oop2_software {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        List<Software> books=SoftwareDAO.softwares;
        List<Software> kroxa=new ArrayList();

         

        
        int menu;
 

        do{
        
        System.out.println("1) Вывести полную информацию из массива на экран.");
        System.out.println("2) Поиск программного обеспечения.");
        System.out.println("4) Выход.");
        System.out.println("Введите действие:");
        menu = scn.nextInt();
        scn.nextLine();
        //выбор между действиями
        switch (menu){
            case 1:{ 
                for (Software b : books)
                    System.out.println(b);    
                menu = 4;
                break;}   

            // Выводим список из ПО которое можно использовать (Freeware можно использовать всегда)
            // и задаем критерии поиска для списка
            
            case 2:{ 
                boolean idBool = setBool("Тип ПО");
                String id = write("Тип ПО", idBool);
                
                
                boolean typeBool= setBool("title");
                String type = write("title", typeBool);

                boolean titleBool= setBool("developer");
                String title = write("developer", titleBool);
                
               
                
                kroxa= SoftwareDAO.findByCriteries(idBool, typeBool, titleBool, id, type, title);
                System.out.println("По вашему запросу найдено: ");
                for (Software b : kroxa)
                    System.out.println(b); 
                menu = 4;
                break;}
            
            case 4: break;
            
            default: System.out.println("Viga");
        }
        
        }
    while (menu!=4);
        
     
    }


// функция для присваения значения буулеану
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
    
    // функция для присваения значения переменной Стринг

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
    

