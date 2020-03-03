package Ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountMax2 {
    public static void main(String[] args) throws IOException {

        File file = new File("src\\sequence.txt");
        Scanner scanner = new Scanner(file);

        double a;
        int i = 0;
        double max = -Double.MAX_VALUE;


//Prev solution
        /*while (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
            if (a > max) {
                max = a;
                i = 1;
            } else if (a == max) {
                i++;
            }

        }*/
        while (scanner.hasNext()) {
            if (!scanner.hasNextDouble()) {
                System.out.println("Error. Found not a number");
                System.exit(-1);
            } else if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                if (a > max) {
                    max = a;
                    i = 1;
                } else if (a == max) {
                    i++;
                }
            }

        }

        System.out.println(max);
        System.out.println(i);


    }
}
/*дана последовательность вещественных чисел. пограмма должна вернуть число,
равное количеству максимальных элеменов последовательности
 */