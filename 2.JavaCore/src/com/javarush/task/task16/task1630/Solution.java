package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Последовательный вывод файлов*/

public class Solution {

    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private StringBuffer content;
        private String forPath = "/Users/narsil/Documents/";


        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            if (content == null) {
                return "";
            }
            return content.toString().trim();
        }

        @Override
        public void run() {
            content = new StringBuffer();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(forPath + fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append(" ");
                }
                reader.close();
            } catch (IOException e) {
            }
        }
    }
}