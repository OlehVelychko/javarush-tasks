package com.javarush.task.jdk13.task09.task0918;

/* 
Создаем свои исключения
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends MyException {
    }

    static class MyException3 extends OutOfMemoryError {
    }

    static class MyException4 extends MyException3 {
    }
}

