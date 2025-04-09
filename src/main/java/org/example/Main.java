package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("airorders_data2.csv");
        FileOutputStream fout = new FileOutputStream("TEST3.txt")){
            int i;
            do{
                i = fin.read();

                if(i != (int)';'){
                    fout.write(i);
                }else {
                    fout.write((int)'-');
                    fout.write((int)'-');
                    fout.write((int)'-');
                    fout.write((int)'>');
                }

            }while(i != -1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}