import java.util.*;

public class Swap {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("\nEnter the second number: ");
        int second = scanner.nextInt();
        second = first + second;
        first = second - first;
        second = second - first;
        System.out.print("\nAfter Swapping, the first number = " + first + " and the second number = " + second);
        scanner.close();
    }
}
