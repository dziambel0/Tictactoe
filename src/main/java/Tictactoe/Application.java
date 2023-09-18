package Tictactoe;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        GameUserUser gameUserUser = new GameUserUser();
        GameUserComputer gameUserComputer = new GameUserComputer();
        Scanner scanner = new Scanner(System.in);

        char symbol = 'X';
        int wymiar = 3;
        char[][] board = new char[wymiar][wymiar];
        int wyborGry = 1;

        System.out.println("\nWitaj w grze kułko i krzyzyk");

        while (wyborGry != 3){
            System.out.println("-------------------------------");
            System.out.println("MENU:");
            System.out.println("Chcesz grać z innym graczem wybierz 1");
            System.out.println("Chcesz grac z komputerem wybierz 2");
            System.out.println("Chcesz wyjsc z gry wybierz 3");
            wyborGry = scanner.nextInt();

            if (wyborGry == 1){
                gameUserUser.gameWithUser(board,symbol,wymiar);
            } else if (wyborGry == 2) {
                gameUserComputer.gameWithComputer(board,symbol,wymiar);
            } else if (wyborGry == 3) {
                System.out.println("KONIEC GRY");
            }
        }

    }
}
