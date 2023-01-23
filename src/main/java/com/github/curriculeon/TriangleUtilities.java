package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder ans = new StringBuilder();
        for (int num = 1; num <numberOfRows; num++){
            ans.append("*".repeat(num));
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
        StringBuilder ans = new StringBuilder();
        for (int num = 1; num <=4; num++){
            ans.append("*".repeat(num));
            ans.append("\n");
        }
        return ans.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder ans = new StringBuilder();
        for (int num = 1; num <10; num++){
            ans.append("*".repeat(num));
            ans.append("\n");
        }
        return ans.toString();
    }
}
