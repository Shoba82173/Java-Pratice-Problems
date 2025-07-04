package Arrays;

import java.util.Scanner;

public class LargestElement {
     public static void largestElement(int arr[], int n) {
        if (n <= 0) {
            System.out.println("Array is empty.");
            return;
        }

        int large = arr[0]; // Start with the first element

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("Largest Element: " + large);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare the array

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        largestElement(arr, n); // Correct method call

        sc.close();
    }
}
