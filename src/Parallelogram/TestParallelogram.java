package Parallelogram;

import Point.Point;

public class TestParallelogram {

    public static void main(String[] args) {


//        bottomLeft
//        topRight
//        topLeft
//        Point p1 = new Point(3, 5);
//        Point p2 = new Point(6, 9);
//        Point p3 = new Point(4, 9);
//
//        Parallelogram par1 = new Parallelogram(p1, p2, p3);
//        Parallelogram par2 = new Parallelogram(p1, p2, 2);
//        System.out.println(par1);
//        System.out.println(par2);
//
//        par1.move(-2, 3);   // שמאלה 2, למעלה 3
//        par2.move(4, -1);   // ימינה 4, למטה 1
//
//
//        System.out.println(par1);
//        System.out.println(par2);


        Point p1 = new Point(3, 5);
        Point p2 = new Point(6, 9);
        Point p3 = new Point(4, 9);

        Point p4 = new Point(p3);


        Parallelogram par1 = new Parallelogram(p1, p2, p3);
        Parallelogram par2 = new Parallelogram(p1, p2, p4);

        System.out.println(par1);

        System.out.println(par2);

        p3.setX(5);
        Parallelogram par3 = new Parallelogram(p1, p2, p3);
        System.out.println(par1);
        System.out.println(par2);
        System.out.println(par3);

        
    }
}
