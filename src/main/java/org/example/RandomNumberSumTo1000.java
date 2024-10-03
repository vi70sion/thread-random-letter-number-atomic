package org.example;

import java.util.Random;

public class RandomNumberSumTo1000 implements Runnable{
    private static boolean winnerFound = false;
    @Override
    public void run() {
        Random random = new Random();
        int sum = 0;
        while(!winnerFound){
            sum += random.nextInt(1000) + 1;
            System.out.println(Thread.currentThread().getName() + ": " + sum);
            if (sum >= 1000 && !winnerFound) {
                winnerFound = true;
                System.out.println(Thread.currentThread().getName() + " win! Total: " + sum);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }

    }
}
