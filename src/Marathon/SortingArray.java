package Marathon;

import java.util.Arrays;
import java.util.Scanner;

/*Задать массив целых чисел длинной 10 эл.
        Отсортировать числа в массиве. Вывести на экран результат. Сделать возможность наполнения массива с клавиатуры.*/
public class SortingArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        //количество раз выполнения цикла = длине масива
        for (int i = 0; i < a.length; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}