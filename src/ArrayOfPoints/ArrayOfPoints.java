package ArrayOfPoints;


import Point.Point;

import java.util.Arrays;


public class ArrayOfPoints {

    private final Point[] points;
    private final int MAX_SIZE = 10;
    private int size = 0;

    public ArrayOfPoints() {
        points = new Point[MAX_SIZE];
        size = 0;
    }

    public ArrayOfPoints(ArrayOfPoints other) {
        points = new Point[MAX_SIZE];
        size =  other.size;

        for (int i = 0; i < points.length; i++) {
            if (other.points[i] != null) {
                points[i] = new Point(other.points[i]);
            }
        }
    }

    /**
     * Add point to array
     * COmplexity O(n)
     * @param p
     * @return
     */
    public boolean add(Point p) {
        if (p == null || size == MAX_SIZE) {
            return false;
        }

        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                points[i] = p;
                size++;
                return true;
            }
        }
        return false;
    }

    public int getMaxSize() {
        return MAX_SIZE;
    }
    public int getSize() {return size;}

    /**
     * remove by index
     * Complexity O(n)
     * @param index
     */
    public void removeByIndex(int index) {

        //Complexity
        int ind = Math.abs(index);

        for (int i = 0; i < points.length; i++) {

            if ( i == ind ) {
                points[i] = null;
            }

            if (points[i] != null) {
                size = i;
            }

        }
    }

    /**
     * removes duplicate
     * Complexity O(n)
     * @param p
     */
    public void removeDuplicate(Point p) {

        for (int i = 0; i < points.length; i++) {

            if (points[i] != null && points[i].equals(p)) {
                removeByIndex(i);
            }

        }

    }

    public Point[] getPoints() {
        return points;
    }

    public String toString() {
        return this.MAX_SIZE + "\n" + Arrays.toString(points) + "\n" + size;
    }
}
