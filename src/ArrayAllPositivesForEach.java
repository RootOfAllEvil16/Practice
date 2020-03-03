public class ArrayAllPositivesForEach {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -8, 5};
        for (int i : array) {
            if (i > 0) {
                System.out.println(i);
            }
        }
    }
}
