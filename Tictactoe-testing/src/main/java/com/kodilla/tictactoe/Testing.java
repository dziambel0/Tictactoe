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

    public static boolean isOnetoTwo(String str) {
        if(str.equals("1") || str.equals("2")) {
            return true;
        } else
            return false;
    }

    public static boolean isZerotoTwo(String str) {
        if(str.equals("0") || str.equals("1") || str.equals("2")) {
            return true;
        } else
            return false;
    }

    public static boolean isZerotoNine(String str) {
        if(str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9")) {
            return true;
        } else
            return false;
    }

}
