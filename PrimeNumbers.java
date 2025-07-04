package MathProblems;
import java.util.*;
public class PrimeNumbers {
     static boolean isPrime (int n){
        if(n==2){
        return true;
        }
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;


    }
    public static void main(String[] args) {
        //PrimeNumbers pn = new PrimeNumbers();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(isPrime(n)){
            System.out.println(n +" a prime number");
        }
        else{
            System.out.println(n +"  not a prime number");
        }
        sc.close();


    }
}