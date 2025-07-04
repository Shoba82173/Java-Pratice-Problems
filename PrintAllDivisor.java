package MathProblems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class PrintAllDivisor {
    public void divisor(int n) {
        // to store the output in th list
        List<Integer> divisors = new ArrayList<>();
        // i*i --> 6*6 =36<=n
        for (int i = 1; i * i <= n; i++) {
            // if n=4 n%i --> 4%1==0
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    // instead of print they added the output to the list for sorting
                    
                    divisors.add(n / i); // Add the paired divisor only if it's different
                }
            }
        }

        Collections.sort(divisors); // Sort the list in ascending order

        for (int d : divisors) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PrintAllDivisor pad= new PrintAllDivisor();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        pad.divisor(n);
        sc.close();
    }
}
