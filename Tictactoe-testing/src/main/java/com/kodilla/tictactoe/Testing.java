package com.kodilla.tictactoe;

public class Testing {

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static boolean isOnetoFour(String str) {
        if(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4")) {
            return true;
        } else
            return false;
    }

}
