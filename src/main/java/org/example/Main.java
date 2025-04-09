package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try{
            fin = new FileInputStream("TEST.txt");
            fout = new FileOutputStream("TEST2.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            }while(i!=-1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try{
                if(fin!=null) {
                    fin.close();
                }
                if(fout != null) {
                    fout.close();
                }
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}