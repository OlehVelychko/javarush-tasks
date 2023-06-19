package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        ArrayList<Integer> resultData = new ArrayList<>();

        while (inputStream.available() > 0) {
            resultData.add(inputStream.read());
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int data : resultData) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>(map.keySet());

        Collections.sort(result);

        for (int data : result) {
            System.out.print(data + " ");
        }

        inputStream.close();

    }
}
