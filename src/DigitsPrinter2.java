import java.util.Scanner;

public class DigitsPrinter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 5-digit number: ");
        int n = scanner.nextInt();
        scanner.close();

        int n1 = n / 10000;
        int n2 = n % 10000 / 1000;
        int n3 = n % 1000 / 100;
        int n4 = n % 100 / 10;
        int n5 = n % 10;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
    }
}
