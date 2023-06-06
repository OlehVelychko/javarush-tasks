package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach beach) {
        int total1 = 0;
        int total2 = 0;

        if (this.quality > beach.quality) {
            total1++;
        } else if (this.quality < beach.quality) {
            total2++;
        }

        if (this.distance < beach.distance) {
            total1++;
        } else if (this.distance > beach.distance) {
            total2++;
        }

        if (total1 > total2) {
            return 1;
        } else if (total2 > total1) {
            return -1;
        } else {
            return 0;
        }
    }

    public interface Comparable<Beach> {
        int compareTo(Beach beach);
    }


    public static void main(String[] args) {

    }

}
