package Marathon;

/*Задать массив целых чисел любой длинны.
        Посчитать среднее арифметическое элементов этого массива и вывести на консоль.*/
public class SumOfElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        //сумма элементов массива
        int sum = 0;
        //loop
        for (int x : a) {
            //на каждой итерации добавляем следующий элемент массива
            sum += x;
        }
        //к sum на каждой итерации добавляем следующий элемент массива
       /* for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }*/
       //среднее арифметиеское
        System.out.println(sum/a.length);
    }
}