import java.util.Arrays;

public class MirrorArrayRotation2 {

    public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            mirArray(arr);
            System.out.println(Arrays.toString(arr));
        }

    public static int[] mirArray(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int a = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = a;
        }
        return x;
    }

    }

