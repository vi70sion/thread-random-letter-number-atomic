package org.example;

import java.util.Random;

public class CountFive implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int waitTime = 500 + random.nextInt(1501);
        for (int i = 1; i<= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(waitTime);
            } catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }
}
