package Exercises;

public class Ex2_2A {


    /**
     * @param str
     */
    public void exe1(String str) {
        exe1(str, str.length() - 1);
    }

    /**
     * @param str
     * @param index
     */
    private void exe1(String str, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(str.charAt(index));
        exe1(str, index - 1);
    }


    /**
     * @param arr
     * @param i
     */
    private void exe2(int[] arr, int i) {
        if (i <= arr.length - 1) {
            if (i % 3 == 0) {
                System.out.println(arr[i]);
            }
            exe2(arr, i + 1);
        }

    }

    /**
     * @param arr
     */
    public void exe2(int[] arr) {
        exe2(arr, 0);
    }

    private boolean exe3(String str, int i) {

        if (i == str.length()) {
            return true;
        }

        if (str.charAt(i) < '0' || str.charAt(i) > '9') {
            return false;
        }
        return exe3(str, i + 1);

    }

    public boolean exe3(String str) {
        return exe3(str, 0);
    }

    private double exe4(int[] arr, int n, int i) {

        if (i == n || n > arr.length) {
            return 0;
        }


        return exe4(arr, n, i + 1) + arr[i];
    }

    public double exe4(int[] arr, int n) {
        return exe4(arr, n, 0) / n;
    }

    /**
     *
     * @param arr
     * @param n
     * @param i
     *
     * @return
     */
    private int exe5(int[] arr, int n, int i) {

        if (i == arr.length) {
            return 0;
        }

        if (arr[i] == n) {
            return 1 + exe5(arr, n, i + 1);
        } else {
            return exe5(arr, n, i + 1);
        }
    }

    public int exe5(int[] arr, int n) {
        return exe5(arr, n, 0);
    }

    /**
     *
     * @param arr
     * @param ch
     * @param i
     *
     * @return
     */
    private int exe6(String[] arr, char ch, int i) {

        int res = 0;
        if (i == arr.length) {

            return res;
        }
        res += exe6_2(arr[i], ch, 0);
        return exe6(arr, ch, i + 1) + res;
    }

    private int exe6_2(String str, char ch, int i) {
        int res = 0;
        if (i == str.length()) {
            return res;
        }
        if (str.charAt(i) == ch) {
            res += 1;
        }
        return exe6_2(str, ch, i + 1) + res;
    }

    /**
     *
     * @param arr
     * @param ch
     *
     * @return
     */
    public int exe6(String[] arr, char ch) {
        return exe6(arr, ch, 0);
    }

    /**
     *
     * @param arr
     * @param i
     *
     * @return
     */
    private boolean exe7(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }


        return exe7(arr, i + 1);
    }

    /**
     *
     * @param arr
     *
     * @return
     */
    public boolean exe7(int[] arr) {
        return exe7(arr, 0);
    }


    /**
     *
     * @param arr
     * @param n
     * @param i
     *
     * @return
     */
    private int exe8(int[] arr, int n, int i) {
        if (i == arr.length) {
            return 0;
        }
        int res = 0;

        if (arr[i] > n) {
            res += 1;
        }
        return exe8(arr, n, i + 1) + res;
    }

    public int exe8(int[] arr, int n) {
        return exe8(arr, n, 0);
    }

    public boolean exe9(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        int cc = arr[1] - arr[0];
        return exe9(arr, 1, cc);
    }

    private boolean exe9(int[] arr, int i, int cc) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i + 1] - arr[i] != cc) {
            return false;
        }
        return exe9(arr, i + 1, cc);
    }

    private void exe10(int[] arr, int n, int i) {

        if (i <= arr.length - 1) {

            if (arr[i] > n) {
                arr[i] = 0;
            }

            exe10(arr, n, i + 1);
        }

    }

    public void exe10(int[] arr, int n) {
        exe10(arr, n, 0);
    }

    private boolean exe11(int[] arr, int n, int i) {

        if (i == arr.length) {
            return false;
        }


        if (arr[i] == n && i > 0) {
            return true;
        }


        return exe11(arr, n, i + 1);
    }

    public boolean exe11(int[] arr, int n) {
        return exe11(arr, n, 0);
    }
}

