package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        List<String> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        }

        for (String line : data) {
            String[] dataLine = line.split(" ");

            String name = "";
            int day = Integer.parseInt(dataLine[dataLine.length - 3]);
            int month = Integer.parseInt(dataLine[dataLine.length - 2]);
            int year = Integer.parseInt(dataLine[dataLine.length - 1]);

            for (int i = 0; i < dataLine.length - 3; i++) {
                name = name + dataLine[i] + " ";
            }
            name = name.trim();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            String formattedDate = String.format("%02d %02d %04d", day, month, year);
            Date birthDate = null;
            try {
                birthDate = dateFormat.parse(formattedDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(name, birthDate);
            PEOPLE.add(person);
        }

        /*SimpleDateFormat outputFormat = new SimpleDateFormat("dd MM yyyy");
        for (Person person : PEOPLE) {
            String formattedBirthDate = outputFormat.format(person.getBirthDate());
            System.out.println(person.getName() + " " + formattedBirthDate);
        }*/
    }
}