package Exceptions;

public class UtilityClass {

    public static double getSqrt(double num) throws NegativeValueException {

        double res = 0;

        if (num < 0) {
            throw new NegativeValueException("messs");
        }

        return res;
    }
}
