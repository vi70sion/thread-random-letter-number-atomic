package org.example;

import java.util.Random;

public class Writer implements Runnable{
    private ReadWritePriority readersWriters;

    public Writer(ReadWritePriority rw) {
        this.readersWriters = rw;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                readersWriters.startWrite();
                System.out.println(Thread.currentThread().getName() + " writes");
                Thread.sleep(500 + random.nextInt(501)); // Todo failo rašymas
                readersWriters.endWrite();
                Thread.sleep(500 + random.nextInt(501));
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}
