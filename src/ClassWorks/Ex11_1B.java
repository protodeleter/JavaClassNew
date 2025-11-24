package ClassWorks;

import java.util.Scanner;

public class Ex11_1B {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
//        exeOne();

        exeTwo(7 );
    }

    /**
     * Gets inp of 7 ints to array
     * Prints out min , max per array item
     */
    public static void exeOne() {

        int[] floors = new int[30];
        int workers = 0,  leastWorkers = 0, leastFloor = 0, mostFloor = 0, mostWorkers = 0, workersPerFloor = 0;

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

            if(i == 0)
                leastWorkers = floors[i];

            if (floors[i] < leastWorkers)
                leastWorkers = floors[i];
                leastFloor = i;

            if(floors[i] > mostWorkers)
                mostWorkers = floors[i];
                mostFloor = i;
        }


        System.out.println("Floor with least workers is  " + leastFloor + ". Number of workers " + leastWorkers);
        System.out.println("Floor with most workers is " + mostFloor + ". Number of workers " + mostWorkers);

    }

    public static int exeTwo(int n ){

        int sum = 0;

        int i = 1;
        while( i < n && n < 100 ) {
            if (i%3 == 0)
                sum+=i;

            i++;
        }

        System.out.println(sum);
        return 0;
    }
}
