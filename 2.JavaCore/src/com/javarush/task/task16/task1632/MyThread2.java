package com.javarush.task.task16.task1632;

/**
 * class for point 2 realization
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException exception) {
            System.out.println("InterruptedException");
        }
    }
}
