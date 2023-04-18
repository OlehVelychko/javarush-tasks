package com.javarush.task.jdk13.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальное или максимальное
*/

public class Solution {

    public static ArrayList<String> strings;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        String minSize = strings.get(0);
        String maxSize = strings.get(0);

        for (int i = 1; i < strings.size(); i++) {
            if (strings.get(i).length() < minSize.length()) {
                minSize = strings.get(i);
            }
            if (strings.get(i).length() > maxSize.length()) {
                maxSize = strings.get(i);
            }
        }

        for (String stroka : strings) {
            if (stroka.equals(minSize) || stroka.equals(maxSize)) {
                System.out.println(stroka);
                break;
            }
        }
    }
}
