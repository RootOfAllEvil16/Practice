
public class ArrayAllPositivesIndexes {
    public static void main(String[] args) {
        int[] array = {1, -3, 5, -87, 7, -2};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println(i);
            }

        }
    }
}
