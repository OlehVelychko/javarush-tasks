package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // /Users/narsil/Documents/file_a

        FileInputStream inputStream = new FileInputStream(fileName);

        ArrayList<Integer> resultData = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            resultData.add(data);
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int data : resultData) {
            map.put(data, map.getOrDefault(data, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        for (int count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int data : resultData) {
            if (map.get(data) == maxCount && !result.contains(data)) {
                result.add(data);
            }
        }

        for (int data : result) {
            System.out.print(data + " ");
        }

        inputStream.close();
    }
}
