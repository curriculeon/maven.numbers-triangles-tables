package com.github.curriculeon;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String result ="";
        for (int i =1;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i*j>9){result +=" "+i*j+" |";}
                else{
                result +="  "+i*j+" |";}
            }
            result +="\n";
        }

        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result ="";
        for (int i =1;i<=10;i++){
            for(int j =1;j<=10;j++){
                if(i*j<=9){ result +="  "+i*j+" |";}
                else if (i*j <= 99){result +=" "+i*j+" |";}
                else{ result +=""+i*j+" |"; }

            }
            result +="\n";
        }

        return result;
    }


    public static String getMultiplicationTable(int tableSize) {
        String result ="";
        for (int i =1;i<=20;i++){
            for(int j =1;j<=20;j++){
                if(i*j<=9){ result +="  "+i*j+" |";}
                else if (i*j <= 99){result +=" "+i*j+" |";}
                else{ result +=""+i*j+" |"; }

            }
            result +="\n";
        }

        return result;
    }
}
