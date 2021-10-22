package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        int largestNum = 0;
        int largestNumLoc = 0;
        for (int i = 0; i != 10; i++){
            arrInt.add((int)(Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + arrInt);
        System.out.println();
        int currentLoc = 0;
        for(int intVal : arrInt){
            if(intVal > largestNum){
                largestNum = intVal;
                largestNumLoc = currentLoc;
            }
            currentLoc++;
        }
        System.out.println("The largest value is " + largestNum + ", which is in slot " + largestNumLoc);
    }
}
