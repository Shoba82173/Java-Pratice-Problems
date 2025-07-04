package Recursion;
import java.util.Scanner;

public class ArrayReverse {

    // Recursive function to reverse the array
    public void arrayRev(int start, int[] arr, int end) {
        if (start >= end) {
            return;
        }
        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        arrayRev(start + 1, arr, end - 1);
    }

    public static void main(String[] args) {
        ArrayReverse ar = new ArrayReverse();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ar.arrayRev(0, arr, size - 1);

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
