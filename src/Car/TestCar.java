package Car;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        String carType = "";
        String color = "";
        double kms, minKms = 0;

        Car newestCar;

        for (int i = 0; i < 30; i++) {

            System.out.println("Enter car type:");
            carType = inp.nextLine();


            System.out.println("Enter car color:");
            color = inp.nextLine();

            System.out.println("Enter car kilometers:");
            kms = inp.nextDouble();


            if (i == 0) {
                minKms = kms;
            }

            if (kms < minKms) {
                minKms = kms;
            }
        }

        System.out.println("Car with lowest kms: ");

    }
}
