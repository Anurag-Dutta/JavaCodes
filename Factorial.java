import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = factorial(number);
        System.out.println(fact);
        scanner.close();
    }
}
