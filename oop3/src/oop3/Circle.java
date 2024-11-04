/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;



/**
 *
 * @author student
 */
public class Circle implements IShape,ICircle{
private Point center;
private Point inline;

public Circle() {
        this.center = new Point(0,0);
        this.inline = new Point(10,0);
    }


    public Circle(Point center, Point inline) {
        this.center = center;
        this.inline = inline;
    }
    
    
    @Override
    public double getArea() {
      //realiseeri pindala leidmine
        double R;
        double Area;
        R = Math.sqrt(Math.pow(center.getX()-inline.getX(), 2)+Math.pow(center.getY()-inline.getY(), 2));
        Area = 3.14 * Math.pow(R, 2);
        return Area;
    }

    @Override
    public double getPerimetr() {
         //realiseeri ümbermõõtu leidmine
        double R;
        double Perimetr;
        R = Math.sqrt(Math.pow(center.getX()-inline.getX(), 2)+Math.pow(center.getY()-inline.getY(), 2));
        Perimetr = 2 * 3.14 * R;
        return Perimetr; 
    }

    @Override
    public double getR() {
        // ringjoone raadius
        double R;
        R = Math.sqrt(Math.pow(center.getX()-inline.getX(), 2)+Math.pow(center.getY()-inline.getY(), 2));
        return R;
    }

    @Override
    public double getD() {
        //ringjoone diametr
        double R;
        double D;
        R = Math.sqrt(Math.pow(center.getX()-inline.getX(), 2)+Math.pow(center.getY()-inline.getY(), 2));
        D = 2 * R;
        return D;
    }

    @Override
    public String toString() {
        return "Circle:" + "r=" + getR() + " S="+getArea()+" P="+getPerimetr();
    }
    
    
    
}
