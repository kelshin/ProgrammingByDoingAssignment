package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Count to: ");
        int countTo = obj.nextInt();
        for(int x = 0; x <= countTo; x++){
            System.out.printf("%d ", x);
        }
    }
}
