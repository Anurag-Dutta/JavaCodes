import java.util.*;

public class ASCII {
    public static void main(String[] args) {
        System.out.print("Enter the character: ");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        System.out.print("The ASCII value of the character: " + (int) character);
        scanner.close();
    }
}