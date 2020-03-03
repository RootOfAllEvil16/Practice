import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        int[]array = new int [10];
        Arrays.fill(array,42);
        System.out.println(Arrays.toString(array));
    }
}
