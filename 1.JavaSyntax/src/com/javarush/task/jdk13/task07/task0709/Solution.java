package com.javarush.task.jdk13.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая короткая строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> minList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
        }

        String minSize = list.get(0);
        minList.add(0, minSize);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < minSize.length()) {
                minSize = list.get(i);
                minList.set(0, minSize);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == minSize.length() && !list.get(i).equals(minSize)) {
                minList.add(list.get(i));
            }
        }

        for (int i = 0; i < minList.size(); i++) {
            System.out.println(minList.get(i));
        }
    }
}
