package Marathon;

/*Задать массив целых чисел длинной 7 элементов.
        Поменять 1-й и последний элемент местами. Вывести массив на экран.*/

import java.util.Arrays;

public class ElementsSwap {
    public static void main(String[] args) {
        //массив длиной 7 элементов
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        //времення переменная temp. сохраняем значение из 0 ячейки.
        int temp = a[0];
        //в нулевую кладём значение последней
        a[0] = a[a.length - 1];
        //в псоледнюю кладём значение, которое сохраняем во временной переменной temp
        a[a.length - 1] = temp;
        System.out.println(Arrays.toString(a));

    }
}
