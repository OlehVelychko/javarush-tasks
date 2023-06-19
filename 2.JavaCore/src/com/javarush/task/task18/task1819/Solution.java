package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1; // /Users/narsil/Documents/file_a
        String fileName2; // /Users/narsil/Documents/file_b

        BufferedReader reader = null;
        FileInputStream inputStream1 = null;
        FileOutputStream outputStream1 = null;
        FileInputStream inputStream2 = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            fileName1 = reader.readLine();
            fileName2 = reader.readLine();

            inputStream1 = new FileInputStream(fileName1);
            byte[] buffer1 = new byte[inputStream1.available()];
            inputStream1.read(buffer1);

            inputStream2 = new FileInputStream(fileName2);
            byte[] buffer2 = new byte[inputStream2.available()];
            inputStream2.read(buffer2);

            byte[] combinedBuffer = new byte[buffer1.length + buffer2.length];
            System.arraycopy(buffer2, 0, combinedBuffer, 0, buffer2.length);
            System.arraycopy(buffer1, 0, combinedBuffer, buffer2.length, buffer1.length);

            outputStream1 = new FileOutputStream(fileName1);
            outputStream1.write(combinedBuffer);
        }
        finally {
            if (reader != null) {
                reader.close();
            }
            if (inputStream1 != null) {
                inputStream1.close();
            }
            if (outputStream1 != null) {
                outputStream1.close();
            }
            if (inputStream2 != null) {
                inputStream2.close();
            }
        }
    }
}
