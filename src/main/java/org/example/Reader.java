package org.example;

import java.util.Random;

public class Reader implements Runnable{
    private ReadWritePriority readersWriters;

    public Reader(ReadWritePriority rw) {
        this.readersWriters = rw;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                readersWriters.startRead();
                System.out.println(Thread.currentThread().getName() + " reads");

                Thread.sleep(1 + random.nextInt(501)); // Todo failo skaitymas
                readersWriters.endRead();
                //Thread.sleep(1500 + random.nextInt(501));
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}
