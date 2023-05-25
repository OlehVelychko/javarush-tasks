package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new MyThread1();
        Thread thread2 = new MyThread2();
        Thread thread3 = new MyThread3();
        Thread thread4 = new MyThread4();
        Thread thread5 = new MyThread5();

        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) {

        /*for (Thread thread : threads) {
            thread.start();
        }*/

        threads.get(1).start();
    }
}