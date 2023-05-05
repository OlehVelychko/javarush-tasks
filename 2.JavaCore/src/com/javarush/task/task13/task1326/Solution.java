package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        BufferedInputStream bufferInStr = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine(); // /Users/narsil/Desktop/taskNumbers

        try {
            inputStream = new FileInputStream(path);
            bufferInStr = new BufferedInputStream(inputStream);
            ArrayList<Integer> numbers = new ArrayList<>();

            int bytesRead;
            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];

            while ((bytesRead = bufferInStr.read(buffer, 0, bufferSize)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                String[] stringNumbers = data.split("\n");
                for (String stringNumber : stringNumbers) {
                    int number = Integer.parseInt(stringNumber.trim());
                    numbers.add(number);
                }
            }

            /*Iterator<Integer> myIterator = numbers.iterator();
            while (myIterator.hasNext()) {
                int number = myIterator.next();
                if (Math.abs(number) % 2 != 0) {
                    myIterator.remove();
                }
            }*/

            numbers.removeIf(number -> Math.abs(number) % 2 != 0); // replaced Iterator at .removeIf

            Collections.sort(numbers);

            for (int number : numbers) {
                System.out.println(number);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            reader.close();
        }
    }
}
