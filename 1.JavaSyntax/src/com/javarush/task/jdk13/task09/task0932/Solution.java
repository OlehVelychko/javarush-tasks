package com.javarush.task.jdk13.task09.task0932;

/* 
Количество слов в строке
*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {
        String[] res = string.split(" ");
//        System.out.println(Arrays.toString(res));
        return res.length;
    }
}
