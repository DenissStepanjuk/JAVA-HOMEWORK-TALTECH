/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

/**
 *
 * @author Deniss
 */
public class Parallelogramm  implements IShape,IShape2 {
    
    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private Point E;
    
    
    public Parallelogramm() {
        this.A = new Point(0,0);
        this.B = new Point(2,4);
        this.C = new Point(10,4);
        this.D = new Point(8,0);  
        this.E = new Point(B.getX(),A.getY()); 
    }


    public Parallelogramm(Point A, Point B,Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = new Point(B.getX(),A.getY());         
    }
    

    @Override
    public double getArea() {
        double side = Math.sqrt(Math.pow(A.getX()-D.getX(), 2)+Math.pow(A.getY()-D.getY(), 2));
        double Height=Math.sqrt(Math.pow(E.getX()-B.getX(), 2)+Math.pow(E.getY()-B.getY(), 2));
        double Area = side * Height;
        return Area;
    }

    @Override
    public double getPerimetr() {
        double sideA = Math.sqrt(Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2));
        double sideB = Math.sqrt(Math.pow(B.getX()-C.getX(), 2)+Math.pow(B.getY()-C.getY(), 2));
        double P = 2* sideA + 2 * sideB;
        return P;
    }

    @Override
    public double getHeight() {
        
        double Height=Math.sqrt(Math.pow(E.getX()-B.getX(), 2)+Math.pow(E.getY()-B.getY(), 2));
        return Height;
    }

    @Override
    public double getLenghtOfSide() {
        double side = Math.sqrt(Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2));
        return side;
    }
    
    
    @Override
    public String toString() {
        return "Parallelogramm:" + "H=" + getHeight() + " S="+getArea()+" P="+getPerimetr()+"Lenght of side ="+getLenghtOfSide();
    }
}
