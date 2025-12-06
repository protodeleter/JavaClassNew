package Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        Car[] parkedCars = new Car[3];

        String carType = "";
        String color = "";
        double kms, minKms = 0;

        Car newestCar;

        for (int i = 0; i < parkedCars.length; i++) {


            System.out.println("Enter car type:");
            carType = inp.nextLine();

            System.out.println("Enter car color:");
            color = inp.nextLine();

            System.out.println("Enter car kilometers:");
            kms = inp.nextDouble();
            inp.nextLine(); // consume newline

            parkedCars[i] = new Car(carType, color, kms);
        }

        printNewesCars(parkedCars);

        getAvgKms(parkedCars);

        redCars(parkedCars);

        twentyToForty(parkedCars);
//        System.out.println("Car with lowest kms: ");

    }

    /**
     * Prints the car with lowest kms
     *
     * @param arr
     */
    public static void printNewesCars(Car[] arr) {

        double minKms = 0, kms = 0;
        int minKmsCc = 0;

        Car[] lowestKms = new Car[arr.length];


        for (int i = 0; i < arr.length; i++) {
            kms = arr[i].getKms();

            if (i == 0) {
                minKms = kms;
            }
            if (i > 0 && kms <= minKms) {
                minKms = kms;
                lowestKms[i] = new Car(arr[i].getCarType(), arr[i].getColor(), arr[i].getKms());
            }
        }

        for (int i = 0; i < lowestKms.length; i++) {
            if (lowestKms[i] != null)
                System.out.println(lowestKms[i].toString());
        }


    }

    public static double getAvgKms(Car[] arr) {

        double kms, sum = 0;

        for (int i = 0; i < arr.length; i++) {
            kms = arr[i].getKms();
            sum += kms;
        }
        return sum / arr.length;
    }

    public static Car[] redCars(Car[] arr) {
        String redColor = "red", carColor = "";
        int redCc = 0;
        for (int i = 0; i < arr.length; i++) {
            carColor = arr[i].getColor();
            if (redColor == carColor) {
                redCc++;
            }
        }
        Car[] redCars = new Car[redCc];
        for (int i = 0; i < arr.length; i++) {
            carColor = arr[i].getColor();

            if (redColor == carColor) {
                redCars[i] = arr[i];
            }
        }
        return redCars;
    }

    public static void twentyToForty(Car[] arr) {

        double kms = 0;
        for (int i = 0; i < arr.length; i++) {
            kms = arr[i].getKms();

            if (kms >= 20000 && kms <= 40000)
                System.out.println(arr[i].toString());

        }


    }

}
