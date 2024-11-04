/*
 * Передаём 4 точки на декартовой системе координат.
 * Получаем длинны отрезков между точкам, а так же площадь и периметр
 * фигур образованных точками.
 */
package dlinna;

/**
 * @author Deniss
 */
public class Dlinna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Цикл while не помню для чего, но на работу он никак не влияет.
        // Похоже что это отдельное задание.
        int y = 1, x = 1;
        while (x<10 || y>0){
            x = x*2;
            y--;
            System.out.println("22"); }
        
        //Ввод координат точек ABCD.
        int x1, x2, x3, x4, y1, y2, y3, y4;
        x1 = 0; y1 = 0;
        x2 = 3; y2 = 0;
        x3 = 0; y3 = 4;
        x4 = 3; y4 = 4;
        /**
         * Обьявляем переменные сторон, периметров, площадей, расчитываем
         * их через написанные ниже методы и выводим в консоль результаты
         */
        double ab,ac,ad,p_abc,p_abd,p_acd,pindala_abc,pindala_abd,pindala_acd;
        // Расчитываем и выводим длинны отрезков.
        ab=leng(x1,y1,x2,y2);
        ac=leng(x1,y1,x3,y3);
        ad=leng(x1,y1,x4,y4);
        System.out.println("ab = "+ab);
        System.out.println("ac = "+ac);
        System.out.println("ad = "+ad);
        // Расчитываем и выводим периметры треугольников.
        p_abc = perim(x1,y1,x2,y2,x3,y3);
        p_abd = perim(x1,y1,x2,y2,x4,y4);
        p_acd = perim(x1,y1,x3,y3,x4,y4);
        System.out.println("perimetr abc = "+p_abc);
        System.out.println("perimetr abd = "+p_abd);
        System.out.println("perimetr acd = "+p_acd);
        // Расчитываем и выводим площади треугольников.
        pindala_abc = area(x1,y1,x2,y2,x3,y3);
        pindala_abd = area(x1,y1,x2,y2,x4,y4);
        pindala_acd = area(x1,y1,x3,y3,x4,y4);
        System.out.println("Pindala abc = "+pindala_abc);
        System.out.println("Pindala abd = "+pindala_abd);
        System.out.println("Pindala acd = "+pindala_acd);
    }
    /**
     * метод расчитывает длинну по формуле
     * @return возвращвает значение длинны
     */
    public static double leng (int x1, int y1, int x2, int y2){
        double l;
        l = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
        return l;
    }
     /**
     * метод расчитывает периметр по формуле
     * @return возвращвает значение периметра
     */
    public static double perim (int x1, int y1, int x2, int y2, int x3, int y3){
        double p;
        p = leng(x1,y1,x2,y2)+leng(x2,y2,x3,y3)+leng(x1,y1,x3,y3);
        return p;    
    }
        /**
     * метод расчитывает площадь по формуле
     * @return возвращвает значение площади
     */
    public static double area (int x1,int y1, int x2,int y2, int x3,int y3){
        double area;
        double perimetr = perim(x1,y1,x2,y2,x3,y3)/2;
        area = Math.sqrt(perimetr*(perimetr-leng(x1,y1,x2,y2))*(perimetr-leng(x1,y1,x3,y3))*(perimetr-leng(x2,y2,x3,y3)));
        return area;    
    }    
}
    

