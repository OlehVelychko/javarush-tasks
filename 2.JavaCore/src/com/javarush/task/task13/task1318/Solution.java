package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* 
Чтение файла
*/

/*public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            inputStream = new FileInputStream(reader.readLine()); // /Users/narsil/Desktop/Shmotya.txt
            buffer = new BufferedInputStream(inputStream);

            while (buffer.available() > 0) {
                char c = (char) buffer.read();

                System.out.println(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            buffer.close();
            reader.close();
        }
    }
}*/


/*public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        fileReader.close();
        bufferedReader.close();
        inputStream.close();
    }

}*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = null;
        BufferedInputStream buffer = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String path = reader.readLine(); // /Users/narsil/Desktop/Шматя

        try {
            inputStream = new FileInputStream(path);
            buffer = new BufferedInputStream(inputStream);
            StringBuilder stringBuilder = new StringBuilder();

            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                if (c == '\n') {
                    System.out.println(stringBuilder.toString());
                    stringBuilder = new StringBuilder();
                } else {
                    stringBuilder.append(c);
                }
            }

            if (stringBuilder.length() > 0) {
                System.out.println(stringBuilder.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (buffer != null) {
                buffer.close();
            }
            reader.close();
        }
    }
}