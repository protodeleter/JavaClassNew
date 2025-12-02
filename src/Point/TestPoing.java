package Point;

public class TestPoing {
    public static void main(String[] args) {
        Point testPoint = new Point(43, 7);
        Point testPoint2 = new Point(5, 5);

        System.out.println(testPoint.toString());
        System.out.println(testPoint2.toString());

        int temp = testPoint.getX();


        testPoint.setX(testPoint2.getX());
        testPoint2.setX(temp);

        System.out.println(testPoint.toString());

        System.out.println(testPoint2.toString());
    }
}
