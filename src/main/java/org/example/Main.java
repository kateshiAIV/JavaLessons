package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Beach beach = new Beach(10);
        Boy b1 = new Boy(beach, "Boy");
        Goose g1 = new Goose(beach, "Goose 1");
        Goose g2 = new Goose(beach, "Goose 2");
        Goose g3 = new Goose(beach, "Goose 3");
        Goose g4 = new Goose(beach, "Goose 4");
        b1.start();
        //123
        g1.start();
        g2.start();
        g3.start();
        g4.start();
    }
}