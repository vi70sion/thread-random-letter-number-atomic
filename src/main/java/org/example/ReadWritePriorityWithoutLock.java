package org.example;

public class ReadWritePriorityWithoutLock {
    private int readers = 0;
    private int writersWaiting = 0;
    private boolean isWriting = false;

    public synchronized void startRead() throws InterruptedException {
        while (writersWaiting > 0 || isWriting) {
            wait();  // waiting write end
        }
        readers++;
    }

    public synchronized void endRead() {
        readers--;
        if (readers == 0) {
            notifyAll();  // Pranešame, kad dabar rašytojai gali pradėti rašyti
        }
    }

    public synchronized void startWrite() throws InterruptedException {
        writersWaiting++;
        while (readers > 0 || isWriting) {
            wait();  // Laukiame, kol skaitytojai baigs skaityti arba kitas rašytojas baigs rašyti
        }
        writersWaiting--;
        isWriting = true;  // Rašytojas pradeda rašyti
    }

    // Metodas, leidžiantis baigti rašyti
    public synchronized void endWrite() {
        isWriting = false;
        notifyAll();  // Pranešame, kad dabar skaitytojai ir kiti rašytojai gali veikti
    }
}


