package Date;

public class testDate {
    public static void main(String[] args) {

        Date d1 = new Date(29, 11, 2025);

        System.out.println(d1.before(new Date(28, 11, 2025)));

    }
}
