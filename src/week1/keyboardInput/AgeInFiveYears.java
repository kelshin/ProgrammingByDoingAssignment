package week1.keyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Hello. What is your name? ");
        String name = obj.nextLine();
        System.out.printf("\nHi, %s! How old are you? ", name);
        int age = obj.nextInt();
        System.out.printf("\nDid you know that in five years you will be %d years old?", age + 5);
        System.out.printf("\nAnd five years ago you were %d! Imagine That!", age - 5);
    }
}
