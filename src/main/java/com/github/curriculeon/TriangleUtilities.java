package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder str = new StringBuilder();
        for (int row = 0; row < numberOfRows-1; row++) str.append("*".repeat(row + 1)).append("\n");
        return str.toString();
    }

    public static String getRow(int numberOfStars) {
        String ans = "";
        for(int i = 0; i < numberOfStars; i++) ans += "*";
        return ans;
    }

    public static String getSmallTriangle() {
        
        return getTriangle(5);    
    }

    public static String getLargeTriangle() {
       
        return getTriangle(10);    
    }
}
