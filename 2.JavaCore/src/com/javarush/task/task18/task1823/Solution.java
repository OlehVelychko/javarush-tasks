package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName;
            while (!(fileName = reader.readLine()).equals("exit")) {
                ReadThread thread = new ReadThread(fileName);
                thread.start();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        public void run() {
            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                Map<Integer, Integer> byteCounts = new HashMap<>();
                int maxByte = -1;
                int maxCount = 0;

                while (inputStream.available() > 0) {
                    int currentByte = inputStream.read();
                    int count = byteCounts.getOrDefault(currentByte, 0) + 1;
                    byteCounts.put(currentByte, count);

                    if (count > maxCount || (count == maxCount && currentByte < maxByte)) {
                        maxByte = currentByte;
                        maxCount = count;
                    }
                }

                resultMap.put(fileName, maxByte);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}