package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i != 10; i++){
            arrInt.add((int)(Math.random() * 100) + 1);
        }
        System.out.println("ArrayList: " + arrInt);
        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        System.out.println();
        for(int intVal : arrInt){
            if(find == intVal){
                System.out.println(find + " is in the ArrayList.");
            }
        }
    }
}
