import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\sequence.txt");
        Scanner scanner = new Scanner(file);

        //пока в файле есть, что читать
        while (scanner.hasNext()) {
            //если это даблы
            if (scanner.hasNextDouble()) {
                System.out.print(scanner.nextDouble() + " ");

            }
        }
    }
}