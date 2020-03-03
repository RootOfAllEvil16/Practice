package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DifSecChecker1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\sequence.txt");
        Scanner scanner = new Scanner(file);

        double a = 0;
        double b = 0;
        int k = 0;
        int j = 0;
        int n = 0;

        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();

        }

        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                System.exit(-1);
            } else {
                b = a;
                a = scanner.nextDouble();
                if (a > b) {
                    k++;
                } else if (a < b) {
                    j++;
                } else if (a == b) {
                    n++;
                }

            }
        }
        if (j > 0 & k > 0) {
            System.out.println("Sequence not monotonic");
        } else if (k > 0) {
            System.out.println("Sequence non - decreasing");
        } else if (j == 0 & k == 0 & n > 0) {
            System.out.println("Sequence constant");
        } else if (j > 0) {
            System.out.println("Sequence decreasing");
        }

    }
}