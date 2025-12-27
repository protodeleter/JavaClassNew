package HomeWorks;

public class Exe15_1 {
    public static void main(String[] args) {

//        exeOne();
//        exeTwo();

//        exeThree();
        int[][] matrix = {
                {5, 2, 7, 4, 5, 8, 2, 20},
                {6, 5, 8, 9, 10, 50, 20, 13},
                {11, 12, 1, 1506, 15, 54, 8, 4},
                {16, 17, 18, 19, 20, 50, 20, 13},
                {21, 22, 23, 5, 25, 50, 20, 13},
                {21, 22, 23, 24, 25, 50, 20, 13},
                {21, 22, 23, 24, 25, 50, 20, 13},
                {16, 17, 18, 19, 20, 50, 20, 13},
        };
//        exeFour(matrix);
//        exeFive(matrix);
        exeSix(matrix);
    }


    /**
     * prints our matrix 2 4 6 8 10
     */
    public static void exeOne() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    sum += 2;
                    System.out.print(" " + sum + " ");
                } else
                    System.out.print(" " + 0 + " ");

            }
            System.out.println(" ");

        }
    }

    public static void exeTwo() {

        for (int i = 1; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print(" " + j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    public static void exeThree() {
        int len = 5;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(" " + (int) (Math.pow(i, j)) + " ");
            }
            System.out.println();
        }
    }

    /**
     * א. סכום כל שורה בצורה נפרדת.
     * ב. סכום כל השורות.
     * ג. סכום השורות הזוגיות.
     * ד. סכום השורות האי-זוגיות.
     * ה. השורה בעלת הערך הגדול ביותר.
     * ו. סכום השורות השנייה והרביעית.
     * ז. האיבר הגדול ביותר בכל שורה ומיקומו.
     *
     * @param arr
     */
    public static void exeFour(int[][] arr) {

        // א. סכום כל שורה בצורה נפרדת.
        int rowSum = 0;

        //ב. סכום כל השורות.
        int rowsSum = 0;

        //ג. סכום השורות הזוגיות.
        int evenRowsSum = 0;

        // ד. סכום השורות האי-זוגיות.
        int oddRowsSum = 0;

        //ו. סכום השורות השנייה והרביעית.
        int secondForthRow = 0;

        //ז. האיבר הגדול ביותר בכל שורה ומיקומו.
        int maxPerRow = 0;
        int maxIndex = 0;


        for (int i = 0; i < arr.length; i++) {

            System.out.println("Iteration number " + i);
            System.out.println();


            for (int j = 0; j < arr.length; j++) {

                rowSum += arr[i][j];

                if (i % 2 == 0) {
                    evenRowsSum += arr[i][j];
                }
                if (i % 2 != 0) {
                    oddRowsSum += arr[i][j];
                }

                if (i == 1 || i == 3) {
                    secondForthRow += arr[i][j];
                }

                if (arr[i][j] > maxPerRow) {
                    maxPerRow = arr[i][j];
                    maxIndex = i;
                }

            }

            for (int j = 0; j < arr.length; j++) {


            }


            rowsSum += rowSum;

            System.out.println("Sum per row #" + i + " " + rowSum);
            System.out.println("Sum of all rows #" + i + " " + rowSum);

            System.out.println("Sum per even row #" + i + " " + evenRowsSum);

            System.out.println("Sum per odd row #" + i + " " + oddRowsSum);

            if (secondForthRow > 0)
                System.out.println("Sum per second Forth row #" + i + " " + secondForthRow);

            rowSum = 0;
            evenRowsSum = 0;
            oddRowsSum = 0;
            System.out.println("------------------------------");
            System.out.println();
        }

        System.out.println("Max per row " + maxPerRow + " at index " + maxIndex);


        System.out.println("Sum of all rows " + rowsSum);
    }

    public static void exeFive(int[][] arr) {

        int colSum = 0;
        int colsSum = 0;
        int evenColsSum = 0;
        int oddColsSum = 0;
        int colMaxValue = 0;
        int secondFourColSum = 0;

        int maxPerCol = 0;
        int maxPerColIndex = 0;

        int ets = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

//                System.out.println(arr[j][i]);

                colSum += arr[j][i];


                if (j % 2 == 0) {
                    evenColsSum += arr[j][i];
                }

                if (j % 2 != 0) {
                    oddColsSum += arr[j][i];
                }

                if (arr[j][i] > maxPerCol) {
                    maxPerCol = arr[j][i];
                    maxPerColIndex = i;
                }


            }


            colsSum += colSum;

            System.out.print("column number " + i + " " + colSum + " ");
            System.out.print("evenColsSum " + i + " " + evenColsSum + " ");
            System.out.print("oddColsSum " + i + " " + oddColsSum + " ");
            System.out.println();
            colSum = 0;
            evenColsSum = 0;
            oddColsSum = 0;
        }

        System.out.println(" maxPerCol " + maxPerCol + " maxPerColIndex " + maxPerColIndex);
        System.out.print("Sum of all columns " + colsSum + " ");

    }


    public static void exeSix(int[][] arr) {
        int avg = 0, sum = 0, max = 0, maxindexLevelOne = 0, maxindexLevelTwo = 0, min = 0, minIndexLevelOne = 0, minIndexLevelTwo = 0, oddSum = 0, evenSum = 0, positives = 0, negatives = 0, biggerThenAvg = 0, cc = 0;
        boolean isEven, isOdd;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                sum += arr[i][j];

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxindexLevelOne = i;
                    maxindexLevelTwo = j;
                }


                if (i == 0 && j == 0) {
                    min = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minIndexLevelOne = i;
                    minIndexLevelTwo = j;
                }

                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }

                if (arr[i][j] > 0) {
                    positives += arr[i][j];
                } else {
                    negatives += arr[i][j];
                }

                cc++;

            }

        }


        System.out.println("Average is " + (sum / cc));
        System.out.println("Min value is " + min + " at index [" + minIndexLevelOne + "][" + minIndexLevelTwo + "]");
        System.out.println("Max value is " + max + " at index [" + maxindexLevelOne + "][" + maxindexLevelTwo + "]");
        System.out.println("Even numbers sum " + evenSum);
        System.out.println("Odd numbers sum " + oddSum);
        System.out.println("positives sum " + positives);
        System.out.println("negatives sum " + negatives);


    }


}
