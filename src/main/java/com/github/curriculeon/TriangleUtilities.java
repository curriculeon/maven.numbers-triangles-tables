package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int x = 0; x < numberOfRows; x++){
            result = result + getRow(x + 1) + "\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        // x, x < numberofStars, x++
        for (int x = 0; x < numberOfStars; x++){
            //result = a * for each x.
            result = result + "*";
        }
        return result;
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
