//package com.javarush.task.pro.task05.task0511;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
///*
//Создаем двумерный массив
//*/
//
//public class Solution {
//    public static int[][] multiArray;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int rowsCount = Integer.parseInt(reader.readLine()); // считываем количество строк массива
////        String sColumnsCount = reader.readLine(); // числа одной строкой
//
//        multiArray = new int[rowsCount][]; // инициализируем массив количеством строк rowsCount
//        int helpCount = 0;
//
////        for (String sNumber : sColumnsCount.split(" ")) {
////            int number = Integer.parseInt(sNumber);
////            multiArray[helpCount] = new int[]{number};
////            helpCount += 1;
////        }
//
//        while (helpCount < rowsCount) {
//            int number = Integer.parseInt(reader.readLine());
//            multiArray[helpCount] = new int[]{number};
//            helpCount += 1;
//        }
//
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i][0]; j++) {
//                System.out.print("[]");
//            }
//            System.out.println();
//        }
//    }
//}


package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        multiArray = new int[n][];
        for (int i = 0; i < n; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}
