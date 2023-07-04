package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine(); // /Users/narsil/Desktop/test files/file_a
            fileName2 = reader.readLine();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    try {
                        int number = Integer.parseInt(word);
                        bufferedWriter.write(number + " ");
                    } catch (NumberFormatException ignored) {
                        // пропуск
                    }
                }
            }
        }
    }
}
