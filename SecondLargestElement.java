package Arrays;
import java.util.Scanner;
public class SecondLargestElement {
    public static void findLargestAndSecondLargest(int arr[], int n) {
        if (n < 2) {
            System.out.println("Not enough elements to find second largest.");
            return;
        }
// for finding the larest element
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Largest Element: " + first);
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements are equal).");
        } else {
            System.out.println("Second Largest Element: " + second);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findLargestAndSecondLargest(arr, n);

        sc.close();
    }
}


