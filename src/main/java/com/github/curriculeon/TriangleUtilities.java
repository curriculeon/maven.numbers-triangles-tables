package com.github.curriculeon;

public class TriangleUtilities {

/**
     * @param numberOfStars
     * @return
     */
    public static String getRow(int numberOfStars) {
        StringBuilder ans = new StringBuilder();
        ans.append("*".repeat(numberOfStars));
        return "*".repeat(numberOfStars);
    }

    /**
     * @param numberOfRows
     * @return
     */
    public static String getTriangle(int numberOfRows) {
        StringBuilder str = new StringBuilder();
        for (int row = 1; row < numberOfRows; row++) str.append(getRow(row)).append("\n");
        return str.toString();
    }

    /**
     * @return
     */
    public static String getSmallTriangle() {return getTriangle(5);}

    /**
     * @return
     */
    public static String getLargeTriangle() {return getTriangle(10);}
}
