import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Error. Number can`t be negative");
            System.exit(-1);
        }
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
