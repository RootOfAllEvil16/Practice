package oop.Menu;

import java.util.ArrayList;

public class Menu {


    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addSDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        Dish cheapestDish = null;
        long cheapestDishPrice = dishes.get(0).getPrice();
        for (Dish dish : dishes) {
            if (cheapestDish == null || dish.getPrice() < cheapestDishPrice) {
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }

}
