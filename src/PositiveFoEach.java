public class PositiveFoEach {
    public static void main(String[] args) {
        int[] array = {1, -45, 7, -3, 8, 9, -123};
        for (int arrayNum : array) {
            if (arrayNum > 0) {
                System.out.println(arrayNum);
            }
        }
    }
}
