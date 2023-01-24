package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String ans = "";
        String single = "  %d |";
        String twodigit = " %d |";
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++)
                if(i * j < 10) ans += String.format(single, i * j);
                else ans += String.format(twodigit, i * j);
            ans += "\n";
        }
        return ans;
    }

    public static String getLargeMultiplicationTable() {
        String ans = "";
        String single = "  %d |";
        String twodigit = " %d |";
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++)
                if(i * j < 10) ans += String.format(single, i * j);
                else if ( i * j < 100) ans += String.format(twodigit, i * j);
                else ans += String.format("%d |", i * j);
            ans += "\n";
        }
        return ans;    
    }

    public static String getMultiplicationTable(int tableSize) {
        String ans = "";
        String single = "  %d |";
        String twodigit = " %d |";
        for(int i = 1; i <= tableSize; i++){
            for(int j = 1; j <= tableSize; j++)
                if(i * j < 10) ans += String.format(single, i * j);
                else if ( i * j < 100) ans += String.format(twodigit, i * j);
                else ans += String.format("%d |", i * j);
            ans += "\n";
        }
        return ans; 
    }
}
