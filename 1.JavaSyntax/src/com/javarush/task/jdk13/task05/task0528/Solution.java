package com.javarush.task.jdk13.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        /*DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // dd/MM/yyyy
        Calendar cal = Calendar.getInstance();
        System.out.println(SimpleDateFormat.getDateInstance());*/

        /*Date date = new Date();
        System.out.println(date.getDate() + " " + date.getMonth() + " " + (date.getYear() + 1900));*/

        SimpleDateFormat simpleToday = new SimpleDateFormat("dd MM yyyy");
        Date today = new Date();
//        System.out.println(today);
        System.out.println(simpleToday.format(today));
    }
}
