package com.javarush.task.jdk13.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные буквы
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String enter = reader.readLine();
        char[] symbols = enter.toCharArray();

        for (char symbol : symbols) {
            if (isVowel(symbol)) {
                System.out.print(symbol + " ");
            }
        }

        System.out.println();

        for (char symbol : symbols) {
            if (!isVowel(symbol)  && !Character.isWhitespace(symbol)) {
                System.out.print(symbol + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}