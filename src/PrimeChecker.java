import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        scanner.close();
        int count = 0;

        if (n <= 0) {
            System.out.println("Error. Write number bigger then zero");
            System.exit(-1);
        }
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        boolean isPrime = (count == 1);
        System.out.println(isPrime);
    }
}

