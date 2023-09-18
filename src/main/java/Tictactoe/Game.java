package Tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

public char[][] wykonajRuch(char[][] plansza, char symbol ){

    boolean correct = true;
    while(correct){
        correct = false;
        System.out.println("\n" + symbol + " - Twój ruch");
        System.out.println("Podaj index wiersza:");
        int wiersz = scanner.nextInt();
        System.out.println("Podaj index kolumny:");
        int kolumna = scanner.nextInt();
        boolean correctMove = plansza[wiersz][kolumna] == 0;
        if(!correctMove){
            System.out.println("-----------------");
            System.out.println("Nie poprawny ruch");
            correct = true;
            continue;
        }
        plansza[wiersz][kolumna] = symbol;
    }
    return plansza;
}

    public char[][] wykonajRuchComputer(char[][] plansza, char symbol ){

        boolean correct = true;
        while(correct){
            correct = false;
            int wiersz = random.nextInt(3);
            int kolumna = random.nextInt(3);
            boolean correctMove = plansza[wiersz][kolumna] == 0;
            if(!correctMove){
                correct = true;
                continue;
            }
            plansza[wiersz][kolumna] = symbol;
        }
        return plansza;
    }

    public void printBoard(char[][] board, int wymiar){

        //Druk naglówki kolumn
        System.out.print("\t");
        for (int i=0; i<wymiar; i++){
            System.out.print(i+"\t");
        }
        System.out.println();

        //Druk zawartości
        for (int wiersz = 0; wiersz<wymiar; wiersz++){
            System.out.print(wiersz + "\t");
            for (int kolumna = 0; kolumna<wymiar; kolumna++){
                System.out.print(board[wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }

public char zmianaSymbolu(char symbol){
    if(symbol == 'X'){
        symbol = 'O';
    }else {
        symbol = 'X';
    }
    return symbol;
}

public boolean wygranaWiersze(char[][] plansza, char symbol){
    int wymiar = plansza.length;
    for(int wiersz = 0; wiersz<wymiar;wiersz++){
        boolean wygrana = true;
        for(int kolumna = 0;kolumna<wymiar; kolumna++){
            if(plansza[wiersz][kolumna]!=symbol){
                wygrana = false;
                break;
            }
        }
        if(wygrana){
            return true;
        }
    }
    return false;
}

    public boolean wygranaKolumny(char[][] plansza, char symbol){
        int wymiar = plansza.length;
        for(int kolumna = 0; kolumna<wymiar;kolumna++){
            boolean wygrana = true;
            for(int wiersz = 0;wiersz<wymiar; wiersz++){
                if(plansza[wiersz][kolumna]!=symbol){
                    wygrana = false;
                    break;
                }
            }
            if(wygrana){
                return true;
            }
        }
        return false;
    }

    public boolean wygranaSkos1(char[][] plansza,char symbol){
    int wymiar = plansza.length;
    for (int i = 0; i<wymiar; i++){
        if(plansza[i][i]!=symbol){
            return false;
        }
    }
    return true;
    }

    public boolean wygranaSkos2(char[][] plansza,char symbol){
        int wymiar = plansza.length;
        int n = wymiar-1;
        for (int i = 0; i<wymiar; i++){
            if(plansza[i][n]!=symbol){
                return false;
            }
            n--;
        }
        return true;
    }

}
