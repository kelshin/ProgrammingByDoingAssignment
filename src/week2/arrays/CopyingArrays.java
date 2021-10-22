package week2.arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int arrInd = 0; arrInd != arr1.length; arrInd++){
            arr1[arrInd] = (int)(Math.random() * 100) + 1;
            arr2[arrInd] = arr1[arrInd];
            if (arrInd == arr1.length - 1){
                arr1[arrInd] = -7;
            }
        }
        System.out.print("Array 1:");
        for (int arr : arr1){
            System.out.print(" " + arr);
        }
        System.out.println();
        System.out.print("Array 2:");
        for (int arr : arr2){
            System.out.print(" " + arr);
        }
    }
}
