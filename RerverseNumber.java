package Recursion;
import java.util.Scanner;



 public class RerverseNumber{
    public void reverseNum(int n, int m){
        if (n < m){
            return;
        }
        //System.out.println(n);
        reverseNum(n - 1, m);
        System.out.println(n);
    }

    public static void main(String[] args) {
        RerverseNumber rc = new RerverseNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 5
        int m = sc.nextInt(); // e.g., 1
        rc.reverseNum(n, m); // Output: 5 4 3 2 1
        sc.close();
    }
}