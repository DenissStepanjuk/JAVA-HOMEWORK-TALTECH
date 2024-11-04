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
public class Trapezoid implements IShape,IShape2{
    
    
    private Point A;
    private Point B;
    private Point C;
    private Point D;
    private Point E;
    
    
    public Trapezoid() {
        this.A = new Point(0,0);
        this.B = new Point(2,4);
        this.C = new Point(10,4);
        this.D = new Point(12,0);  
        this.E = new Point(B.getX(),A.getY()); 
    }


    public Trapezoid(Point A, Point B,Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = new Point(B.getX(),A.getY());         
    }    

    @Override
    public double getArea() {
        double sideBC = Math.sqrt(Math.pow(B.getX()-C.getX(), 2)+Math.pow(B.getY()-C.getY(), 2));
        double sideDA = Math.sqrt(Math.pow(D.getX()-A.getX(), 2)+Math.pow(D.getY()-A.getY(), 2));
        double Height=Math.sqrt(Math.pow(E.getX()-B.getX(), 2)+Math.pow(E.getY()-B.getY(), 2));
        double S = ((sideBC+sideDA)*0.5)*Height;
        return S;
    }

    @Override
    public double getPerimetr() {
        double sideAB = Math.sqrt(Math.pow(A.getX()-B.getX(), 2)+Math.pow(A.getY()-B.getY(), 2));
        double sideBC = Math.sqrt(Math.pow(B.getX()-C.getX(), 2)+Math.pow(B.getY()-C.getY(), 2));
        double sideCD = Math.sqrt(Math.pow(C.getX()-D.getX(), 2)+Math.pow(C.getY()-D.getY(), 2));
        double sideDA = Math.sqrt(Math.pow(D.getX()-A.getX(), 2)+Math.pow(D.getY()-A.getY(), 2));
        double P = sideAB+sideBC+sideCD+sideDA;
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
        return "Trapezoid:" + "H = " + getHeight() + " S="+getArea()+" P="+getPerimetr()+"Lenght of side ="+getLenghtOfSide();
    }    
}
