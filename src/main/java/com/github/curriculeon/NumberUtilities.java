package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int count = start;
        while(count < stop){
            if(count%2 == 0){
                result += count;
            }
            count++;
        }
        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int count = start;
        while(count < stop){
            if(count%2 != 0){
                result += count;
            }
            count++;
        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        int count = start;
        while (count < stop) {
            result += (count * count);
            count += step;
            }
        return result;
        }


    public static String getRange(int stop) {
        String result = "";
        int count = 0;
        while (count < stop) {
            result += count;
            count += 1;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        int count = start;
        while (count < stop) {
            result += count ;
            count += 1;
        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        int count = start;
        while (count < stop) {
            result += count;
            count += step;
        }
        return result;
    }



    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        int count = start;
        while (count < stop) {
            result += (int)Math.pow(count, exponent) ;
            count += step;
        }
        return result;
    }
}

