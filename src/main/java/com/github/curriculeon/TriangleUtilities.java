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
        StringBuilder str = new StringBuilder();
        for (int row = 0; row < 4; row++) str.append("*".repeat(row + 1)).append("\n");
        return str.toString();    }

    public static String getLargeTriangle() {
        StringBuilder str = new StringBuilder();
        for (int row = 0; row < 9; row++) str.append("*".repeat(row + 1)).append("\n");
        return str.toString();    }
}
