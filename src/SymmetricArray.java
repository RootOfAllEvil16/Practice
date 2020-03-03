import java.util.Arrays;
import java.util.Scanner;

public class SymmetricArray {
    //a - array, n -size, i- temp
    public static boolean symm(int[] a, int n, int i) {

        //if we passed half and don`t get false, its symmetric
        if (i > n / 2) {
            return true;
//if this don`t match - not symmetric
        } else if (a[i] != a[n - 1 - i]) {
            return false;
            //trying again
        } else {
            return symm(a, n, i + 1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (10 + (Math.random() * (100- 10)));

            System.out.println(Arrays.toString(a));
            System.out.println(symm(a,n,i));
        }
    }
}