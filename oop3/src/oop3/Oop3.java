/*
 * Deniss Stepanjuk EDTR31

Luua klasside teek, mis koosneb geomeetrilistest kujunditest - ringjoon, romb, 
parallelogram, trapets, kolmnurk. Realiseerida pindala, ümbermõõdu, külgservade 
pikkuse, kõrguse, raadiuse, diameetri arvutusmeetodeid - rakendada liidesed. 
On vajalik realiseerida järgmised meetodid: pindala, ümbermõõdu 
(kõikide kujundite jaoks), kõrguse, külgservade pikkuse (hulknurkade jaoks), 
raadiuse, diameetri (ringjoone jaoks) arvutused. Tippude viitamiseks kasutada 
ristkoordinaatide süsteemi koordinaate.

Luua rakendus, kasutades klasside teek. Looge üks kollektsioon (List või Array) 
kujunditest, kus hoitakse kõikide geomeetriliste kujundite tüübid. Printige 
välja täpset informatsiooni iga kujundi kohta. Sorteerige kujundite loend 
pindala/ümbermõõdu kasvu/kahanemise järgi (kasutage 2 varianti: teek klasside 
meetodid ja lambda avaldised )
 */
package oop3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 *!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Так как в задании не указано как нужно реализовать вывод, то мной было принято рещение просто вывести информацию не прибегая к созданию меню.
 * Так же в задании сказанно "kasutage 2 varianti: teek klasside meetodid ja lambda avaldised", нет слов что они должны дублировать друг друга,
 * а лишь используйте 2 варианта. Поэтому первый вариант сортировки я применил для площади, а второй для периметра.
 * Так же ничего не сказано по поводу ввода пользователем данных.
 * Всё выполнено строго по т.з.
 * Так же у меня возникли трудности с переводом этих слов "külgservade pikkuse (hulknurkade jaoks)",
 * я это понял так, что мне нужно расчитать длинну боковой кромки (грани). Достаточно обширное и расплывчатое понятие.
 */
public class Oop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        List<IShape> shapes=new ArrayList();
        //shapes.add(new Circle(new Point(0,0),new Point(5,5) ));
        shapes.add(new Circle());
        shapes.add(new Romb());
        shapes.add(new Parallelogramm());
        shapes.add(new Trapezoid());
        shapes.add(new Triangle());
        System.out.println("Original:"); 
        System.out.println("______"); 
        for(IShape s : shapes)
         { 
             System.out.println(s);
         }
        
        Collections.sort(shapes, new AreaComparatorUp());
        System.out.println("______"); 
        System.out.println("Compare by Area Up:"); 
        System.out.println("______"); 
        for(IShape s : shapes)
         { 
             System.out.println(s);
         }
        
        Collections.sort(shapes, new AreaComparatorDown());
        System.out.println("______"); 
        System.out.println("Compare by Area Down:"); 
        System.out.println("______"); 
        for(IShape s : shapes)
         { 
             System.out.println(s);
         }
        
        
        
        Collections.sort(shapes, (IShape t,IShape t1)->{return (int) (t1.getPerimetr() - t.getPerimetr());});
        System.out.println("______"); 
        System.out.println("Compare by Perimetr Down:"); 
        System.out.println("______"); 
        for(IShape s : shapes)
         { 
             System.out.println(s);
         }    
        
        Collections.sort(shapes, (IShape t,IShape t1)->{return (int) (t.getPerimetr() - t1.getPerimetr());});
        System.out.println("______"); 
        System.out.println("Compare by Perimetr Up:"); 
        System.out.println("______"); 
        for(IShape s : shapes)
         { 
             System.out.println(s);
         }         
    }
    
}
