package com.kodilla.tictactoe;

public class GameUserComputer {

    Game game = new Game();
    int wygrana = 0;

    public int gameWithComputer(char[][] plansza, char symbol, int wymiar){

        boolean czyKontynuowac = true;
        int licznikRuchow = 0;
        boolean wygranaWiersze = false;
        boolean wygranaKolumny = false;
        boolean wygranaSkos1 = false;
        boolean wygranaSkos2 = false;

        System.out.println("GRA Z KOMPUTEREM");
        while (czyKontynuowac && licznikRuchow<(wymiar*wymiar)){
            game.printBoard(plansza, wymiar);
            if (symbol == 'X')
            {
                plansza = game.wykonajRuch(plansza, symbol);
            }else {
                plansza = game.wykonajRuchComputer(plansza, symbol);
            }
            wygranaWiersze = game.wygranaWiersze(plansza,symbol);
            wygranaKolumny = game.wygranaKolumny(plansza,symbol);
            wygranaSkos1 = game.wygranaSkos1(plansza,symbol);
            wygranaSkos2 = game.wygranaSkos2(plansza,symbol);
            if (wygranaWiersze || wygranaKolumny || wygranaSkos1 || wygranaSkos2){
                czyKontynuowac = false;
            }
            if (czyKontynuowac == true){
                symbol = game.zmianaSymbolu(symbol);
                licznikRuchow++;
            }

        }
        game.printBoard(plansza,wymiar);
        if (wygranaWiersze || wygranaKolumny || wygranaSkos1 || wygranaSkos2){
            System.out.println("GRE WYGRAL " + symbol);
            if (symbol == 'X'){
                wygrana = 1;
            } else if (symbol == 'O') {
                wygrana = 2;
            }
        }else {
            System.out.println("NIKT NIE WYGRAL GRY");
            wygrana = 0;
        }
        return wygrana;
    }
}
