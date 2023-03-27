package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    /*public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] results = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreTokens()) {
            results[results.length - stringTokenizer.countTokens()] = stringTokenizer.nextToken();
        }
        return results;
    }*/
    public static String[] getTokens(String query, String delimiter) {
        /*StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] results = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
//            String token = tokenizer.nextToken();
            results[results.length - tokenizer.countTokens()] = tokenizer.nextToken();
//            Arrays.fill(results, token);
        }
        return results;
//        return query.split(delimiter);*/
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;
    }
}
