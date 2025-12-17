package ClassWorks;

import java.util.Locale;
import java.util.Scanner;

public class Ex15_Two_Exersizes2 {


    public static void main(String[] args) {


        int[][] data = {
                {7, 7, 7,},
                {7, 40 , 5},
                {7, 60, 7}
        };


        System.out.println(secondExe( data ));

    }
    public static boolean secondExe( int[][] mat ) {


        boolean isSeven = false;
        for (int i = 0; i < mat.length; i++) {


            for (int j = 0; j < mat.length; j++) {

                System.out.println(  mat[i][ mat.length -1 -j ] );

                if (mat[j][0] == 7
                    && mat[0][j] == 7

                ) {
                    isSeven = true;
                }
            }

        }

        return isSeven;

    }
//     0 1 2
//   0 [][][]
//   1 [][][]
//   2 [][][]
}
