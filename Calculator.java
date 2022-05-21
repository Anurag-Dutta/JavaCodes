import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("\t********************************Calculator********************************\t");
        System.out.print("\nFor Addition, press '+'");
        System.out.print("\nFor Subtraction, press '-'");
        System.out.print("\nFor Multiplication, press '*'");
        System.out.print("\nFor Division, press '/'");
        System.out.print("\n\nEnter the First Number: ");
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        System.out.print("\nEnter the Second Number: ");
        float num2 = scanner.nextFloat();
        System.out.print("\n\n\nEnter your choice: ");
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                System.out.print(num1 / num2);
                break;
            default:
                System.out.print("Invalid!");
        }
        scanner.close();

    }
}