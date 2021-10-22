package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int found = 0;
        System.out.print("Array:");
        for (int i = 0; i != arrInt.length; i++){
            arrInt[i] = (int)(Math.random() * 50) + 1;
            System.out.print(" " + arrInt[i]);
        }
        System.out.println();
        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        System.out.println();
        for (int i = 0; i != arrInt.length; i++){
            if (find == arrInt[i]){
                System.out.println(find + " is in slot " + i + ".");
                found++;
            }
        }
        if (found == 0){
            System.out.println(find + " is not in the array.");
        }

    }
}
