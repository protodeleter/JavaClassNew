package ClassWorks;

import java.util.Scanner;

public class Exe16_1 {


    public static void main(String[] args) {

        int num = 1000, num2 = 2000;


//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                System.out.println("Num " + i);
//            }
//        }
//
//        for (int i = 1; i < num2; i++) {
//
//            if (num2 % i == 0) {
//                System.out.println("Num " + i);
//            }
//        }


//        for (int i = 1; i < num / 2; i++) {
//            if (num % i == 0) {
//                System.out.println("Num " + i);
//            }
//        }
//
//        for (int i = 1; i < num2 / 2; i++) {
//
//            if (num2 % i == 0) {
//                System.out.println("Num " + i);
//            }
//        }


//        for (int i = 1; i < Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                System.out.println("Num " + i + " " + num / i);
//            }
//        }
//
//        for (int i = 1; i < Math.sqrt(num2) / 2; i++) {
//
//            if (num2 % i == 0) {
//                System.out.println("Num2 " + i + " " + num2 / i);
//            }
//        }

//        exeTwo();
//        exeThree();
        exeFour();
    }

    public static void exeTwo() {
        Scanner inp = new Scanner(System.in);
        int num1 = inp.nextInt(), num2 = inp.nextInt(), sum = 0;
        int min = Math.min(num1, num2);
        for (int i = 0; i < min; i++) {
            if (num2 > num1)
                sum = sum + num2;
            else
                sum = sum + num1;
        }
        System.out.println(sum);
    }

    public static void exeThree() {

        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt(), num2 = inp.nextInt();

        int min = Math.min(num, num2), cc = 0;

        for (int i = 1; i <= min / 2; i++) {
            if (num % i == 0 && num2 % i == 0)
                System.out.println(i);
            cc++;
        }

    }

    public static void exeFour() {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt(), y = inp.nextInt();


        int i = x;

        for (i = x; i <= y; i++)
            if (i % x == 0)
                System.out.println(i);

    }


}
