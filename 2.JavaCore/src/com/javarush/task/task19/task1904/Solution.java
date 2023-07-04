package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            if (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(" ");
                String lastName = data[0];
                String firstName = data[1];
                String middleName = data[2];
                Date birthDate = new Date(Integer.parseInt(data[5]) - 1900, Integer.parseInt(data[4]) - 1, Integer.parseInt(data[3]));
                return new Person(firstName, middleName, lastName, birthDate);
            } else {
                throw new IOException("No more data to read.");
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
