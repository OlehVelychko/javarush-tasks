package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // /Users/narsil/Documents/file_a
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> resultsData = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            resultsData.add(data);
        }

        // Создаем карту для подсчета повторяющихся чисел
        Map<Integer, Integer> countMap = new HashMap<>();

        // Считаем повторения
        for (int num : resultsData) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Находим минимальное количество повторений
        int minCount = Integer.MAX_VALUE;
        for (int count : countMap.values()) {
            if (count < minCount) {
                minCount = count;
            }
        }

        // Заполняем новый ArrayList с числами, у которых минимальное количество повторений
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : resultsData) {
            if (countMap.get(num) == minCount && !result.contains(num)) {
                result.add(num);
            }
        }

        // Выводим результат
        for (int num : result) {
            System.out.print(num + " ");
        }

        inputStream.close();

    }
}
