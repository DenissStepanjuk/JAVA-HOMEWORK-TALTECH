/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop3;

import java.util.Comparator;

/**
 *
 * @author Deniss
 */
public class AreaComparatorDown implements Comparator<IShape>{

    @Override
    public int compare(IShape t, IShape t1) {
        return (int) (t1.getArea() - t.getArea());
    }
    
}
