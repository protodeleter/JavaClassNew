package MultiDimentionalArrays;

import java.util.Scanner;

public class Arrayz {

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);


        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = inp.nextInt();

            }

        }


        int firstSum = 0;
        int secSum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i == 0) {
                    firstSum += arr[i][j];
                }
                secSum += arr[i][j];
            }

            if (secSum == firstSum) {
                System.out.println("Perfect");
            }
            secSum = 0;
        }


    }


//    public static boolean isArray(Object obj) {
//        return obj instanceof Object[] ||
//                obj instanceof boolean[] ||
//                obj instanceof byte[] ||
//                obj instanceof short[] ||
//                obj instanceof char[] ||
//                obj instanceof int[] ||
//                obj instanceof long[] ||
//                obj instanceof float[] ||
//                obj instanceof double[];
//    }

}
