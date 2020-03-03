import java.util.Arrays;
import java.util.Random;

public class ArrayFillingWithAnother {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        int[] b = Arrays.copyOf(a, 30);
        for (int i = 15; i < b.length; i++) {
            b[i] = a[i - 15] * 2;
        }
        System.out.println(Arrays.toString(b));
    }
}
