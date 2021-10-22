package week2.arrays;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        int largestNum = 0;
        System.out.print("Array:");
        for (int i = 0; i != arrInt.length; i++){
            arrInt[i] = (int)(Math.random() * 100) + 1;
            System.out.print(" " + arrInt[i]);
        }

        for (int arr: arrInt){
            largestNum = Math.max(arr, largestNum);
        }
        System.out.println();
        System.out.println();
        System.out.println("The largest value is " + largestNum);
    }
}
