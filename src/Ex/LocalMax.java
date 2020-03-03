package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LocalMax {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\sequence.txt");
        Scanner scanner = new Scanner(file);

        double a = 0;
        double b = 0;
        double c = 0;
        int i = 0;

        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            }
        }

        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                System.exit(-1);
            } else {
                a = b;
                b = c;
                c = scanner.nextDouble();
                if (a < b && b > c) {
                    i++;
                }
            }
        }
        System.out.println(i);
    }
}
/*дана последовательность вещественных чисел. программа должна выдать целое число,
равное количеству всех локальных максимумов последовательности
 */