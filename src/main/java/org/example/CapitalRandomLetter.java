package org.example;

import java.util.Random;

public class CapitalRandomLetter implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        char letter = (char) (random.nextInt(6) + 'A');
        System.out.println(Thread.currentThread().getName() + " sugeneruota raidė yra: " + letter);
    }
}
