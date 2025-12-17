package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {


    public static Scanner inp = new Scanner(System.in);


    public static void main(String[] args) {



    }

    public static void initMat( int[][] m ) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0;
            }
        }
    }
    public static void matKelet(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = inp.nextInt();
            }
        }
    }

    public static void matFill(int[][] m) {

        int min = 0;
        int max = 1;
        int randomNum = (int)(Math.random() * ((max - min) + 1)) + min;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                randomNum = (int)Math.random();
                m[i][j] = randomNum;
            }
        }
    }
    
    public static void matPelet(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print( " " + Arrays.toString(m[j]) + " ");
            }
            System.out.println( );
        }
    }

    public static int matSum(int[][] m) {
        int sum =0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    public static int sumOfLine(int[][] m, int line) {
        int sum = 0;

        for (int i = 0; i < m[line].length; i++) {
            sum+=m[line][i];
        }
        return sum;
    }

    public static int sumOfColumn(int[][] m, int col) {

        int sum = 0;
        for (int i = 0; i < m.length; i++) {

            sum += m[i][col];
        }
        return sum;
    }

    public static int sumOfFirstDiagonal(int[][] m) {

        int sum= 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum+= m[i][i];
            }
        }
        return sum;
    }

    public static int sumOfSecondDiagonal(int[][] m) {

        int sum = 0;
        int n = m.length;
        int j = n-1;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][j];
            j--;
        }
        return sum;
    }

    public static boolean matCorners(int[][] m) {
        int n = m.length;
        int sum = m[0][0] + m[0][n-1] + m[n-1][0] + m[n-1][n-1];
        return sum == m[n/2][n/2];
    }

    public static int sumOfCOrners(int[][] m , int i, int j) {

        int sum= 0;
        for (int k = 0; k < m.length; k++) {



        }
        return 0;
    }
    public static int sumOfSides(int[][] m , int i, int j) {

        return 0;
    }

    public static int sumOfNeighbours(int[][] m, int i, int j ) {


        return 0;
    }

}

