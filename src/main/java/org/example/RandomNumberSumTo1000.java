package org.example;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class RandomNumberSumTo1000 implements Runnable{
    private static final AtomicBoolean winnerFound = new AtomicBoolean(false);
    @Override
    public void run() {
        Random random = new Random();
        int sum = 0;
        while(!winnerFound.get()){
            sum += random.nextInt(1000) + 1;
            System.out.println(Thread.currentThread().getName() + ": " + sum);
            if (sum >= 1000 && !winnerFound.get()) {
                winnerFound.set(true);
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
