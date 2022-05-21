import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.print(number + " is even");
        } else {
            System.out.print(number + " is odd");
        }
        scanner.close();
    }
}
