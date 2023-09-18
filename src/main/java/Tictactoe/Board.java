package Tictactoe;

public class Board {

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

}
