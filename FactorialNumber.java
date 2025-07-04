package Recursion;
import java.util.Scanner;
public class FactorialNumber {
    public int fact(int n){
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;

        }
        return n*fact(n-1);
    }
    public static void main(String agrs[]){
        FactorialNumber fn = new FactorialNumber();
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fn.fact(n));
        sc.close();

    }
}
