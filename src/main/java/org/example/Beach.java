package org.example;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Beach{
    Random rand = new Random();
    private final Object lock = new Object();
    int stones = 0;
    Beach(int stones){
        this.stones = stones;
    }
    public synchronized void put(int num){
        synchronized (lock){
            stones+=num;
            System.out.println(stones + " " + Thread.currentThread().getName());
        }
    }

    public synchronized void pull(){
        synchronized (lock){
            stones--;
            try{
                int time = rand.nextInt(10);
                System.out.println(Thread.currentThread().getName() + " Не спиздил ни одного камушка и пошел спать на " + time + "Секунд");
                sleep(100*time);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " Спиздил " + stones + " камушков");

        }
    }

}
