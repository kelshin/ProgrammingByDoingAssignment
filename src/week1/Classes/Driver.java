package week1.Classes;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setRecWidth(5);
        r1.setRecHeight(7);
        r1.setRecColor("Blue");
        r1.draw();

        Rectangle r2 = new Rectangle();
        r2.setRecWidth(10);
        r2.setRecHeight(2);
        r2.setRecColor("green");
        r2.draw();

        Rectangle r3 = new Rectangle();
        r3.setRecWidth(15);
        r3.setRecHeight(12);
        r3.setRecColor("red");
        r3.draw();

    }
}
