package SearchSort;
import java.util.Scanner;
public class QuickSort {
    public static int partition( int arr[],int low, int high){
        int pivot=arr[high];
        // at starting the there is no element int the array . 
        int i= low-1;
        // to check the condition 
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }       
        }
        // this for space which the space for pivot
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; // pivot index
    }
    public static void quickSort(int arr[],int low, int high){
        if(low<=high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
         System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num +" ");
        }
        sc.close();
    }
}
