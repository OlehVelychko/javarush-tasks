package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        String fileName2 = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            String line;
            List<String> list = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\s+");

                for (String word : tokens) {
                    if (word.length() > 6) {
                      list.add(word);
                    }
                }
            }

            String result = String.join(",", list);
            writer.write(result);
        } catch (IOException exception) {

        }
    }
}
