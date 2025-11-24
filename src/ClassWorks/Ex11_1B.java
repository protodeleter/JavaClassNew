package ClassWorks;

import java.util.Scanner;

/**
 * Pavel Nasonov
 * Haim Ashraph
 */

public class Ex11_1B {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {


        exeOne();


//        Exe Two
//        int[] c = new int[]{7, 8, 9, 10};
//        int num = 0;
//        for (int i = 0; i < c.length; i++) {
//            num = exeTwo(c[i]);
//            c[i] = num;
//        }
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }
//        exeThree(new int[]{5, 6, 7, 8, 5, 6, 9, 10});
//        exeFour(new int[]{5, 6, 7, 8, 5, 6, 9, 10});

    }

    /**
     * Gets inp of 7 ints to array
     * Prints out min , max per array item
     */
    public static void exeOne() {

        int[] floors = new int[30];
        int workers = 0, leastWorkers = 0, leastFloor = 0, mostFloor = 0, mostWorkers = 0, workersPerFloor = 0;

        for (int i = 0; i < floors.length; i++) {
            floors[i] = 0;
        }


        for (int i = 0; i < floors.length; i++) {

            for (int j = 0; j < 7; j++) {
                System.out.println("enter number of workers for the floor " + i);
                workers = inp.nextInt();
                workersPerFloor += workers;
            }

            floors[i] = workersPerFloor;
            workersPerFloor = 0;
        }


        for (int i = 0; i < floors.length; i++) {

            if (i == 0)
                leastWorkers = floors[i];

            if (floors[i] < leastWorkers)
                leastWorkers = floors[i];
            leastFloor = i;

            if (floors[i] > mostWorkers)
                mostWorkers = floors[i];
            mostFloor = i;
        }


        System.out.println("Floor with least workers is  " + leastFloor + ". Number of workers " + leastWorkers);
        System.out.println("Floor with most workers is " + mostFloor + ". Number of workers " + mostWorkers);

    }

    /**
     *
     * @param n
     * @return sum of ints that divided by 3
     */
    public static int exeTwo(int n) {
        int sum = 0;
        int i = 1;
        while (i < n && n < 100) {
            if (i % 3 == 0)
                sum += i;
            i++;
        }
        return sum;
    }

    /**
     *
     * @param arr prints out how many times array items appear in the array
     */
    public static void exeThree(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] temp = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {

            if (inArray(arr, arr[i]))
                temp[arr[i]]++;

        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0)
                System.out.println(i + " appears " + temp[i] + " times");
        }
    }


    /**
     *
     * @param arr
     * @return array without duplicates
     */
    public static int[] exeFour(int[] arr) {

        int[] temp = new int[arr.length];
        int cc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!inArray(temp, arr[i])) {
                temp[cc] = arr[i];
                cc++;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0) {
                System.out.println(temp[i]);
            }
        }
        return temp;
    }


    /**
     * Helper function
     *
     * @param arr
     * @param v
     * @return true if int is in array already
     */
    public static boolean inArray(int[] arr, int v) {

        for (int i = 0; i < arr.length; i++) {
            if (v == arr[i])
                return true;
        }
        return false;
    }


}
