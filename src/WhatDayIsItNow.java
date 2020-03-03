import java.util.Scanner;

public class WhatDayIsItNow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day (1-7): ");
        int day = scanner.nextInt();
        scanner.close();

        if (day <= 5 && day > 0) {
            System.out.println("Weekday");
        } else if (day >= 6 && day <= 7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Please enter day 1-7");
        }
    }
}
