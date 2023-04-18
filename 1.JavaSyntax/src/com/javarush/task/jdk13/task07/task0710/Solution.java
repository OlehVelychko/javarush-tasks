package com.javarush.task.jdk13.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
10 строчек в начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());
        list.add(0, reader.readLine());

        for (String stroka : list) {
            System.out.println(stroka);
        }
    }
}
