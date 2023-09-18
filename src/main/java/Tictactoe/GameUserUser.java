package Tictactoe;

public class GameUserUser {

    Game game = new Game();

    public void gameWithUser(char[][] plansza, char symbol, int wymiar){

        boolean czyKontynuowac = true;
        int licznikRuchow = 0;
        boolean wygranaWiersze = false;
        boolean wygranaKolumny = false;
        boolean wygranaSkos1 = false;
        boolean wygranaSkos2 = false;

        System.out.println("GRA Z PRZECIWNIKIEM");
        while (czyKontynuowac && licznikRuchow<(wymiar*wymiar)){
            game.printBoard(plansza, wymiar);
            plansza = game.wykonajRuch(plansza, symbol);
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
        }else {
            System.out.println("NIKT NIE WYGRAL GRY");
        }


    }

}
