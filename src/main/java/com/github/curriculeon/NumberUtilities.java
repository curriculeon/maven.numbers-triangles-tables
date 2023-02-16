package com.github.curriculeon;
import java.util.*;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder ans = new StringBuilder();
        for (int num = start; num < stop; num++){
            if (num%2 == 0)
                ans.append(num);
        }
        return ans.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder ans = new StringBuilder();
        for (int num = start; num < stop; num++){
            if (num%2 == 1)
                ans.append(num);
        }
        return ans.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop,step, 2);
    }

    public static String getRange(int stop) {
        return getExponentiations(0, stop,1, 1);
    }

    public static String getRange(int start, int stop) {
        return getExponentiations(start, stop,1, 1);
    }

    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop,step, 1);
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder ans = new StringBuilder();
        for (int num = start; num < stop; num+=step){
            ans.append((int)Math.pow(num, exponent));
        }
        return ans.toString();
    }
}
