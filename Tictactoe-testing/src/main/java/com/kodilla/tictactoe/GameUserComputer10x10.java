package com.kodilla.tictactoe;

public class GameUserComputer10x10 {

    Game10x10 game10x10 = new Game10x10();
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
            game10x10.printBoard(plansza, wymiar);
            if (symbol == 'X')
            {
                plansza = game10x10.wykonajRuch(plansza, symbol);
            }else {
                plansza = game10x10.wykonajRuchComputer(plansza, symbol);
            }
            wygranaWiersze = game10x10.wygranaWiersze(plansza,symbol);
            wygranaKolumny = game10x10.wygranaKolumny(plansza,symbol);
            wygranaSkos1 = game10x10.wygranaSkos1(plansza,symbol);
            wygranaSkos2 = game10x10.wygranaSkos2(plansza,symbol);
            if (wygranaWiersze || wygranaKolumny || wygranaSkos1 || wygranaSkos2){
                czyKontynuowac = false;
            }
            if (czyKontynuowac == true){
                symbol = game10x10.zmianaSymbolu(symbol);
                licznikRuchow++;
            }

        }
        game10x10.printBoard(plansza,wymiar);
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
