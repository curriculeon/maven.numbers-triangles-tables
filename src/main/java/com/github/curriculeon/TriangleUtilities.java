package com.github.curriculeon;

public class TriangleUtilities {

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
     * @param numberOfStars
     * @return
     */
    public static String getRow(int numberOfStars) {
        String ans = "";
        for(int i = 0; i < numberOfStars; i++) ans += "*";
        return ans;
    }

    /**
     * @return
     */
    public static String getSmallTriangle() {
        return getTriangle(5);    
    }

    /**
     * @return
     */
    public static String getLargeTriangle() {
        return getTriangle(10);    
    }
}
