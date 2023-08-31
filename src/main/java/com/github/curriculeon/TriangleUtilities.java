package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        //Create a variable to store result (to be returned later)
        StringBuilder result = new StringBuilder();
        //Start looping numberOfRow times
        for(int i = 1; i < numberOfRows; i ++){//Within each iteration:
            //Create a row with 'iteration_number' of stars
            String row = getRow(i);
            //Add newly created row to result
            result.append(row);
            //Add new line break to end of row
            result.append("\n");
        }//Finish loop
        //Return result
        return result.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            result.append("*");
        }
        return result.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
