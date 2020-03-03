public class ArrayAllPositivesRotate {
    public static void main(String[] args) {
        int[] array = {1, -4, 3, 6, -7, 9, -67};
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                System.out.println(array[i] + " ");
            }
        }
    }
}

