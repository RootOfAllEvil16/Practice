public class PositiveReverse {
    public static void main(String[] args) {
        int[] array = {1, -23, 41, 12, 2, 5, -2, -1, 15};
        for (int arrayLastIndex = array.length - 1; arrayLastIndex >= 0; arrayLastIndex--) {
            if (array[arrayLastIndex] >= 0) {
                System.out.println(array[arrayLastIndex]);
            }
        }
    }
}