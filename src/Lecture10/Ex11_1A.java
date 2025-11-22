package Lecture10;

import java.util.Scanner;

public class Ex11_1A {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

//        exeOne();
//        exeTwo();

        exeThree();
    }


    /**
     * get int input X times
     * prints how many times digits appear in an input
     */
    public static void exeOne() {

        int incoming = 0, dig = 0;

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter number: ");
            incoming = inp.nextInt();
            while (incoming > 0) {
                dig = incoming % 10;
                incoming = incoming / 10;
                nums[dig]++;
            }


        }

        for (int j = 0; j < nums.length; j++) {
            System.out.println(j + " appeared " + nums[j] + " times.");
        }


    }


    /**
     * get int input X times
     * Prints out
     * max
     * secondMax
     * Not sold
     * Average
     * lessThenAverage
     */
    public static void exeTwo() {

        int incoming = 0, sold = 0, sum = 0, max = 0, secondMax = 0, lessThenAverage = 0, avg = 0;
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        while (incoming != -1) {
            System.out.println("enter toy number");
            incoming = inp.nextInt();
            if (incoming != -1) {
                arr[incoming - 1]++;


            }
        }


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                sold++;
                sum += arr[i];

                if (arr[i] > max) {
                    max = arr[i];
                }


            }
        }

        avg = sum / sold;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (arr[i] > secondMax && arr[i] < max) {
                    secondMax = arr[i];
                }
                if (arr[i] < avg / 2) {
                    lessThenAverage++;
                }

            }

        }


        System.out.println("Max 1 : " + max);
        System.out.println("Max 2 : " + secondMax);
        System.out.println("Not sold : " + (arr.length - sold));
        System.out.println("Average is : " + avg);
        System.out.println("lessThenAverage : " + lessThenAverage);

    }

    /**
     * Generate numbers in range of 1-19
     * Print out the most frequest number.
     */
    public static void exeThree() {
        int rand = 0;
        int max = 0;
        int[] ints = new int[20];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            rand = 1 + (int) (Math.random() * ((19 - 1) + 1));
            ints[rand]++;
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {

                if (ints[i] > max)
                    max = ints[i];

                System.out.println("Value of: " + i + " appeared " + ints[i] + " times");
            }
        }

        System.out.println("Most number is " + max);

    }
}
