import java.time.LocalDate;

public class DaysFromBirthDayCalculator {
    public static long daysFromBirthDate(String birthDateString) {
        //сегодняшняя дата
        LocalDate date = LocalDate.now();
        //парсим дату рождения
        LocalDate birthDate = LocalDate.parse(birthDateString);
        long days = date.toEpochDay() - birthDate.toEpochDay();
        return days;
    }

    public static void main(String[] args) {
        System.out.println(daysFromBirthDate("1972-12-28"));
        System.out.println(daysFromBirthDate("2005-05-01"));
    }
}
    /*Написать метод, находящий количество дней, прошедших с дня рождения человека.
        День рождения задается в формате “YYYY-MM-DD”, где YYYY - год (4 цифры), MM - номер месяца (2 цифры), DD - номер дня (2 цифры).
        Примеры формата: “1972-12-28”, “2005-05-01”.
        Использовать класс java.time.LocalDate.*/
