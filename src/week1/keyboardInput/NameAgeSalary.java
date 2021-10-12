package week1.keyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String name = obj.nextLine();
        System.out.printf("Hi %s,! How old are you\n", name);
        int age = obj.nextInt();
        System.out.printf("So you're %d, eh? That's not old at all!\n", age);
        System.out.printf("How much do you make %s\n", name);
        float salary = obj.nextFloat();
        System.out.printf("\n %.2f! I hope that's per hour and not per year! LOL!", salary);
    }
}
