package MathProblems;
import java.util.Scanner;

public class Gcd {
    public int printGcd(int n1, int n2) {
        // Euclidean Algorithm
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1; // GCD is stored in n1
    }

    public static void main(String[] args) {
        Gcd gc = new Gcd();
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int gcd = gc.printGcd(n1, n2);
        System.out.println("GCD is: " + gcd);

        sc.close();
    }
}
