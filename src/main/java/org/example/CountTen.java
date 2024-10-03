package org.example;

public class CountTen implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); // 1 sekundės pauzė
            } catch (InterruptedException e) {
                System.out.println("Thread error");
            }
        }
    }
}
