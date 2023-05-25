package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * class for point 1 realization
 */
public class MyThread5 extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exit = "N";
        String input;
        int sum = 0;

        try {
            while (!(input = reader.readLine()).equals(exit)) {
                sleep(1);
                int number = Integer.parseInt(input);
                sum += number;
            }
        } catch (InterruptedException | IOException | NumberFormatException e) {
//            System.out.println(sum);
        }
        System.out.println(sum);

    }
}
