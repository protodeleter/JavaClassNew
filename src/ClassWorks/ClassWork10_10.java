package ClassWorks;

import java.util.Scanner;

public class ClassWork10_10 {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

//        exeOne();
//        exeTwo();


        int[] numArrOne = new int[]{1, -5, 6, -7, 8, -10};
//        int[] numArrTwo = new int[]{1, 5, 3, 9, 8, 90};
//        exeThree(numArrOne, numArrTwo);

//        exeFour(numArrOne);

//        exeFive(new int[]{3, 2, 1, 4, 1, 6, 3, 2, 1, 4, 1, 6, 3, 2, 1, 4, 1, 6, 3, 2, 1, 4, 1, 6, 3, 2, 1, 4, 1, 6,});

//        exeSix(new int[]{1, 0, 0, 1, 1, 0, 0, 1});


        System.out.println(isSimetric(new int[]{2, 3, 1, 4, 1, 2}));

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


    /**
     *
     * Sorts array by negative positive values
     *
     * @param arr
     */
    public static void exeFour(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index] = arr[i];
                index++;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        for (int ll = 0; ll < arr.length; ll++) {

            System.out.println(arr[ll]);

        }


    }


    /**
     *
     * Print out if current iteration is bigger than the next one
     *
     * @param arr
     */
    public static void exeFive(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(i);
            }
        }
    }

    /**
     *
     * @param arr of ints
     * @return Mirrored number
     */
    public static int exeSix(int[] arr) {
        String newNum = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            newNum += arr[i];
        }

        return Integer.parseInt(newNum);
    }


    /**
     *
     * @param arr array of ints
     * @return true if array is symetrical
     */
    public static boolean isSimetric(int[] arr) {

        if (arr.length % 2 != 0)
            return false;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sum1 += arr[i];
        }
        for (int k = arr.length / 2; k < arr.length; k++) {
            sum2 += arr[k];
        }

        return sum1 == sum2;
    }
}

