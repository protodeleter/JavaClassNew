package Point;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point o) {
        this.x = o.getX();
        this.y = o.getY();
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p) {
        return Math.abs( Math.sqrt( Math.pow( ( p.getX() - this.x ) , 2  ) + Math.pow( ( p.getY() - this.y ), 2 ) ) );
    }

    public boolean equals( Point p ) {
        return p.getX() == this.x && p.getY() == this.y;
    }

    public String toString() {
        String str = "";
        str += x + "," + y;
        return str;
    }
}
