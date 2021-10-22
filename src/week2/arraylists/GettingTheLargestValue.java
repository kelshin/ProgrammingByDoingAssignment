package week2.arraylists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<>();
        int largestNum = 0;
        for (int i = 0; i != 10; i++){
            arrInt.add((int)(Math.random() * 50) + 1);
        }
        System.out.println("ArrayList: " + arrInt);
        System.out.println();
        for(int intVal : arrInt){
            if(intVal > largestNum){
                largestNum = intVal;
            }
        }
        System.out.println("The largest value is " + largestNum);
    }
}
