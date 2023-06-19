package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String flag = "";
        if (args.length != 0) {
            flag = args[0];
        }

        if (flag.equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();

            String productName = "";
            String price;
            String quantity;

            int id;
            int maxId = 0;


            try (FileReader fileReader = new FileReader(fileName);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    int idLine = Integer.parseInt(line.substring(0, 8).trim());

                    if (idLine > maxId) {
                        maxId = idLine;
                    }
                }
            }

            try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                String newLine;
                id = ++maxId;
                String idString = String.valueOf(id);
                idString = String.format("%-8s", idString).substring(0, 8);

                for (int i = 1; i < args.length - 2; i++) {
                    productName += args[i] + " ";
                }

                productName = String.format("%-30s", productName).substring(0, 30);

                price = args[args.length - 2];
                price = String.format("%-8s", price).substring(0,8);

                quantity = args[args.length - 1];
                quantity = String.format("%-4s", quantity).substring(0, 4);

                newLine = idString + productName + price + quantity;

                fileWriter.write(System.lineSeparator());
                fileWriter.write(newLine);
            }
        }
    }
}
