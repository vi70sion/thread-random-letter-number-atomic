package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {


//        Sukurkite keturias gijas, kurios skaičiuoja atsitiktinį skaičių nuo 1 iki 1000,
//        kiekviena atlieka savo veiksmus su 100 milisekundžių pauze tarp skaičiavimų.
//        Pirmoji gija, kuri pasieks bendrą 1000 taškų sumą (per kelis skaičiavimus),
//        turėtų paskelbti savo laimėjimą.
//        Užtikrinkite, kad tik viena gija gali būti paskelbta laimėtoja.

        System.out.println("------------Užduotis 07------------");
        for (int i = 1; i <= 4; i++) {
            Thread thread = new Thread(new RandomNumberSumTo1000(), "Thread" + i);
            thread.start();
        }

//        Skaitytojų-rašytojų problema
//        Sukurkite „skaitytojų-rašytojų“ problemos sprendimą, kurį galima atlikti per kelias gijas.
//        Keli skaitytojai (gijos) gali skaityti iš bendro failo arba duomenų struktūros tuo pačiu metu,
//        tačiau tik vienas rašytojas gali rašyti duomenis tuo metu, kai niekas kitas neskaito ir nerašo.
//        Rašytojai turi turėti prioritetą prieš skaitytojus.

        Thread.sleep(5000);
        System.out.println("------------Užduotis 08------------");

        ReadWritePriority readersWriters = new ReadWritePriority();

        Thread reader1 = new Thread(new Reader(readersWriters), "Reader1");
        Thread reader2 = new Thread(new Reader(readersWriters), "Reader2");
        Thread writer1 = new Thread(new Writer(readersWriters), "Writer1");
        Thread writer2 = new Thread(new Writer(readersWriters), "Writer2");
        reader1.start();
        reader2.start();
        writer1.start();
        writer2.start();


    }
}