package org.example;

public class Goose extends Thread{
    Beach beach;
    Goose(Beach beach, String name){
        super(name);
        this.beach = beach;
    }
    @Override
    public void run() {
        super.run();
        while(true){
            try {


                if(beach.stones <= 0){
                    sleep(10000);
                }else{
                    beach.pull();
                    sleep(1000);
                }


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
