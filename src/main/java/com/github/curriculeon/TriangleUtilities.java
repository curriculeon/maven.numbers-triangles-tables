package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String tri ="";
        int row_count=1;
        while (row_count<numberOfRows){
            tri+=getRow(row_count)+"\n";
            row_count++;
        }
        return tri;
    }

    public static String getRow(int numberOfStars) {
        String row="";
        int count=0;
        while(count<numberOfStars){
            row+="*";
            count++;
        }
        return (row);
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
