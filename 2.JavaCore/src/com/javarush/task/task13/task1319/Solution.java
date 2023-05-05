package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String exit = "exit";
        String path = bufferedReader.readLine(); // /Users/narsil/Desktop/taskNumbers
        ArrayList<String> list = new ArrayList<>();

        String lineAdd;
        while (!(lineAdd = bufferedReader.readLine()).equals(exit)) {
            list.add(lineAdd);
        }
        list.add(exit);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(path));
            for (String line : list) {
                if (!line.equals(exit)) {
                    writer.write(line);
                    writer.newLine();
                } else {
                    writer.write(line);
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
