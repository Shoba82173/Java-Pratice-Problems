package SearchSort;
import java.util.Scanner;

public class SelectionSort {
    public void sort(int[] arr, int n) {
        // Traverse through the array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the current element is the minimum

            // Find the index of the smallest element in the remaining array
            for (int j = i ; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if a smaller element was found
            // if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            // }
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ss.sort(arr, n);

        System.out.println("Sorted array (using Selection Sort):");
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}
