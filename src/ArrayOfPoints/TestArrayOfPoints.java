package ArrayOfPoints;

import Point.Point;

import java.util.Scanner;

public class TestArrayOfPoints {

    public void testAdd(){
        ArrayOfPoints ap = new ArrayOfPoints();
        System.out.println(ap.add( new Point(2,1)));
    }

    public boolean testArrayOfPoints( ArrayOfPoints a, Point p ) {
        for (int i = 0; i < a.getPoints().length; i++) {
            if (a.getPoints()[i] != null && a.getPoints()[i].equals(p)) {
                return true;
            }
        }
        return false;
    }
}
