import java.util.Arrays;

public class MirrorArrayRotation {
    public static void main(String[] args) {

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            System.out.print(a[i] + "");
        }
        System.out.println();
        rotate(a);
    }

    static void rotate(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int b = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - i - 1] = b;
        }
        System.out.println(Arrays.toString(a));
    }
}
