package com.javarush.task.task16.task1632;

/**
 * class for point 4 realization
 */
public class MyThread4 extends Thread implements Message {
    @Override
    public void run() {
        while (!isInterrupted()) {

        }
    }

    @Override
    public void showWarning() {
        this.interrupt();
    }
}
