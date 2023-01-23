package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder ans = new StringBuilder();
        for (int row = 1; row <=5; row ++){
            for (int column = 1; column <= 5; column++){
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

    public static String getLargeMultiplicationTable() {
        StringBuilder ans = new StringBuilder();
        for (int row = 1; row <=10; row ++){
            for (int column = 1; column <= 10; column++){
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