package ClassWorks;

import java.util.Locale;
import java.util.Scanner;

public class Ex15_Two_Exersizes {


    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("Enter Array ength");
        int N = inp.nextInt();
        double num = 0.0;

        double[][] arr = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println("Enter nmber");
                num = inp.nextDouble();
                arr[i][j] = num;
            }
        }


        firstExe( arr );
    }
    public static void firstExe( double[][] mat ) {


        double max = 0;
        int c = 0;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == max)
                    c++;
            }
        }
        System.out.println(max);
        System.out.println(c);
        
    }
}
