package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayDeque;
import java.util.Queue;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Solution {
    public static void main(String[] args) throws IOException {
        String directoryName;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            directoryName = reader.readLine();
            Path path = Paths.get(directoryName);
            if (!Files.isDirectory(path)) {
                System.out.printf("%s  - не папка", directoryName);
                throw new IllegalArgumentException(directoryName + " - не папка");
            } else {
                AtomicInteger countFiles = new AtomicInteger(0);
                AtomicInteger countFolders = new AtomicInteger(- 1);
                AtomicLong totalSize = new AtomicLong(0);
                countFilesAndFolders(path, countFiles, countFolders, totalSize);

                System.out.println("Всего папок - " + countFolders);
                System.out.println("Всего файлов - " + countFiles);
                System.out.println("Общий размер - " + totalSize);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException exception) {
            exception.getMessage();
        }
    }

    public static void countFilesAndFolders(Path rootPath, AtomicInteger countFiles, AtomicInteger countFolders, AtomicLong totalSize) {
        Queue<Path> queue = new ArrayDeque<>();
        queue.add(rootPath);

        while (!queue.isEmpty()) {
            Path currentPath = queue.poll();
            if (Files.isDirectory(currentPath)) {
                countFolders.incrementAndGet();
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentPath)) {
                    for (Path entry : stream) {
                        queue.add(entry);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                countFiles.incrementAndGet();
                try {
                    totalSize.addAndGet(Files.size(currentPath));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
