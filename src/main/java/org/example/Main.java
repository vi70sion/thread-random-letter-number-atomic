package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Sukurti keturias klases, kurios įgyvendina Runnable sąsają:
//        class CapitalRandomLetter :
//        Generuoja atsitiktine raide nuo ‚A‘ iki ‚F‘
//        Atspausdina esamos gijos pavadinimą ir sugeneruotą raidę
//        class LowercaseRandomLetter :
//        Generuoja atsitiktine raide nuo ‚a‘ iki ‚f‘
//        Atspausdina esamos gijos pavadinimą ir sugeneruotą raidę
//        class PositiveRandomNumber:
//        Generuoja atsitiktinį teigiamą skaičių nuo 0 iki 100
//        Atspausdina esamos gijos pavadinimą ir sugeneruotą skaičių
//        class NegativeRandomNumber:
//        Generuoja atsitiktinį neigiamą skaičių nuo 0 iki 100
//        Atspausdina esamos gijos pavadinimą ir sugeneruotą skaičių
//        Sukuriam gijas, suteikiam pavadinimus ir startuojam.

        Thread thread1 = new Thread(new CapitalRandomLetter(), "CapitalRandomLetter");
        Thread thread2 = new Thread(new LowercaseRandomLetter(), "LowercaseRandomLetter");
        Thread thread3 = new Thread(new PositiveRandomNumber(), "PositiveRandomNumber");
        Thread thread4 = new Thread(new NegativeRandomNumber(), "NegativeRandomNumber");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(3000);
        System.out.println();

//        Užduotis 01:
//        Sukurti ‚CountTen‘ klasę, kuri įgyvendina Runnable sąsają
//        Perrašyti metodą run(), kuris skaičiuoja nuo 1 iki 10 kas 1 sekundę, atspausdinam skaičius,
//        kartu su gijos pavadinimu
//        Sukuriam ir paleidžiam 2 gijas.

        Thread thread5 = new Thread(new CountTen(), "Thread5");
        Thread thread6 = new Thread(new CountTen(), "Thread6");
        thread5.start();
        thread6.start();

//        Ciklo pagalba sukuriam ir paleidžiame keturias gijas

        Thread.sleep(11000);
        System.out.println();
        for(int i = 1; i <= 4; i++){
            Thread thread = new Thread(new CountTen(), "Thread" + i);
            thread.start();
        }

//        Sukurti ‚CountFive‘ klasę, kuri įgyvendina Runnable sąsają
//        Perrašyti metodą run(), kuris skaičiuoja nuo 1 iki 5 kas x milisekundžių
//        Prieš paleidžiant ciklą nustatome x milisekundes atsitiktiniu būdu intervale nuo 500 iki 2000.
//        atspausdinam skaičius, kartu su gijos pavadinimu
//        Ciklo pagalba sukuriam ir paleidžiam 4 gijas.

        Thread.sleep(11000);
        System.out.println();
        for(int i = 1; i <= 4; i++){
            Thread thread = new Thread(new CountFive(), "Thread" + i);
            thread.start();
        }

//        Sukurkite keturias gijas, kurios skaičiuoja atsitiktinį skaičių nuo 1 iki 1000,
//        kiekviena atlieka savo veiksmus su 100 milisekundžių pauze tarp skaičiavimų.
//        Pirmoji gija, kuri pasieks bendrą 1000 taškų sumą (per kelis skaičiavimus),
//        turėtų paskelbti savo laimėjimą.
//        Užtikrinkite, kad tik viena gija gali būti paskelbta laimėtoja.

        Thread.sleep(8000);
        System.out.println("------------Užduotis 07------------");
        for (int i = 1; i <= 4; i++) {
            Thread thread = new Thread(new RandomNumberSumTo1000(), "Thread" + i);
            thread.start();
        }


    }
}