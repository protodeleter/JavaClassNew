package ClassWorks;

public class Lecture15 {
    public static void main(String[] args) {

        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr.length; j++) {

                if( (i + j) % 2 == 0) {
                    arr[i][j] = 'B';
                } else {
                    arr[i][j] = 'W';
                }

            }
        }

    }
}
