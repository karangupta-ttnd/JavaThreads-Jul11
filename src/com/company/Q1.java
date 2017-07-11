package com.company;


public class Q1 {

    static int i = 0;

    public static void main(String[] args) {

        new Thread(() -> {

            while (i <= 20) {
                if (i % 2 == 0) {
                    System.out.println("Even number :" + i);
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
            }
        }).start();

        new Thread(() -> {

            while (i <= 20) {
                if (i % 2 != 0) {
                    System.out.println("Odd number :" + i);
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                i++;
            }
        }).start();


    }

}
