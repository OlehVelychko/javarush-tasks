package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        /*int index1 = path.indexOf("jdk");
        int index2 = index1 + jdk.length();
        String firstPath = path.substring(0, index1);
        String secondPath = path.substring(index2);
        return firstPath + jdk + secondPath;*/
        int name = path.indexOf("jdk");
        int ver = path.indexOf("/", name);
        String result = path.substring(0, name) + jdk + path.substring(ver);
        return result;
    }
}
