import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        int digit1 = number / 100000;
        int digit2 = number % 100000 / 10000;
        int digit3 = number % 10000 / 1000;
        int digit4 = number % 1000 / 100;
        int digit5 = number % 100 / 10;
        int digit6 = number % 10;

        if (digit1 == digit6 && digit2 == digit5 && digit3 == digit4) {
            System.out.println("This number is palindrome");
        } else {
            System.out.println("This number is not palindrome");
        }
    }
}
