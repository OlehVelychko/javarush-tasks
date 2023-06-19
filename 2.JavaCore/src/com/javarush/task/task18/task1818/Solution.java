package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        String fileName3;

        BufferedReader reader = null;
        FileInputStream fileInputStream2 = null;
        FileInputStream fileInputStream3 = null;
        FileOutputStream fileOutputStream1 = null;

        try {
            reader = new BufferedReader(new InputStreamReader(System.in));

            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            fileName3 = reader.readLine();

            fileOutputStream1 = new FileOutputStream(fileName1, true);
            fileInputStream2 = new FileInputStream(fileName2);
            fileInputStream3 = new FileInputStream(fileName3);

            while (fileInputStream2.available() > 0) {
                int data = fileInputStream2.read();
                fileOutputStream1.write(data);
            }

            while (fileInputStream3.available() > 0) {
                int data = fileInputStream3.read();
                fileOutputStream1.write(data);
            }

        }
        finally {
            if (reader != null) {
                reader.close();
            }
            if (fileOutputStream1 != null) {
                fileOutputStream1.close();
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
        }
    }
}
