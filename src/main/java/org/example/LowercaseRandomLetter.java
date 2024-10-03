package org.example;

import java.util.Random;

public class LowercaseRandomLetter implements Runnable{
    @Override
    public void run() {
        Random random = new Random();
        char letter = (char) (random.nextInt(6) + 'a');
        System.out.println(Thread.currentThread().getName() + " sugeneruota raidė yra: " + letter);
    }
}
