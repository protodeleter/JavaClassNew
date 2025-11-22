package HomeWorks;

import java.util.Scanner;

public class EX10_1C {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

//        exeOne();
//        exeTwo();


        /*
         * Exercise Three
         */

//        System.out.println("Enter arrays length");
//        int arrLength = inp.nextInt(), valOne = 0, valTwo = 0;
//        int[] arrOne = new int[arrLength];
//        int[] arrTwo = new int[arrLength];
//
//        for (int i = 0; i < arrLength; i++) {
//            System.out.println("Enter value for " + i + " item");
//            valOne = inp.nextInt();
//            valTwo = inp.nextInt();
//            arrOne[i] = valOne;
//            arrTwo[i] = valTwo;
//        }
//
//        if (exeThree(arrOne, arrTwo)) {
//            System.out.println("Arrays are not equal in their values");
//        } else {
//            System.out.println("Arrays are equal in their values");
//        }


//        exeFour();
        exeFive();

    }


    /**
     * gets input from scanner
     * prints out parameters
     * maximal value, average value, second biggest value, minimal value
     */
    public static void exeOne() {

        double rainAvg = 0,
                sum = 0,
                avgYear = 0,
                secondMax = 0,
                smallestRain = 0,
                max = 0;
        int i = 0;

        double[] months = new double[12];

        for (int j = 0; j < months.length; j++) {
            months[j] = 0;
        }

        for (i = 0; i < months.length; i++) {
            System.out.println("Enter rain level for month " + i);
            rainAvg = inp.nextDouble();

            if (i == 0)
                smallestRain = rainAvg;

            months[i] = rainAvg;
            sum += rainAvg;

            if (rainAvg > max)
                max = rainAvg;

            if (rainAvg < smallestRain)
                smallestRain = rainAvg;

        }


        for (int k = 0; k < months.length; k++) {
            if (months[k] > secondMax && months[k] != max)
                secondMax = months[k];
        }

        avgYear = sum / i;

        System.out.println("secondMax " + secondMax);
        System.out.println("avgYear " + avgYear);
        System.out.println("max " + max);
        System.out.println("smallestRain " + smallestRain);


    }

    /**
     * gets input from scanner
     * print out array with replaced values
     */
    public static void exeTwo() {

        int[] arr = new int[20];
        int sum = 0, temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 1; i < 20; i++) {
            System.out.println("Enter some value ");
            arr[i] = inp.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = sum;
            sum += temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /**
     *
     * @param arr1
     * @param arr2
     * @return true if both arrays have same values
     */
    public static boolean exeThree(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    /**
     * gets input from scanner
     * builds 3  new arrays
     */

    public static void exeFour() {
        int vals = 0;
        int[] arr = new int[10];
        int[] c = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value for " + i + " index");
            vals = inp.nextInt();
            arr[i] = vals;
        }


        for (int i = 0; i < c.length; i++) {
            c[i] = arr[i] * arr[i + 1];
        }

        int[] a = powArr(arr);
        int[] b = sortArr(arr);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

    /**
     *
     * @param arr
     * @return new arr with pow values
     */
    public static int[] powArr(int[] arr) {

        int[] returnArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            returnArr[i] = arr[i] * arr[i];
        }

        return returnArr;
    }

    /**
     *
     * @param arr
     * @return sorted array  negative to positive numbers
     */
    public static int[] sortArr(int[] arr) {

        int[] returnArr = new int[arr.length];
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                returnArr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                returnArr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = returnArr[i];
        }

        return returnArr;
    }

    /**
     * Creates new array that based on values of a given one
     */
    public static void exeFive() {

        int[] givenArr = new int[]{1, 5, 9, 5};
        int[] newArr = new int[givenArr.length / 2 + givenArr.length];
        int cc = 0;

        for (int i = 0; i < givenArr.length; i += 2) {
            if ((givenArr[i] + givenArr[i + 1]) % 3 == 0) {
                newArr[cc] = givenArr[i];
                newArr[cc + 1] = givenArr[i + 1];
                newArr[cc + 2] = givenArr[i] + givenArr[i + 1];
            } else {
                newArr[cc] = givenArr[i];
                newArr[cc + 1] = givenArr[i + 1];
                newArr[cc + 2] = 0;
            }
            cc += 3;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
