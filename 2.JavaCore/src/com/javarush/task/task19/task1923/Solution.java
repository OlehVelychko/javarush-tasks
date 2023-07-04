package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter reader2 = new BufferedWriter(new FileWriter(fileName2))) {
            String line;

//            Pattern pattern = Pattern.compile("\\b\\w*\\d+\\w*\\b");
            Pattern pattern = Pattern.compile("\\b\\S*\\d+\\S*\\b");

            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String word = matcher.group();
                    reader2.write(word + " ");
                }
            }

        } catch (IOException exception) {

        }

    }
}
