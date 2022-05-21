import java.util.*;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Non Prime");
        } else {
            System.out.println("Prime");
        }
        scanner.close();
    }
}
