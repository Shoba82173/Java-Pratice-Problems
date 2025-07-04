package SearchSort;

import java.util.Scanner;

public class LinearSearch {
    
public static int linearSearch(int[] nums, int target, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i; // return index when found
            }
        }
        return -1; // return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = sc.nextInt();

        int result = linearSearch(nums, target, n);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
