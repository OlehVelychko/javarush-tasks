package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int countEnSymbols = 0;
        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(args[0]);

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                char symbol = (char) data;
                if (isEnSymbol(symbol)) {
                    countEnSymbols++;
                }
            }

        } finally {
            if (inputStream != null) {
                try {
                    System.out.println(countEnSymbols);
                    inputStream.close();
                } catch (IOException e) {

                }
            }
        }
    }

    /**
     * Method checks if a character matches the English alphabet
     *
     * @param symbol
     *
     * @return boolean
     */
    public static boolean isEnSymbol(char symbol) {
        return (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z');
    }

}