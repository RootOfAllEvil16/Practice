public class PositiveIndexOfArray {
    public static void main(String[] args) {
        int[] array = {1, -23, 7, -98, 6, 2, -2};
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] > 0)
            {
                System.out.print(arrayIndex);
            }
        }
    }
}
