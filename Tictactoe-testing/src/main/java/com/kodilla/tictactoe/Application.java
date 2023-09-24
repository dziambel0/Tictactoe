package com.kodilla.tictactoe;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        GameUserUser gameUserUser = new GameUserUser();
        GameUserComputer gameUserComputer = new GameUserComputer();
        GemaUserUser10x10 gameUserUser10x10 = new GemaUserUser10x10();
        GameUserComputer10x10 gameUserComputer10x10 = new GameUserComputer10x10();
        Testing testing = new Testing();
        Scanner scanner = new Scanner(System.in);

        char symbol = 'X';
        int wymiar = 3;
        int wymiar2 = 10;
        String wyborGry = "";
        int wyborWersji = 1;

        int wygranaX = 0;
        int wygranaO = 0;
        int remis = 0;

        System.out.println("\nWitaj w grze kułko i krzyzyk");

        while (wyborGry.equals("4") == false){
            int wygrana = 100;
            System.out.println("-------------------------------");
            System.out.println("MENU:");
            System.out.println("Chcesz grać z innym graczem wybierz 1");
            System.out.println("Chcesz grac z komputerem wybierz 2");
            System.out.println("Wyswietl ranking wybierz 3");
            System.out.println("Chcesz wyjsc z gry wybierz 4");
            wyborGry = scanner.next();
            while(testing.isNumeric(wyborGry) == false || testing.isOnetoFour(wyborGry) == false){
                System.out.println("Wpisana wartość musi być cyfrą od 1 do 4");
                wyborGry = scanner.next();
            }

            if (wyborGry.equals("1")){
                System.out.println("Wybierz wymier planszy:");
                System.out.println("PLANSZA 3x3 - wybierz 1");
                System.out.println("PLANSZA 10x10 - wybierz 2");
                wyborWersji = scanner.nextInt();
                if (wyborWersji == 1){
                    char[][] board = new char[wymiar][wymiar];
                    wygrana = gameUserUser.gameWithUser(board,symbol,wymiar);
                } else if (wyborWersji == 2) {
                    char[][] board = new char[wymiar2][wymiar2];
                    wygrana = gameUserUser10x10.gameWithUser(board,symbol,wymiar2);
                }
            } else if (wyborGry.equals("2")) {
                System.out.println("Wybierz wymier planszy:");
                System.out.println("PLANSZA 3x3 - wybierz 1");
                System.out.println("PLANSZA 10x10 - wybierz 2");
                wyborWersji = scanner.nextInt();
                if(wyborWersji == 1){
                    char[][] board = new char[wymiar][wymiar];
                    wygrana = gameUserComputer.gameWithComputer(board,symbol,wymiar);
                } else if (wyborWersji == 2) {
                    char[][] board = new char[wymiar2][wymiar2];
                    wygrana = gameUserComputer10x10.gameWithComputer(board,symbol,wymiar2);
                }
            } else if (wyborGry.equals("4")) {
                System.out.println("KONIEC GRY");
            } else if (wyborGry.equals("3")) {
                System.out.println("Ranking:");
                System.out.println("Wygrana X: " + wygranaX);
                System.out.println("Wygrana O: " + wygranaO);
                System.out.println("Remis: " + remis);
            }

            if (wygrana == 0){
                remis++;
            } else if (wygrana == 1) {
                wygranaX++;
            } else if (wygrana == 2) {
                wygranaO++;
            }
        }

    }

}
