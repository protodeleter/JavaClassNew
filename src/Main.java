//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import Exercises.Counter;
import Exercises.Ex2_2A;
import Point.Point;

import java.util.Scanner;

import Clock.Clock;

public class Main {


    public static void main(String[] args) {

        Ex2_2A cc = new Ex2_2A();

        Counter ccc = new Counter();
        Counter ccc2 = new Counter();
        Counter ccc3 = new Counter();

        System.out.println(ccc.getCount());

//        cc.exe1("avot anahs");

//        cc.exe2(new int[]{2, 5, 7, 0, 8, 9, 1, 1, 3, 9});

//        System.out.println(cc.exe3("123f"));

//        System.out.println(cc.exe4(new int[]{2, 5, 7, 0, 8, 9, 1, 1, 3, 9}, 2));

//        System.out.println(cc.exe5(new int[]{2, 5, 7, 0, 8, 9, 1, 1, 1, 3, 9}, 15));


//        System.out.println(cc.exe6(new String[]{"nono", "gogo"}, 'o'));

//        System.out.println(cc.exe7(new int[]{4, 7, 1, 2, 3, 5}));

//        System.out.println(cc.exe8(new int[]{4, 7, 1, 2, 3, 5}, 9));

        System.out.println(cc.exe9(new int[]{7, 5, 3, 1}));

//        int[] arr = new int[]{1, 3, 5, 7};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        System.out.println("***************");
//        cc.exe10(arr, 3);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        System.out.println(cc.exe11(arr, 0));
    }


    public static boolean compareClocks(Clock c1, Clock c2) {
        return c1.isTheSameHour(c2);
    }

    public static int minDiff(Clock c1, Clock c2) {

        int diff = 0;


        if (c1.getMinute() - c2.getMinute() > 0) {
            diff = c1.getMinute() - c2.getMinute();
        } else {
            diff = Math.abs(c1.getMinute() - c2.getMinute());
        }
        return diff;
    }


    public static boolean isOrderedPlaces(int[] arr) {
        int num = arr[0];
        boolean flag = true;

        for (int i = 2; i < arr.length; i = i + 2) {

            if (arr[i] < num) {
                flag = false;
            }

            num = arr[i];

        }

        return flag;

    }


    public static void divide(int[] arr, int[] arrA, int[] arrB) {
        int num = arr[0];
        int cca = 0, ccb = 0;
        int k = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > num) {

                arrA[cca] = arr[i];
                arrB[cca] = num;
                cca++;
            } else {
                arrA[ccb] = num;
                arrB[ccb] = arr[i];
                ccb++;
            }

            num = arr[i];
        }

        System.out.println("first");
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }

        System.out.println("second");

        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
    }

    public static boolean isBig(int[] arrA, int[] arrB) {

        boolean flag = true;

        for (int i = 0; i < arrA.length; i++) {

            if (arrA[i] < arrB[i]) {
                flag = false;
            }

        }

        return flag;
    }

    public static boolean isOrderedValues(int[] arr) {

        boolean flag = true;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                if (arr[i] < temp) {
                    flag = false;
                }
                temp = arr[i];
            }
        }
        return flag;
    }


    public static String patientCode(String dep, int bd, String name) {

        String bds = "" + bd;
        String fc = "" + name.charAt(0);
        String lchars = bds.substring(2, 4);
        return dep + fc + lchars;
    }

    public static String[] PatientCodesArr(int num) {

        Scanner inp = new Scanner(System.in);

        String dep;
        int bd;
        String name;

        String[] codes = new String[num];

        for (int i = 0; i < num; i++) {
            dep = inp.next();
            bd = inp.nextInt();
            name = inp.next();

            codes[i] = patientCode(dep, bd, name);
        }

        return codes;
    }

    /**
     * בודקת האם אינדקס שורה ועמודה
     * נמצאים בתחום המערך הדו־ממדי.
     */
    public static boolean inBounds(char[][] arr, int r, int c) {
        return r >= 0 && r < arr.length &&
                c >= 0 && c < arr[0].length;
    }

    /**
     * הפעולה מקבלת מערך של מספרים שלמים
     * והופכת את סדר האיברים במערך.
     * ההיפוך מתבצע על אותו מערך (in-place),
     * ללא יצירת מערך חדש.
     */
    public static void reverse(int[] arr) {

        // משתנה שמצביע על תחילת המערך
        int left = 0;

        // משתנה שמצביע על סוף המערך
        int right = arr.length - 1;

        // כל עוד המצביע השמאלי קטן מהימני – ממשיכים להחליף
        while (left < right) {

            // שמירת הערך הזמני לצורך ההחלפה
            int temp = arr[left];

            // הצבת הערך מהצד הימני בצד השמאלי
            arr[left] = arr[right];

            // הצבת הערך הזמני בצד הימני
            arr[right] = temp;

            // קידום המצביע השמאלי קדימה
            left++;

            // קידום המצביע הימני אחורה
            right--;
        }
    }

    public static boolean isatoz(String st) {
        if (st.length() == 0) {
            return false;
        }
        boolean flag = true;

        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) < 'a' || st.charAt(i) > 'z') {
                flag = false;
            }
        }

        return flag;
    }

    public static boolean alphanumeric(String st) {
        if (st.length() == 0) return false;
        boolean flag = true;
        for (int i = 0; i < st.length(); i++) {
            if ((st.charAt(i) < 'a' || st.charAt(i) > 'z') ||
                    (st.charAt(i) < 0 || st.charAt(i) > 9)
            ) {
                flag = false;
            }
        }

        return flag;
    }

    public static boolean isNumeric(String st) {

        if (st.length() == 0) return false;
        boolean flag = true;

        for (int i = 0; i < st.length() - 1; i++) {
            if (st.charAt(i) < '0' || st.charAt(i) > '9') {
                flag = false;
            }
        }
        return flag;
    }


    public static boolean checkName(String st) {

        int[] scoreInd = new int[2];
        int scoreCc = 0;

        for (int i = 0; i < scoreInd.length; i++) {
            scoreInd[i] = 0;
        }
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '-') {
                scoreInd[scoreCc] = i;
                scoreCc++;
            }
        }
        if (scoreCc < 2) return false;


        if (st.charAt(0) == '-') return false;
        if (scoreInd[1] - scoreInd[0] == 1 ||
                st.length() - scoreInd[1] == 1
        ) {
            return false;
        }

        return isatoz(st.substring(0, scoreInd[0])) &&
                alphanumeric(st.substring(scoreInd[0], scoreInd[1])) &&
                isNumeric(st.substring(scoreInd[1], st.length() - 1));

    }


    void printReverse(String s, int i) {
        if (i == s.length())
            return;
        printReverse(s, i + 1);
        System.out.print(s.charAt(i));
    }

    boolean isPal(String s, int l, int r) {
        if (l >= r)
            return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return isPal(s, l + 1, r - 1);
    }

    int sumArr(int[] arr, int i) {
        if (i == arr.length)
            return 0;
        return arr[i] + sumArr(arr, i + 1);
    }

    int sumDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDigits(n / 10);
    }


}