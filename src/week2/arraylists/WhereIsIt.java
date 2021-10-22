package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        int found = 0;
        for (int i = 0; i != 10; i++){
            arrInt.add((int)(Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + arrInt);
        System.out.print("Value to find: ");
        Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        System.out.println();
        int currentLoc = 0;
        for(int intVal : arrInt){
            if(find == intVal){
                System.out.println(find + " is in slot " + currentLoc + ".");
                found++;
            }
            currentLoc++;
        }
        if(found == 0){
            System.out.println(find + " is not in the ArrayList.");
        }
    }
}
