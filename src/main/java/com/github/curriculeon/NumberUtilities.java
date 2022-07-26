package com.github.curriculeon;


import java.lang.reflect.Array;
import java.util.Arrays;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        int x = 0;

        for (x = start; x < stop; x++) {

            //find out if the variable is even its even
            int remainder = x % 2;
            boolean isEven = (remainder == 0);

            //if it is even
            if (isEven) {
                result = result + x;
            }

        }
        //Once loop is finished, return
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        int x = 0;

        for (x = start; x < stop; x++) {

            //find out if the variable is odd
            int remainder = x % 2;
            boolean isEven = (remainder == 0);

            //if it is odd
            if (!isEven) {
                result = result + x;
            }

        }
        //Once loop is finished, return
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = getExponentiations(start, stop, step, 2);
//        //start, start < stop, (start + step)^exponent
//        for (int x = start; x < stop;x += step){
//            //Exponent to step via Math.pow (which turns this into a double
//            // little double can not turn into int but big Double can
//            Double exponential = Math.pow(x, 2);
//
//            //Have to turn back into an integer
//            Integer exponentialInt = exponential.intValue();
//
//            //result = result + exponentialInt
//            result = result + exponentialInt;
//        }
       return result;
    }

    public static String getRange(int stop) {
        String result = getRange(0, stop);
        //0, stop, ++
        //for (int x = 0; x < stop; x++) {

            //result = result +
           // result = result + x;

            //return result range
        //}
        return result;

    }

    public static String getRange(int start, int stop) {
        String result = getRange(start, stop, 1);
        //start, start < stop, start++
      //  for (int x = start; x < stop; x++){
           // //result = result + x
        //    result = result + x;
      //  }

        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        //start, start < stop, start + step (x = x + step)
        for (int x = start; x < stop; x += step) {
            //result = result + x
            result = result + x;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        //start, start < stop, (start + step)^exponent
        for (int x = start; x < stop;x += step){
            //Exponent to step via Math.pow (which turns this into a double
            // little double can not turn into int but big Double can
            Double exponential = Math.pow(x, exponent);

            //Have to turn back into an integer
            Integer exponentialInt = exponential.intValue();

            //result = result + exponentialInt
            result = result + exponentialInt;
        }
        return result;

}
    }
