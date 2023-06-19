package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine(); // /Users/narsil/Documents/file_a
        String fileName2 = reader.readLine(); // /Users/narsil/Documents/file_b

        List<Integer> result = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName1);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] numbersArray = line.split(" ");
                for (String number : numbersArray) {
                    double oneNumber = Double.parseDouble(number);
                    int resultNumber = (int) Math.round(oneNumber);
                    result.add(resultNumber);
                }
            }
        }

        try (FileWriter writer = new FileWriter(fileName2)) {
            StringBuilder builder = new StringBuilder();
            for (int number : result) {
                builder.append(number).append(" ");
            }
            builder.deleteCharAt(builder.length() - 1);
            writer.write(builder.toString());
        }
    }
}
