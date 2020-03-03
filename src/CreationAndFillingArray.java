import java.util.Arrays;
import java.util.Scanner;

public class CreationAndFillingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array size: ");
        int[] a = new int[scanner.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter numeric value of element: ");
            a[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(a));

    }
}
