package com.javarush.task.task16.task1632;

/**
 * class for point 3 realization
 */
public class MyThread3 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ура");
                sleep(500);
            }
        } catch (InterruptedException exception) {

        }
    }
}
