package tuf_DSA_Sheet;

import java.util.Scanner;

//Find Second Smallest and Second Largest Element in an array
public class FindSLargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.printf("Enter %d number element: ",i+1);
            arr[i] = input.nextInt();
        }
    }
    
}
