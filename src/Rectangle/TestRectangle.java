package Rectangle;

import Point.Point;

//נאדין גבארין תז 206614802
//פבל נוסנוב 321867988


public class TestRectangle {
    public static void main(String[] args) {


        Point p6 = new Point(1, 5); // bottomLeft
        Point p7 = new Point(6, 9); // topRight

        Rectangle rec = new Rectangle(p6, p7);

        System.out.println("Areas of rec " + rec.getArea());

        System.out.println("rec object before moved  " + rec);

        rec.move(2, 0);

        System.out.println("rec object moved to " + rec);

        System.out.println("Rec perimeter " + rec.getPerimeter());


        Point p1 = new Point(3, 5);
        Point p2 = new Point(6, 9);
        Point p3 = new Point(p1);
        Rectangle r1 = new Rectangle(p1, p2);
        Rectangle r2 = new Rectangle(p1, p3);

        System.out.println(r1);
        System.out.println(r2);
        p1.setX(9);
        p1.setY(12);
        Rectangle r3 = new Rectangle(p2, p1);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

    }
}
