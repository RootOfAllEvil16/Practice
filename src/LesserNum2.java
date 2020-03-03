import java.util.Scanner;

public class LesserNum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();
        System.out.println("Enter number c: ");
        int c = scanner.nextInt();
        scanner.close();

        if (a < b && a < c) {
            System.out.println("Number a is a lesser number");
        } else if (b < a && b < c) {
            System.out.println("Number b is a lesser number");
        } else if (c < a && c < b) {
            System.out.println("Number c is a lesser number");
        } else if (a == b && a < c) {
            System.out.println("Numbers a and b are lesser");
        } else if (b == c && b < a) {
            System.out.println("Numbers b and c are lesser");
        } else if (c == a && c < b) {
            System.out.println("Numbers c and a are lesser");
        }
        else {
            System.out.println("All numbers are equal");
        }
    }
}
