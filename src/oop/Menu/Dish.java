package oop.Menu;

public class Dish {
    //объявление переменных
    private final String name;
    private final String description;
    private final long price;


    //конструктор
    public Dish(String name, String description, long price) {
        this.name = name;
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name field is empty!");
        }
        this.description = description;
        if (description.isEmpty()) {
            throw new IllegalArgumentException("description field is empty!");
        }
        this.price = price;
        if (price <= 0) {
            throw new IllegalArgumentException("price field can`t be 0");
        }

    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return "Name: " + name +
                ", Description: " + description +
                ", Price = " + price + "UAH";
    }
}

   /* Написать классы:
        Dish (блюдо).
        Свойства: название, описание, цена.
        Menu (меню).
        Свойства: название, список блюд.
        Методы: добавление блюда, нахождение самого дешевого блюда.
        Клиентский класс MenuRunner: создать 2 меню, каждое заполнить 3-я блюдами,
        протестировать функционал нахождения самого дешевого блюда.*/

