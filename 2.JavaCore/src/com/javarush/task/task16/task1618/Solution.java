package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread my = new TestThread();
        my.start();

        Thread.sleep(3000);
        my.interrupt();
    }

    public static class TestThread extends Thread {
        @Override
        public void run() {
            Thread current = Thread.currentThread();

            try {
                while (!current.isInterrupted()) {
                    System.out.println("go");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
//                e.printStackTrace();
                System.out.println("errror");
            }
        }
    }
}