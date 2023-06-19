package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String key = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(fileName);
            outputStream = new FileOutputStream(fileOutputName);

            switch (key) {
                case "-e":
                    while (inputStream.available() > 0) {
                        int data = inputStream.read();
                        outputStream.write(data + 3);
                    }
                    break;
                case "-d":
                    while (inputStream.available() > 0) {
                        int data = inputStream.read();
                        outputStream.write(data - 3);
                    }
                    break;
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException exception) {
                    // обработка исключения закрытия входного потока
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException exception) {
                    // обработка исключения закрытия выходного потока
                }
            }
        }

    }

}
