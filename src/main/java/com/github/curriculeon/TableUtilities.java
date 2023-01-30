package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return(getMultiplicationTable(5));
    }

    public static String getLargeMultiplicationTable() {
        return(getMultiplicationTable(10));
    }

    public static String getMultiplicationTable(int tableSize) {
        String table ="";
        int size=tableSize;
        int row=1; //each row of table
        while(row<=size){   //iterate adding single row at a time to table
            int count =1; // incrementer for each value in row
            int num; // var for each value
            while (count<=size){   // iterate each value in row
                num = count*row;   //calculating table value for each num
                if (num<10){    //for correct formatting of spaces
                    table += ("  "+num+" |"); //single digit num require two leading spaces
                }
                else if (num<100){
                    table += (" "+num+" |"); //double digit num require one leading space
                }
                else{
                    table += (num+" |"); //triple digit num require no leading space
                }
                count++; //increment counter for next number
            }
            table+="\n"; //format for next row
            row+=1; //increment row counter
        }
        return table;
    }
}
