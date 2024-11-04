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
public class Triangle implements IShape,IShape2{
    
    private Point A;
    private Point B;
    private Point C;
    private Point D;

    
    
    public Triangle() {
        this.A = new Point(0,0);
        this.B = new Point(5,5);
        this.C = new Point(10,0);
        this.D = new Point(B.getX(),A.getY()); 
    }


    public Triangle(Point A, Point B,Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = new Point(B.getX(),A.getY());      
    }    
    @Override
    public double getArea() {
        double sideAC = Math.sqrt(Math.pow(A.getX()-C.getX(), 2)+Math.pow(A.getY()-C.getY(), 2));
        double Height=Math.sqrt(Math.pow(D.getX()-B.getX(), 2)+Math.pow(D.getY()-B.getY(), 2));
        double S =sideAC*Height*0.5;
        return S;
    }

    @Override
    public double getPerimetr() {
        double sideAB = Math.sqrt(Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2));
        double sideBC = Math.sqrt(Math.pow(B.getX()-C.getX(), 2)+Math.pow(B.getY()-C.getY(), 2));
        double sideAC = Math.sqrt(Math.pow(A.getX()-C.getX(), 2)+Math.pow(A.getY()-C.getY(), 2));
        double P = sideAB+sideBC+sideAC;
        return P;
    }

    @Override
    public double getHeight() {
             
        double Height=Math.sqrt(Math.pow(D.getX()-B.getX(), 2)+Math.pow(D.getY()-B.getY(), 2));
        return Height;
    }

    @Override
    public double getLenghtOfSide() {
        double side = Math.sqrt(Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2));
        return side;
    }
    
    @Override
    public String toString() {
        return "Triangle:" + "H = " + getHeight() + " S="+getArea()+" P="+getPerimetr()+"Lenght of side ="+getLenghtOfSide();
    }      
}
