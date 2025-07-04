package SearchSort;
import java.util.Scanner;
public class BubbleSort {
    public void sort(int[] arr, int n) {
        // for sorting
        for(int i=0;i<n-1;i++){
            // Inner loop for comparing adjacent elements
            for(int j=i;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) { 
    BubbleSort bs = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        // getting aray elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bs.sort(arr, n);
        System.out.println("Sorted array (using Selection Sort):");
        for (int num : arr) {
            System.out.println(num);
        }
        sc.close();
    }
}

