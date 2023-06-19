package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int countSymbols = 0;
        int countSpace = 0;

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(args[0]);

            while (inputStream.available() > 0) {
                char symbol = (char) inputStream.read();
                countSymbols++;
                if (symbol == ' ') {
                    countSpace++;
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
                double result = (double) countSpace / countSymbols * 100;
                System.out.printf("%.2f", result);
            }
        }
    }
}
