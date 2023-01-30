package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        int num=start;
        String result="";
        while(num<stop){
            if (num%2==0){
                result+=num;
            }
            num+=1;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        int num=start;
        String result="";
        while(num<stop){
            if (num%2==1){
                result+=num;
            }
            num+=1;
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int num=start;
        String result="";
        while(num<stop){
            result+=num*num;
            num+=step;
        }


        return result;
    }

    public static String getRange(int stop) {
        int num=0;
        String result="";
        while(num<stop){
            result+=num;
            num+=1;
        }

        return result;
    }

    public static String getRange(int start, int stop) {
        int num=start;
        String result="";
        while(num<stop){
            result+=num;
            num+=1;
        }

        return result;
    }


    public static String getRange(int start, int stop, int step) {
        int num=start;
        String result="";
        while(num<stop){
            result+=num;
            num+=step;
        }

        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int num=start;
        String result="";
        while(num<stop){
            result+=(int)Math.pow(num,exponent);
            num+=step;
        }

        return result;
    }
}
