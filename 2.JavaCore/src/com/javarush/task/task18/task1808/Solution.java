/*
package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.ArrayList;

*/
/*
Разделение файла
*//*


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileNAme1 = reader.readLine(); // "/Users/narsil/Documents/file_a"
        String fileNAme2 = reader.readLine(); // "/Users/narsil/Documents/file_b"
        String fileNAme3 = reader.readLine(); // "/Users/narsil/Documents/file_с"

        FileInputStream inputStream = new FileInputStream(fileNAme1);

        FileOutputStream outputStream1 = new FileOutputStream(fileNAme2);
        FileOutputStream outputStream2 = new FileOutputStream(fileNAme3);

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            arrayList.add(data);
        }

        if (arrayList.size() % 2 == 0) {
            for (int i = 0; i < arrayList.size() / 2; i++) {
                outputStream1.write(arrayList.get(i));
            }
            for (int i = arrayList.size() / 2; i < arrayList.size(); i++) {
                outputStream2.write(arrayList.get(i));
            }
        } else {
            for (int i = 0; i < arrayList.size() / 2 + 1; i++) {
                outputStream1.write(arrayList.get(i));
            }
            for (int i = arrayList.size() / 2 + 1; i < arrayList.size(); i++) {
                outputStream2.write(arrayList.get(i));
            }
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
*/

package com.javarush.task.task18.task1808;

import java.io.*;

/*
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = "/Users/narsil/Documents/file_a";
        String outputFile1 = "/Users/narsil/Documents/file_b";
        String outputFile2 = "/Users/narsil/Documents/file_с";

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());
            }
        }
    }
}
