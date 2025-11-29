package Date;

public class testDate {
    public static void main(String[] args) {

//        Date d1 = new Date(29, 11, 2025);
//
//        System.out.println(d1.before(new Date(28, 11, 2025)));


        Date d1 = new Date(16, 7, 1963);
        Date d2 = d1;
        d1.setDay(20);
        d2.setYear(1980);
        System.out.println(d1.toString());
        System.out.println(d2.toString());

    }
}
