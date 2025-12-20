package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        sumOfCOrners(matrix, 2, 3);
    }

    /**
     *
     * @param m
     */
    public static void initMat(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0;
            }
        }
    }

    /**
     *
     * @param m
     */
    public static void matKelet(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = inp.nextInt();
            }
        }
    }

    /**
     *
     * @param m
     */
    public static void matFill(int[][] m) {

        int min = 0;
        int max = 1;
        int randomNum = (int) (Math.random() * ((max - min) + 1)) + min;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                randomNum = (int) Math.random();
                m[i][j] = randomNum;
            }
        }
    }

    /**
     *
     * @param m
     */
    public static void matPelet(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(" " + Arrays.toString(m[j]) + " ");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param m
     *
     * @return
     */
    public static int matSum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }

    /**
     *
     * @param m
     * @param line
     *
     * @return
     */
    public static int sumOfLine(int[][] m, int line) {
        int sum = 0;

        for (int i = 0; i < m[line].length; i++) {
            sum += m[line][i];
        }
        return sum;
    }

    /**
     *
     * @param m
     * @param col
     *
     * @return
     */
    public static int sumOfColumn(int[][] m, int col) {

        int sum = 0;
        for (int i = 0; i < m.length; i++) {

            sum += m[i][col];
        }
        return sum;
    }

    /**
     *
     * @param m
     *
     * @return
     */
    public static int sumOfFirstDiagonal(int[][] m) {

        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum += m[i][i];
            }
        }
        return sum;
    }

    /**
     *
     * @param m
     *
     * @return
     */
    public static int sumOfSecondDiagonal(int[][] m) {

        int sum = 0;
        int n = m.length;
        int j = n - 1;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][j];
            j--;
        }
        return sum;
    }

    /**
     *
     * @param m
     *
     * @return
     */
    public static boolean matCorners(int[][] m) {
        int n = m.length;
        int sum = m[0][0] + m[0][n - 1] + m[n - 1][0] + m[n - 1][n - 1];
        return sum == m[n / 2][n / 2];
    }

    /**
     *
     * @param m
     * @param i
     * @param j
     *
     * @return sum corners around i,j
     */
    public static int sumOfCOrners(int[][] m, int i, int j) {

        int leftTopCorner = m[i - 1][j - 1];
        int rightTopCorner = m[i - 1][j + 1];
        int leftBottomCorner = m[i + 1][j - 1];
        int rightBottomCorner = m[i + 1][j + 1];
        return leftTopCorner + rightTopCorner + leftBottomCorner + rightBottomCorner;
    }

    /**
     *
     * @param m
     * @param i
     * @param j
     *
     * @return sum of sides around i,j
     */
    public static int sumOfSides(int[][] m, int i, int j) {
        int middleTop = m[i][j - 1];
        int middleBottom = m[i][j + 1];
        int middleRight = m[i + 1][j];
        int middleLeft = m[i - 1][j];
        return middleTop + middleBottom + middleRight + middleLeft;
    }

    /**
     *
     * @param m
     * @param i
     * @param j
     *
     * @return sum of sides + corners
     */
    public static int sumOfNeighbours(int[][] m, int i, int j) {
        int sumOfCorners = sumOfCOrners(m, i, j);
        int sumOfSides = sumOfSides(m, i, j);
        return sumOfCorners + sumOfSides;
    }

}

