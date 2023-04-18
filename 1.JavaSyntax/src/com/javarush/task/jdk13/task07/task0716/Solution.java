package com.javarush.task.jdk13.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("мера");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        char symbol1 = 'р';
        char symbol2 = 'л';
        boolean isSymbol1 = false;
        boolean isSymbol2 = false;

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < strings.size(); i++) {
            String word = strings.get(i);
            char[] symbols = word.toCharArray();

            for (char symbol : symbols) {
                if (symbol == symbol1) {
                    isSymbol1 = true;
                } else if (symbol == symbol2) {
                    isSymbol2 = true;
                }

            }

            if ((isSymbol1 && isSymbol2) || (!isSymbol1 && !isSymbol2)) {
                result.add(strings.get(i));
                isSymbol1 = false;
                isSymbol2 = false;
                continue;
            }
            if (isSymbol1) {
                isSymbol1 = false;
                isSymbol2 = false;
                continue;
            }
            if (isSymbol2) {
                result.add(strings.get(i));
                result.add(strings.get(i));
            }

            isSymbol1 = false;
            isSymbol2 = false;

        }

        return result;
    }
}