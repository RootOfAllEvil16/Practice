

public class ArrayPositivesCounter {
    public static void main(String[] args) {
        int[] array = {-3, 0, -1, 4, -2, 5};
        System.out.println(countPositives(array));
    }

    public static int countPositives(int[] array) {
        int count = 0;
        for (int ArrayNum : array) {
            if (ArrayNum > 0) {
                count++;
            }
        }
        return count;
    }

}
