package Rectangle;

import Point.Point;

//נאדין גבארין תז 206614802
//פבל נוסנוב 321867988


public class Rectangle {

    private Point bottomLeft;
    private Point topRight;
    private int height;
    private int width;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.width = Math.abs(topRight.getX() - bottomLeft.getX());
        this.height = Math.abs(topRight.getY() - bottomLeft.getY());
    }

    public Rectangle(Point bottomLeft, int width, int height) {
        this.bottomLeft = bottomLeft;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle o) {
        this.bottomLeft = o.bottomLeft;
        this.topRight = o.topRight;
        this.height = o.height;
        this.width = o.width;

    }

    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public void move(int deltaX, int deltaY) {

        bottomLeft.setX(bottomLeft.getX() + deltaX);
        bottomLeft.setY(bottomLeft.getY() + deltaY);

        topRight.setX(topRight.getX() + deltaX);
        topRight.setY(topRight.getY() + deltaY);
    }

    public Point getBottomLeft() {
        return this.bottomLeft;
    }

    public Point getTopRight() {
        return this.topRight;
    }

    public String toString() {
        return "The Rectangle: " +
                "Point bottom-left:" + " (" + this.bottomLeft.getX() + "," + this.bottomLeft.getY() + ") " +
                "Point top-right: " + " (" + this.topRight.getX() + "," + this.topRight.getY() + ") ";
    }

}
