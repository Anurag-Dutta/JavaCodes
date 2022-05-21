import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("The number you entered is " + num);
        scanner.close();
    }
}
