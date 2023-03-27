package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        String res = "неизвестный";
        if (url.startsWith("https")) {
            res = "https";
        } else if (url.startsWith("http")) {
            res = "http";
        }
        return res;
    }

    public static String checkDomain(String url) {
        String res = "неизвестный";
        if (url.endsWith("com")) {
            res = "com";
        } else if (url.endsWith("net")) {
            res = "net";
        } else if (url.endsWith("org")) {
            res = "org";
        } else if (url.endsWith("ru")) {
            res = "ru";
        }
        return res;
    }
}
