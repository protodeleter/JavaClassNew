package Parallelogram;

import Point.Point;

public class Parallelogram {

    private Point bottomLeft;
    private Point topRight;
    private Point topLeft;

    private int len;


    public Parallelogram(Point bottomLeft, Point topRight, Point topLeft) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.topLeft = topLeft;
        this.len = topRight.getX() - topLeft.getX();
    }


    public Parallelogram(Point bottomLeft, Point topRight, int len) {

        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.topLeft.setY(topRight.getY());
        this.topLeft.setX(bottomLeft.getX());
        this.len = len;

    }

    public Parallelogram(Parallelogram o) {
        this.bottomLeft = o.bottomLeft;
        this.topLeft = o.topLeft;
        this.len = o.len;
    }


    public int getLen() {
        return len;
    }

    public Point getBottomLeft() {
        return this.bottomLeft;
    }

    public Point gettopRight() {
        return this.topRight;
    }

    public Point gettopLeft() {
        return this.topLeft;
    }

    public int getArea() {


        return (this.topRight.getX() - this.topLeft.getX()) * (this.topRight.getY() - this.bottomLeft.getY());
    }

    public void move(int deltaX, int deltaY) {

        bottomLeft.setX(bottomLeft.getX() + deltaX);
        bottomLeft.setY(bottomLeft.getY() + deltaY);

        topLeft.setX(topLeft.getX() + deltaX);
        topLeft.setY(topLeft.getY() + deltaY);

        topRight.setX(topRight.getX() + deltaX);
        topRight.setY(topRight.getY() + deltaY);
    }

    public String toString() {
        return "The Rectangle:\n" +
                "Point bottom-left:\n" +
                "(" + bottomLeft.getX() + "," + bottomLeft.getY() + ")\n" +
                "Point top-right:\n" +
                "(" + topRight.getX() + "," + topRight.getY() + ")\n" +
                "Length base:\n" +
                this.len;
    }
}
