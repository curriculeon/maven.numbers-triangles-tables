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
        for(int i = 1; i <= tableSize; i++){
            for(int x = 1; x <= tableSize; x++) {
                int mx = i * x;
                if(mx < 10) {
                    result += String.format("  %s |", mx );
                } else if(mx >= 100) {
                    result += String.format("%s |", mx );
                } else if(mx >= 10) {
                    result += String.format(" %s |", mx );
                }
            }
            result += "\n";
        }
        return result;
    }
}
