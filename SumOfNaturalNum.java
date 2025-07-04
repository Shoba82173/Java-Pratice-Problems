package Recursion;
import java.util.Scanner;
public class SumOfNaturalNum{
    public int sumNumber(int n){
       if(n==0){
        return 0;
       } 
       return n+sumNumber(n-1);
    }
    public static void main(String[] args) {
        SumOfNaturalNum snn = new SumOfNaturalNum();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(snn.sumNumber(n));
        sc.close();
    }

}