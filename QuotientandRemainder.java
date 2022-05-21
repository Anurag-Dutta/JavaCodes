import java.util.*;

public class QuotientandRemainder {
    public static void main(String[] args) {
        System.out.print("Enter the divisor: ");
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        System.out.print("\nEnter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("\nQuotient = " + (dividend / divisor));
        System.out.print("\nRemainder = " + (dividend % divisor));
        scanner.close();
    }
}
