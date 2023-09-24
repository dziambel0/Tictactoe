package com.kodilla.tictactoe;

import com.kodilla.tictactoe.Game;
import org.junit.jupiter.api.*;

public class TictactoeTestSet {

@Test
    void testXWiersze(){
    //Given
    Game game = new Game();
    char symbol = 'X';
    char[][] plansza = new char[3][3];
    plansza[0][0] = symbol;
    plansza[0][1] = symbol;
    plansza[0][2] = symbol;
    plansza[1][0] = symbol;
    plansza[1][1] = symbol;
    plansza[1][2] = symbol;
    plansza[2][0] = symbol;
    plansza[2][1] = symbol;
    plansza[2][2] = symbol;

    //When
    boolean testWygranaWiersz = game.wygranaWiersze(plansza,symbol);
    //Then
    Assertions.assertEquals(testWygranaWiersz, true);
}

    @Test
    void testXKolumny(){
        //Given
        Game game = new Game();
        char symbol = 'X';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbol;
        plansza[0][1] = symbol;
        plansza[0][2] = symbol;
        plansza[1][0] = symbol;
        plansza[1][1] = symbol;
        plansza[1][2] = symbol;
        plansza[2][0] = symbol;
        plansza[2][1] = symbol;
        plansza[2][2] = symbol;

        //When
        boolean testWygranaKolumna = game.wygranaKolumny(plansza,symbol);
        //Then
        Assertions.assertEquals(testWygranaKolumna, true);
    }

    @Test
    void testXSkosy(){
        //Given
        Game game = new Game();
        char symbol = 'X';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbol;
        plansza[0][1] = symbol;
        plansza[0][2] = symbol;
        plansza[1][0] = symbol;
        plansza[1][1] = symbol;
        plansza[1][2] = symbol;
        plansza[2][0] = symbol;
        plansza[2][1] = symbol;
        plansza[2][2] = symbol;

        //When
        boolean testWygranaSkos1 = game.wygranaSkos1(plansza,symbol);
        boolean testWygrywaSkos2 = game.wygranaSkos2(plansza,symbol);
        //Then
        Assertions.assertEquals(testWygranaSkos1, true);
        Assertions.assertEquals(testWygrywaSkos2, true);
    }

    @Test
    void testOWiersze(){
        //Given
        Game game = new Game();
        char symbol = 'O';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbol;
        plansza[0][1] = symbol;
        plansza[0][2] = symbol;
        plansza[1][0] = symbol;
        plansza[1][1] = symbol;
        plansza[1][2] = symbol;
        plansza[2][0] = symbol;
        plansza[2][1] = symbol;
        plansza[2][2] = symbol;

        //When
        boolean testWygranaWiersz = game.wygranaWiersze(plansza,symbol);
        //Then
        Assertions.assertEquals(testWygranaWiersz, true);
    }

    @Test
    void testOKolumny(){
        //Given
        Game game = new Game();
        char symbol = 'O';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbol;
        plansza[0][1] = symbol;
        plansza[0][2] = symbol;
        plansza[1][0] = symbol;
        plansza[1][1] = symbol;
        plansza[1][2] = symbol;
        plansza[2][0] = symbol;
        plansza[2][1] = symbol;
        plansza[2][2] = symbol;

        //When
        boolean testWygranaKolumna = game.wygranaKolumny(plansza,symbol);
        //Then
        Assertions.assertEquals(testWygranaKolumna, true);
    }

    @Test
    void testOSkosy(){
        //Given
        Game game = new Game();
        char symbol = 'O';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbol;
        plansza[0][1] = symbol;
        plansza[0][2] = symbol;
        plansza[1][0] = symbol;
        plansza[1][1] = symbol;
        plansza[1][2] = symbol;
        plansza[2][0] = symbol;
        plansza[2][1] = symbol;
        plansza[2][2] = symbol;

        //When
        boolean testWygranaSkos1 = game.wygranaSkos1(plansza,symbol);
        boolean testWygrywaSkos2 = game.wygranaSkos2(plansza,symbol);
        //Then
        Assertions.assertEquals(testWygranaSkos1, true);
        Assertions.assertEquals(testWygrywaSkos2, true);
    }

    @Test
    void testRemis(){
    //Given

        Game game = new Game();
        char symbolO = 'O';
        char symbolX = 'X';
        char[][] plansza = new char[3][3];
        plansza[0][0] = symbolO;
        plansza[0][1] = symbolX;
        plansza[0][2] = symbolO;
        plansza[1][0] = symbolO;
        plansza[1][1] = symbolX;
        plansza[1][2] = symbolX;
        plansza[2][0] = symbolX;
        plansza[2][1] = symbolO;
        plansza[2][2] = symbolX;

    //When
        boolean testWierszeX = game.wygranaWiersze(plansza, symbolX);
        boolean testWierszeO = game.wygranaWiersze(plansza, symbolO);
        boolean testKolumnyX = game.wygranaKolumny(plansza, symbolX);
        boolean testKolumnyO = game.wygranaKolumny(plansza, symbolO);
        boolean testSkos1X = game.wygranaSkos1(plansza,symbolX);
        boolean testSkos1O = game.wygranaSkos1(plansza, symbolO);
        boolean testSkos2X = game.wygranaSkos2(plansza, symbolX);
        boolean testSkos2O = game.wygranaSkos2(plansza, symbolO);
        boolean testWygrana;

        if (testWierszeX && testWierszeO && testKolumnyX && testKolumnyO && testSkos1X && testSkos1O && testSkos2X && testSkos2O){
            testWygrana = true;
        }else testWygrana = false;

    //Then
    Assertions.assertEquals(testWygrana, false);

    }



}
