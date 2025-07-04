package MathProblems;
import java.util.Scanner;

public class ArmStrongNumber {
    public boolean isArmstrong(int n) {
        int temp = n;
        int digits = 0;

        // Count number of digits
        int t = n;
        while (t > 0) {
            t = t / 10;
            digits++;
        }

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n = n / 10;
        }

        return sum == temp;
    }

    public static void main(String[] args) {
        ArmStrongNumber asn = new ArmStrongNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println( asn.isArmstrong(n));
        sc.close();
    }
}
