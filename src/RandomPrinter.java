import java.util.Random;
import java.util.Scanner;

public class RandomPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your min number: ");
        int min = scanner.nextInt();
        System.out.println("Enter your max number: ");
        int max = scanner.nextInt();
        System.out.println("Enter count of numbers: ");
        int count = scanner.nextInt();

        printRandoms(count, min, max);
    }

    private static void printRandoms(int count, int min, int max){
        Random rnd = new Random();

        if (count <= 0 || min >= max) {
            System.out.println("Error");
            System.exit(-1);
        }
        for (int i = 1; i <= count; i++) {
            System.out.print(min + rnd.nextInt(max - min +1) + " ");
        }

    }
}
