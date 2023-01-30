package com.github.curriculeon;

public class TableUtilities {
    
    /**
     * @return
     */
    public static String getSmallMultiplicationTable() {return getMultiplicationTable(5);}

    /**
     * @return
     */
    public static String getLargeMultiplicationTable() {return getMultiplicationTable(10);}

    /**
     * @param tableSize
     * @return
     */
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
