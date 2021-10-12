package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Hey, What's your name? (Sorry I keep forgetting.) ");
        String name = obj.nextLine();
        System.out.printf("Ok, %s, how old are you? ", name);
        int age = obj.nextInt();
        System.out.println();
        if (age < 16){
            System.out.printf("You can't drive, %s.", name);
        } else if (age >= 16 && age <= 17){
            System.out.printf("You can drive but not vote, %s.", name);
        } else if (age >= 18 && age <= 24){
            System.out.printf("You can vote but not rent a car, %s.", name);
        } else {
            System.out.printf("You can do pretty much anything, %s.", name);
        }
    }
}
