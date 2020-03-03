package Ex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BiggerTPrev {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\sequence.txt");
        Scanner scanner = new Scanner(file);

        double a = 0 ;
        double b = 0 ;
        int i = 0;

        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }


        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                System.exit(-1);
            } else if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a > b) {
                    i++;
                }
                b = a;
            }
        }

        System.out.println(i);
    }
}
/* дана последовательность вещественных чисел. программа должна вернуть число,
равное количеству элементов, больших предыдущего элемента
 */