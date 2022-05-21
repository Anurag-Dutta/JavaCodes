import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        System.out.print("\nEnter the second number: ");
        float num2 = scanner.nextFloat();
        System.out.print(num1 + " X " + num2 + " = " + (num1 * num2));
        scanner.close();
    }
}
