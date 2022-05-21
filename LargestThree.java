import java.util.*;

public class LargestThree {
    public static void main(String[] args) {
        System.out.print("Enter the number 1: ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.print("\nEnter the number 2: ");
        float b = scanner.nextFloat();
        System.out.print("\nEnter the number 3: ");
        float c = scanner.nextFloat();
        if (a > b) {
            if (a > c) {
                System.out.print("\n" + a + " is largest");
            } else {
                System.out.print("\n" + c + " is largest");
            }
        } else {
            if (b > c) {
                System.out.print("\n" + b + " is largest");
            } else {
                System.out.print("\n" + c + " is largest");
            }
        }
        scanner.close();
    }
}