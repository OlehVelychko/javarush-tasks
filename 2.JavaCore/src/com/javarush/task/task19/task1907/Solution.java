package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        int count = 0;
        String target = "world";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = reader.readLine(); // /Users/narsil/Desktop/test files/file_a
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\W");

                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
