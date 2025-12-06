package Bus;

public class TestBus {
    public static void main(String[] args) {

        Bus[] b = new Bus[5];
        b[0] = new Bus("Alex", "1234", "14", 18);
        b[1] = new Bus("Alex", "7596", "14", 17);
        b[2] = new Bus("Alex", "6051", "14", 16);
        b[3] = new Bus("Alex", "4472", "14", 21);
        b[4] = b[3];


        int m = 0, s = 0;

        int x = b[1].getPassengers();
        b[1].setPassengers(b[3].getPassengers() + 5);
        b[3].setPassengers(x);


        System.out.println(b[4].getPassengers());
        
//
//        for (int i = 0; i < b.length; i++) {
//
//            System.out.println(b[i].getName() + " " + b[i].getPassengers());
//
//            s = s + b[i].getPassengers();
//            if (b[i].getPassengers() > 20) m++;
//        }
//
//        System.out.println((double) s / b.length);
//        System.out.println(m);


//        String[] res = notPopular(b, 17);
//
//        for (int i = 0; i < res.length; i++) {
//
//            System.out.println(res[i]);
//
//        }
    }

    public static String[] notPopular(Bus[] b, int num) {
        int cc = 0;
        int cn = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i].getPassengers() < num)
                cc++;
        }
        String[] ret = new String[cc];

        for (int i = 0; i < b.length; i++) {
            if (b[i].getPassengers() < num) {
                ret[cn] = b[i].getPlateNumber();
                cn++;
            }
        }
        return ret;
    }
}
