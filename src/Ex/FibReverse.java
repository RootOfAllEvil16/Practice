package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FibReverse {
    public static void main(String[] args)throws IOException {
        File file = new File("src\\fibonacci.txt");
        Scanner scanner = new Scanner(file);
        int a = 0;
        int b = 0;
        int c;

        if (!scanner.hasNext()) {
            System.out.println("File is empty");
            System.exit(-1);
        } else if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            if (!scanner.hasNextInt()) {
                System.out.println("Only one number");
                System.exit(-2);
            } else if (scanner.hasNextInt()) {
                b = scanner.nextInt();
                if (!scanner.hasNextInt()) {
                    System.out.println("Only two numbers");
                    System.exit(-3);
                }
            }
        }

        boolean fib = true;
        while (scanner.hasNext()) {
            if (!scanner.hasNextInt()) {
                System.out.println("It`s not a number");
                System.exit(-4);
            }
            c = scanner.nextInt();
            if (a - b != c) {
                fib = false;
                break;
            } else {
                a = b;
                b = c;
            }
        }

        if (fib) {
            System.out.println("Fibonacci");
        } else {
            System.out.println("Not Fibonacci");
        }

    }
}
