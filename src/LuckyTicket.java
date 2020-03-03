import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        int number = scanner.nextInt();
        scanner.close();

//просим систему вытянуть каждое число отдельно
        int digit1 = number % 10000 / 1000;
        int digit2 = number % 1000 / 100;
        int digit3 = number % 100 / 10;
        int digit4 = number % 10;

        int sum1 = digit1 + digit2;
        int sum2 = digit3 + digit4;

        if (sum1 == sum2 || (sum1 / 10 + sum1 % 10) == (sum2 / 10 + sum2 % 10)) {
            System.out.println("Its lucky ticket");
        } else {
            System.out.println("Its not lucky ticket");
        }
    }
}
