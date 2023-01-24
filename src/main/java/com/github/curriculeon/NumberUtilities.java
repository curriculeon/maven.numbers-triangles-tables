package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int counter = start;
        while (counter<stop) {
            if(counter%2==0) {
                result+=counter;
            }
            counter+=1;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int counter = start;
        while (counter<stop) {
            if(counter%2!=0) {
                result+=counter;
            }
            counter+=1;
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start,stop,step,2);
    }

    public static String getRange(int stop) {

        return getRange(0,stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start,stop,1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start,stop,step,1);

    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        int counter = start;
        while (counter<stop) {
            result += (int) (Math.pow(counter,exponent));
            counter+=step;
        }
        return result;
    }
}
