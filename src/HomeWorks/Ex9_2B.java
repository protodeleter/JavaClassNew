package HomeWorks;

import java.util.Scanner;

// Pavel Nasonov - Haim Ashraph

public class Ex9_2B {

    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {

//        exeOne();
//        exeTwo();
//        exeThree("some string", 4, "sub");
//        System.out.println(exeFour("hello"));
//        exeFive("abcefgabcefg", "abc");
//        exeSix();
//        exeSeven();

//        exeEight();
//        exeNine();
//        strDelete("abcde", 1, 2);
//        exeEleven();


        strNumber("Five");

    }


    /**
     * Get input a string and replaces $ with space char
     */
    public static void exeOne() {

        System.out.println("enter bad sentence with $");
        String str = inp.nextLine();
        System.out.println(str.replace("$", " "));
    }

    /**
     * Get input string
     * Print out coded string
     */
    public static void exeTwo() {


        System.out.println("Enter regular sentence");
        String str = inp.nextLine();

        String replaced = str.replace(" ", "@");
        int asciiRange = 'a' - 'A';

        String res = "";

        for (int S = 0; S < str.length(); S++) {
            res += replaced.charAt(S);
            if (replaced.charAt(S) != '@') {
                res += (char) (replaced.charAt(S) - asciiRange);
            }
        }

        System.out.println(res);
    }

//    gGoOoOdD@mMoOrRnNiInNgG

    /**
     * Pastes substing into main string at a place of "place" parameter
     *
     * @param s
     * @param place
     * @param sub
     *
     * @return
     */
    public static String exeThree(String s, int place, String sub) {

        String first = "";
        String last = "";
        String res = "";
        first = s.substring(0, place);
        last = s.substring(place, s.length());
        res = first + sub + last;
        return res;
    }

    /**
     *
     * @param s
     *
     * @return reversed string
     */
    public static String exeFour(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static String exeFive(String a, String b) {
        return a.replaceAll(b, "*");
    }


    /**
     * Get input string
     * Prints out same sentence with reversed words keeping same order of the words
     */
    public static void exeSix() {

        System.out.println("Enter some sentence");
        String str = inp.nextLine();

        String res = "";
        String temp = "";


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(str.length() - 1) != ' ') {
                str += " ";
            }
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                for (int j = temp.length() - 1; j >= 0; j--) {
                    res += temp.charAt(j);
                }
                res += str.charAt(i);
                temp = "";
            }
        }


        System.out.println(res.trim());

    }

    /**
     * Get input string
     * Prints out smallest length of a word starting with "min"
     * Prints out longest length of a word starting with "min"
     */
    public static void exeSeven() {
        String str = "";
        int max = 0;

        int min = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("enter string");
            str = inp.nextLine();
            if (i == 0) {
                min = str.length();
            }

            if (str.startsWith("min") && str.length() < min) {
                min = str.length();
            }

        }
        System.out.println(min);

        for (int i = 0; i < 10; i++) {
            System.out.println("enter string");
            str = inp.nextLine();

            if (str.startsWith("min") && str.length() > max) {
                max = str.length();
            }

        }

        System.out.println(max);
    }

    /**
     * Get input of strings until 2 string lenngths are equal
     * print out sum of char of every string
     */
    public static void exeEight() {

        String str = " ";
        String prevStr = "";

        int sum = 0;

        while (str.length() != prevStr.length()) {
            prevStr = str;
            str = inp.nextLine();
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i);
            }
            System.out.println(sum);
        }

    }

    /**
     * Get input sentence
     * define which word is the longest
     */
    public static void exeNine() {
        String str = inp.nextLine();
        int max = 0;
        String word = "";

        int limit = 0, offset = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (limit == 0) {
                    limit = i;
                    offset = 0;
                    word = str.substring(offset, limit);
                } else if (limit > 0) {
                    offset = limit;
                    limit = i;
                    word = str.substring(offset + 1, limit);
                }
                if (word.length() > max) {
                    max = word.length();
                }
            }

            if (i == str.length() - 1) {
                offset = limit;
                limit = str.length();
                word = str.substring(offset + 1, limit);
                if (word.length() > max) {
                    max = word.length();
                }
            }
        }

        System.out.println(max);
    }

    /**
     * Deletes a certian amount of charachters from a string
     *
     * @param s
     * @param place
     * @param len
     */
    public static void strDelete(String s, int place, int len) {
//        System.out.println();
        s.replace(s.substring(place, place + len), "");
    }

    /**
     * Get chars input
     * Creates mirrored string
     */
    public static void exeEleven() {
        String res = "";
        char ch = inp.next().charAt(0);
        res = ch + res;
        while (ch != ' ') {
            ch = inp.next().charAt(0);
            res = ch + res;
            System.out.println(res);
        }
    }

    public static void strNumber(String str) {

        String toLower = str.toLowerCase();

        switch (toLower) {

            case "one":
                System.out.println(1);
                break; // exits the switch statement
            case "two":
                System.out.println(2);
                break; // exits the switch statement
            case "three":
                System.out.println(3);
                break; // exits the switch statement
            case "four":
                System.out.println(4);
                break; // exits the switch statement
            case "five":
                System.out.println(5);
                break; // exits the switch statement
            case "six":
                System.out.println(6);
                break;
            case "seven":
                System.out.println(7);
                break;
            case "eight":
                System.out.println(8);
                break;
            case "nine":
                System.out.println(9);
                break;
            // ... more cases
            default:
                // code to execute if no case matches (optional)
        }

    }
}
