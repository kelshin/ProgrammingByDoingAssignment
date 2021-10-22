package week2.arrays;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] randNum = new int[10];
        for(int arrIndex = 0; arrIndex != randNum.length; arrIndex++){
            randNum[arrIndex] = (int)(Math.random() * 100) + 1;
            System.out.println("Slot " + arrIndex + " contains a " + randNum[arrIndex]);
        }
    }
}
