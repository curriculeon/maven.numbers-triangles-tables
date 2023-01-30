package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String bob = "";
        for(int i = start; i < stop; i++)
            if (i % 2 == 0) bob += i;
        return bob;
    }


    public static String getOddNumbers(int start, int stop) {
        String bob2 = "";
        for(int i = start; i < stop; i++)
            if (i % 2 == 1) bob2 += i;
        return bob2;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String bob = "";
        for(int i = start; i < stop; i+= step)
            bob += i*i;
        return bob;

    }

    public static String getRange(int start) {
        String billy = "";
        for(int i = 0; i < start; i++) billy += i;
        return billy;

    }

    public static String getRange(int start, int stop) {
        String Collector = "";
        for (int i = start; i < stop; i++) Collector +=i;
        return Collector;
    }


    public static String getRange(int start, int stop, int step) {
        String Ranger = "";
        for(int i = start; i < stop; i += step) Ranger += i;
        return Ranger;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String Expo = "";
        for(int i = start; i < stop; i+= step){
            Expo += (int) Math.pow(i , exponent);
        }
        return Expo;
    }
}
