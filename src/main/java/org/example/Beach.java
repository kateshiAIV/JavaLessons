package org.example;

import static java.lang.Thread.sleep;

public class Beach{

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
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(stones + " " + Thread.currentThread().getName());

        }
    }

}
