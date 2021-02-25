//task2
//find amount of lucky tickets on tram from 000001 to 999999
package com.p0n0marenk0;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                String time = String.format("%03d%03d", i, j);
                Integer number0 = Integer.valueOf(time.substring(0, 1));
                Integer number1 = Integer.valueOf(time.substring(1, 2));
                Integer number2 = Integer.valueOf(time.substring(2, 3));
                Integer number3 = Integer.valueOf(time.substring(3, 4));
                Integer number4 = Integer.valueOf(time.substring(4, 5));
                Integer number5 = Integer.valueOf(time.substring(5));
                if ((number0 + number1 + number2) == (number3 + number4 + number5)) {
                    count++;
                }
            }
        }
        System.out.println("В пачке билетов было замечено " + count + " счастливых пассажира.");
    }
}