package SearchSort;
import java.util.Scanner;
public class MergeSort {
    public static void conquer(int arr[],int si,int mid, int ei){
        // in ths we will merge the array by using while loops
        int[] merged=new int[ei-si+1]; // ei-si+1 for the length of the array
        int idx1=si;   // track index 1 from array 1
        int idx2=mid+1;  // track another array 2
        int x= 0; // track merged index
        
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        // this while loop is for  when either of the finished and the other array element sould add as it is.
        while(idx1<= mid){
             merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        // this loop for copying the merged into original array;
        for(int i=0 , j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }

    }
    public static void divide(int arr[], int si,int ei){ // si= starting index , ei= ending index.
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2; // for avoiding the space complxity we can use instead of using this si-ei/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, n-1);
         System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num +" ");
        }
        sc.close();
}
}
