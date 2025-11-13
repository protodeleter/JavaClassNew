package Lecture10;

import java.util.Scanner;

public class ClassWork10_10 {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

//        exeOne();
//        exeTwo();


        int[] numArrOne = new int[]{1, -5, 6, -7, 8};
//        int[] numArrTwo = new int[]{1, 5, 3, 9, 8, 90};
//        exeThree(numArrOne, numArrTwo);

        exeFour(numArrOne);
    }


    public static void exeOne() {

        int[] arr = new int[10];
        int cc = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number: ");
            int num = inp.nextInt();
            arr[i] = num;
            if (num % 2 == 0) {
                cc++;
            }
        }

        int[] evens = new int[cc];

        int evensCc = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                evens[evensCc] = arr[j];
                evensCc++;
            }
        }
        for (int k = 0; k < evens.length; k++) {
            System.out.println(evens[k]);
        }

    }

    public static void exeTwo() {

        int num = 0, ccPos = 0, ccNeg = 0;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            num = inp.nextInt();
            arr[i] = num;
            if (num > 0) {
                ccPos++;
            } else {
                ccNeg++;
            }
        }
        int[] pos = new int[ccPos];
        int[] neg = new int[ccNeg];
    }

    /**
     *
     * @param num
     * @param num2
     */
    public static void exeThree(int[] num, int[] num2) {


        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num2.length; j++) {

                if (num[i] == num2[j]) {
                    System.out.println(num2[j]);
                }

            }

        }


    }


    public static void exeFour(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        System.out.println(index);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        System.out.println(index);


        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        for (int ll = 0; ll < arr.length; ll++) {

//            System.out.println(arr[ll]);

        }


    }


}

