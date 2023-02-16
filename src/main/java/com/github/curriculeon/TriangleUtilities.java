package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder ans = new StringBuilder();
        for (int num = 1; num <numberOfRows; num++){
            ans.append(getRow(num));
            ans.append("\n");
        }
        return ans.toString();
    }

    public static String getRow(int numberOfStars) {
        String ans = "";
        for (int num = 0; num < numberOfStars; num++){
                ans +=("*");
        }
        return ans;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
