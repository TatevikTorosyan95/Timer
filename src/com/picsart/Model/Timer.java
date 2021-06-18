package com.picsart.Model;

import java.util.Scanner;

public class Timer implements Runnable {
    @Override
    public void run() {
        boolean valid = false;
        int sec = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter minutes");
        int min = s.nextInt();

        System.out.println("Enter seconds");

        while (valid == false) {
            sec = s.nextInt();
            if (sec < 60) {
                valid = true;
            } else {
                System.out.println("Please enter number between 0-59");
            }
        }

        for (int i = min; i >= 0; i--) {
            for (int j = sec; j >= 0; j--) {
                if (j == 0) {
                    sec = 59;
                }
                System.out.printf("%02d:%02d\n", i,j);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
