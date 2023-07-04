package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        String fileName = args[0];
        TreeMap<String, Double> treeMap = new TreeMap<>();
        Double maxValue = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] tokens;

            while ((line = reader.readLine()) != null) {
                tokens = line.split(" ");
                String key = tokens[0];
                Double value = Double.parseDouble(tokens[1]);
                treeMap.put(key, treeMap.getOrDefault(key, 0.0) + value);

            }

            for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                }
            }
        } catch (IOException exception) {
            System.out.println("worse");
        }

        for (Map.Entry<String, Double> entry : treeMap.entrySet()) {
            if (Objects.equals(entry.getValue(), maxValue)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
