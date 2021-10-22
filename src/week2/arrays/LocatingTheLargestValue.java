package week2.arrays;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int largestNum = 0;
        int largestNumIndex = 0;
        System.out.print("Array:");
        for (int i = 0; i != arrInt.length; i++){
            arrInt[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + arrInt[i]);
        }

        for (int i = 0; i != arrInt.length; i++){
            if (arrInt[i] > largestNum){
                largestNum = arrInt[i];
                largestNumIndex = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The largest value is " + largestNum);
        System.out.println("It is in slot " + largestNumIndex);
    }
}
