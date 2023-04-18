package com.javarush.task.jdk13.task07.task0707;

import java.util.ArrayList;

/* 
5 различных строк в списке
*/

public class Solution {
    
    public static ArrayList<String> list;
    
    public static void main(String[] args) {
        list = new ArrayList<String>();

        list.add("dad");
        list.add("dadkjb");
        list.add("dklnlad");
        list.add("dap;kop;d");
        list.add("dadcd");

        System.out.println(list.size());

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/

        for (String stroka : list) {
            System.out.println(stroka);
        }
    }
}
