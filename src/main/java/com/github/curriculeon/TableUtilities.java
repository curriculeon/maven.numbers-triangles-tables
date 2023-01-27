package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder ans = new StringBuilder();
        for (int row = 1; row <=tableSize; row ++){
            for (int column = 1; column <= tableSize; column++){
                int num = row * column;
                if (num > 99)
                    ans.append(num+" |");
                else if (num > 9)
                    ans.append(" "+num+" |");
                else
                    ans.append("  "+num+" |");
            }
            ans.append("\n");
        }
        return ans.toString();
    }
}