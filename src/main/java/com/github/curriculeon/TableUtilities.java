package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <=tableSize; j++) {
                int mul = i*j;
                if (mul<10) {
                    result+= String.format("  %s |",mul);
                } else if(mul>=100) {
                    result+= String.format("%s |",mul);
                } else if(mul>=10) {
                    result+= String.format(" %s |",mul);
                }


            }
            result+="\n";
        }
        System.out.println(result);

        return result;
    }
}
