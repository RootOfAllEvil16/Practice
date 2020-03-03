package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reader2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\sequence.txt");
        /*if(!file.exists()){
            System.exit(-1);
        }*/

        Scanner scanner = new Scanner(file);
        double a = 0;
        double b = 0;
        int n = 0;

        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
            b = a;
            n = 1;
        }
        while (scanner.hasNextDouble()) {
                a = scanner.nextDouble();

            if (a < b) {
                System.out.println("sequence decreasing");
                break;

            } else if (a > b) {
                b = a;
                n++;

            }

        }

        scanner.close();
        System.out.println(n);
    }
}
/*дана неубывающая последовательность вещественных чисел неизвестной длины.
программа должна вернуть целое число, равное количеству различных элементов последовательности*/