import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (a > b & a > c & a > d) {
            System.out.println("Number a is the biggest number " + a);
        } else if (b > a & b > c & b > d) {
            System.out.println("Number b is the biggest number " + b);
        } else if (c > a & c > b & c > d) {
            System.out.println("Number c is the biggest number " + c);
        } else {
            System.out.println("Number d is the biggest number " + d);
        }
    }
}
