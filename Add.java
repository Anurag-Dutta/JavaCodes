import java.util.*;

public class Add {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
        scanner.close();
    }
}
