import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.close();
//если год делится на 4 без остатка и на 400 без остатка, но если он делится без остатка на 100, то год високосный
        if (year % 4 == 0 | year % 400 == 0 | year % 100 != 0) {
            System.out.println("Year " + year + " is a leap year and has 366 days");
        } else {
            System.out.println("Year " + year + " is not leap year and has 365 days");

        }

    }
}
