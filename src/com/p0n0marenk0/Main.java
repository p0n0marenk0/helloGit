//task2
//The digital clock shows the time in the format from 00:00 to 23:59.
//Count how many times per day it happens that a symmetrical combination
//is shown to the left of the colon for the one to the right of the colon
//(for example, 02:20, 11:11 or 15:51).
package com.p0n0marenk0;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                String time = String.format("%02d:%02d", i, j);
                if ((time.charAt(0) == time.charAt(4)) && (time.charAt(1) == time.charAt(3))) {
                    count++;
                    System.out.println(time);
                }
            }
        }
        System.out.println("Событий: " + count + " раз.");
    }
}