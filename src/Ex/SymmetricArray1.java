package Ex;


import java.util.Arrays;
import java.util.Scanner;

public class SymmetricArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (1 + (Math.random() * (5 - 1)));
        }
        System.out.println(Arrays.toString(a));

        int symm = 1;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                symm = 0;
                break;
            }
        }
        if (symm == 1) {
            System.out.println("Symmetric array");
        } else {
            System.out.println("Not symmetric array");
        }

    }
}