package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i < tableSize + 1; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j < tableSize + 1; j++) {
                row.append(String.format("%3d ", i * j)).append("|");
            }
            row.append("\n");
            table.append(row);
        }
        return table.toString();
    }
}
