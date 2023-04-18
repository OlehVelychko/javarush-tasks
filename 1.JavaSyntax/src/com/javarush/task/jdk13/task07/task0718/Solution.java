package com.javarush.task.jdk13.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.ArrayList;

/* 
Сортировка списка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(0).length() < list.get(1).length()) {
                if (list.get(i).length() < list.get(i + 1).length()) {
                    continue;
                } else {
                    System.out.println(list.indexOf(list.get(i + 1)));
                    break;
                }
            } else {
                System.out.println(list.indexOf(list.get(0)));
                break;
            }
        }
    }
}

