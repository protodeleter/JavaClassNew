package Bus;

public class TestBus {
    public static void main(String[] args) {

        Bus[] b = new Bus[5];
        b[0] = new Bus("Alex", "1234", "14", 18);
        b[1] = new Bus("Benni", "7596", "14", 17);
        b[2] = new Bus("Charli", "6051", "14", 16);
        b[3] = new Bus("Dani", "4472", "14", 21);
        b[4] = b[3];

        String[] res = notPopular(b, 17);
        for (int i = 0; i < res.length; i++) {

            System.out.println(res[i]);

        }
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
