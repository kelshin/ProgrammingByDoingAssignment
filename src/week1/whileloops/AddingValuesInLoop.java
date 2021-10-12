package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        int sum = 0;
        while (true){
            System.out.print("Number: ");
            int num = obj.nextInt();
            sum += num;
            if(num != 0){
                System.out.printf("The total so far is %d\n", sum);
            } else {
                System.out.printf("\nThe total is %d.\n", sum);
                break;
            }


        }
    }
}
