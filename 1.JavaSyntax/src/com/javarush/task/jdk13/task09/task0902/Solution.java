package com.javarush.task.jdk13.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String result = stackTraceElements[2].getMethodName();

//        System.out.println("for 1 method " + result);

        return result;
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String result = stackTraceElements[2].getMethodName();

//        System.out.println("for 2 method " + result);

        return result;
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String result = stackTraceElements[2].getMethodName();

//        System.out.println("for 3 method " + result);

        return result;
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String result = stackTraceElements[2].getMethodName();

        return result;
    }

    public static String method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String result = stackTraceElements[2].getMethodName();

        return result;
    }
}
