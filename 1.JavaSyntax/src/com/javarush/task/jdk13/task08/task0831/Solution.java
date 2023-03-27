package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[5];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        BoardGame soccer = new BoardGame();
        soccer.name = "Футбол";
        collection[1] = soccer;

        BoardGame poker = new BoardGame();
        poker.name = "Покер";
        collection[2] = poker;

        BoardGame civilization = new BoardGame();
        civilization.name = "Цивилизация";
        collection[3] = civilization;

        BoardGame lastOfUs = new BoardGame();
        lastOfUs.name = "Последние из нас";
        collection[4] = lastOfUs;


        System.out.println(Arrays.toString(collection));
    }
}