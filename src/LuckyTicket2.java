import java.util.Scanner;

public class LuckyTicket2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 digit number: ");
        int ticket = scanner.nextInt();
        scanner.close();

        int digit1 = ticket % 1000000 / 100000;
        int digit2 = ticket % 100000 / 10000;
        int digit3 = ticket % 10000 / 1000;
        int digit4 = ticket % 1000 / 100;
        int digit5 = ticket % 100 / 10;
        int digit6 = ticket % 10;

        int sum1 = digit1 + digit2 + digit3;
        int sum2 = digit4 + digit5 + digit6;

        if (ticket < 0 || ticket > 999999) {
            System.out.println("Error.");
            System.exit(-1);
        } else {
            boolean isLuckyTicket = (sum1 == sum2);
            System.out.println(isLuckyTicket);
        }
    }
}