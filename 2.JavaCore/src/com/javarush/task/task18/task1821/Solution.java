package com.javarush.task.task18.task1821;

import java.io.*;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> result = new HashMap<>();

        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                char character = (char) data;
                result.put(character, result.getOrDefault(character, 0) + 1);
            }
        }

        /*for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(result.entrySet());

        /*for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry);
        }*/

        Collections.sort(entries, Comparator.comparingInt(e -> (int) e.getKey()));

        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
