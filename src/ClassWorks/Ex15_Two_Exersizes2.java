package ClassWorks;

import java.util.Locale;
import java.util.Scanner;

public class Ex15_Two_Exersizes2 {


    public static void main(String[] args) {
        int length = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter array length ");
        length = inp.nextInt();
        int[][] data = new int[length][length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter value for array " + i);
            for (int j = 0; j < length; j++) {
                System.out.println("Enter value  " + j);
                data[i][j] = inp.nextInt();
            }
        }
        System.out.println(secondExe(data));
    }

    /**
     * check if all array items == 7
     *
     * @param mat
     *
     * @return
     */
    public static boolean secondExe(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[0][i] != 7)
                return false;
            else if (mat[i][0] != 7) {
                return false;
            } else if (mat[i][mat.length - i - 1] != 7) {
                return false;
            } else if (mat[i][mat.length - 1] != 7) {
                return false;
            } else if (mat[mat.length - 1][i] != 7) {
                return false;
            }
        }

        return true;
    }
//     0 1 2
//   0 [][][]
//   1 [][][]
//   2 [][][]
}
