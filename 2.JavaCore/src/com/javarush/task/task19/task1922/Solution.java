package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    /*static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }*/

    static {
        words.add("А");
        words.add("Б");
        words.add("В");
    }

    public static int count = 2;

    public static void main(String[] args) {
        String fileName = null;

        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));) {
            fileName = console.readLine();
        } catch (IOException e) {
            System.out.println("wrong");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String line;
            String[] tokens;
            int updateCount = 0;

            while ((line = reader.readLine()) != null) {
                tokens = line.split(" ");

                for (int i = 0; i < tokens.length; i++) {
                    for (int j = 0; j < words.size(); j++) {
                        if (tokens[i].equals(words.get(j))) {
                            updateCount++;
                        }
                    }
                }

                if (updateCount == count) {
                    System.out.println(line);
                }

                updateCount = 0;

            }

        } catch (IOException exception) {
            System.out.println("worse");
        }
    }
}
