package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        String filename = args[0];

        TreeMap<String, Double> treeMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            String[] tokens;
            while ((line = reader.readLine()) != null) {
                tokens = line.split(" ");
                String key = tokens[0];
                Double value = Double.parseDouble(tokens[1]);
                treeMap.put(key, treeMap.getOrDefault(key, 0.0) + value);
            }
        } catch (IOException exception) {
            System.out.println("something wrong");
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
