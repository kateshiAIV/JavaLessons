package org.example;

public class Boy extends Thread{
    Beach beach;
    Boy(Beach beach, String name){
        super(name);
        this.beach = beach;
    }
    @Override
    public void run() {
        super.run();
        while(true){
            try {

                if(beach.stones > 0){
                    sleep(10000);
                }else{
                    beach.put(10);
                }



            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
