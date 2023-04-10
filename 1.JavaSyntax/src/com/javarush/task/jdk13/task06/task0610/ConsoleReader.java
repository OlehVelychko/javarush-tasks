package com.javarush.task.jdk13.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        return enter.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(enter.readLine());

    }

    public static double readDouble() throws Exception {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(enter.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader enter = new BufferedReader(new InputStreamReader(System.in));
        return enter.readLine().equals("true");
    }

    public static void main(String[] args) throws Exception {

    }
}
