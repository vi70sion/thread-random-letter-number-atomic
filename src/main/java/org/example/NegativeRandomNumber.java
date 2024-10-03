package org.example;

import java.util.Random;

public class NegativeRandomNumber implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        int number = -random.nextInt(101);
        System.out.println(Thread.currentThread().getName() + "  sugeneruotas neigiamas skaičius yra: " + number);
    }
}
