package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        if (is == null) {
            return new StringWriter(); // Создаём пустой StringWriter, чтобы не возвращать null
        }

        StringWriter writer = new StringWriter();
        InputStreamReader reader = new InputStreamReader(is);
        char[] buffer = new char[1024];
        int bytesRead;

        try {
            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // Обрабатываем возможные исключения
            e.printStackTrace();
        } finally {
            reader.close();
        }

        return writer;
    }
}

