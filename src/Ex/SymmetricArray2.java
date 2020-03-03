package Ex;

import java.util.Arrays;

public class SymmetricArray2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {1, 2, 2, 1};
        int[] c = {1, 2, 3, 4, 5};


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

        System.out.println(Arrays.toString(b));

        int symm1 = 1;
        for (int i = 0; i < b.length / 2; i++) {
            if (b[i] != b[b.length - 1 - i]) {
                symm1 = 0;
                break;
            }
        }
        if (symm1 == 1) {
            System.out.println("Symmetric array");
        } else {
            System.out.println("Not symmetric array");
        }

        System.out.println(Arrays.toString(c));

        int symm2 = 1;
        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - 1 - i]) {
                symm2 = 0;
                break;
            }
        }
        if (symm2 == 1) {
            System.out.println("Symmetric array");
        } else {
            System.out.println("Not symmetric array");
        }


    }
}
