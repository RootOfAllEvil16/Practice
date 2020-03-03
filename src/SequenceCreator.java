import java.util.Arrays;
import java.util.Scanner;

public class SequenceCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        if (size < 0) {
            throw new IllegalArgumentException("Enter correct values. Size can`t be <= 0 ");
        }
        System.out.println(Arrays.toString(createSequence(size)));
    }

    public static int[] createSequence(int size) {
        int[] sequence = new int[size];
        if (size > 0) {
            for (int firstElement = 0; firstElement < size; firstElement++) {
                sequence[firstElement] = firstElement;
            }
        }
        return sequence;
    }
}
