import java.util.*;

public class HelloUser {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Hello, " + name);
        scanner.close();
    }
}
