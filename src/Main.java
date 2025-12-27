//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Point.Point;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        int[][] arr = new int[6][10];

        for (int i = 1; i < 6; i++) {
            arr[i][1] = i;
            for (int j = 1; j < 10; j++)
                arr[1][j] = j;
        }


        for (int i = 1; i < 6; i++) {


            for (int j = 1; j < 10; j++) {

                System.out.print(arr[i][j]);

            }

            System.out.println();
        }
    }


}