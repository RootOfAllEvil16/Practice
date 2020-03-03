package ForInterview;

public class ReserveStr {
    public static void main(String[] args) {
        //инициализируем строку
        String s = "GOT";
        //вызываем стринг билдер
        StringBuilder stringBuilder = new StringBuilder();
        //добавляем значение хранящееся в строковой переменной
        stringBuilder.append(s);
        //использум для переворота строки
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
    /*Напишите программу на Java для переворачивания строки,
        изменив расположение символов в строке задом наперёд без использования встроенных в String функций.*/