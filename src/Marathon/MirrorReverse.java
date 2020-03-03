package Marathon;

import java.util.Arrays;

public class MirrorReverse {
    public static int[] reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
   /* Написать код для зеркального переворота массива любой длинны [1,2,3,4] -> [4,3,2,1].
        Для реализации нельзя создавать дополнительный массив - все операции производяться в одном массиве*/