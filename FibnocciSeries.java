package Recursion;
import java.util.Scanner;
public class FibnocciSeries {
    public int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        FibnocciSeries fs= new FibnocciSeries();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fs.fib(n));
        sc.close();
    }
}
