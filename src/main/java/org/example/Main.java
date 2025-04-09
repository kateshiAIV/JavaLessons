package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("AirOrders.csv");
        FileOutputStream fout = new FileOutputStream("AirOrders.txt")){
            int i;
            Boolean A = false;
            Boolean I = false;
            Boolean R = false;
            int ctr = 0;
            do{
                i = fin.read();
                if (i == (int)'R' && I && A ){
                    ctr++;
                    A = false;
                    I = false;
                    R = false;
                }else if(i ==(int)'I' &&  A){
                    I = true;
                }else if (i == (int)'A') {
                    A = true;
                }else{
                    A = false;
                    I = false;
                    R = false;
                }


            }while(i != -1);
            fout.write(ctr);
            System.out.println(ctr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}