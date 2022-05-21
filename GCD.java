import java.util.*;

public class GCD {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = scanner.nextInt();
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }
}
