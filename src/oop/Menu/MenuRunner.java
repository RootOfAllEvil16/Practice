package oop.Menu;

public class MenuRunner {
    public static void main(String[] args) {

//ооздаём блюда 6 блюд (по три на каждое меню)
        Dish greekSalad = new Dish("Greek salad", "Cucumbers,tomatoes,sweet pepper,olives,cheese Feta,lemon juice.", 150);
        Dish pizza4Cheeses = new Dish("Pizza 4 Cheeses", "Mozzarella,dor blue,parmesan,radomer,cream sauce.", 135);
        Dish chickenBouillon = new Dish("Chicken bouillon", "Chicken bouillon,chicken fillet,parsley", 70);
        Dish pancake = new Dish("Pancake", "With nutella and greek nuts.", 49);
        Dish strudel = new Dish("Strudel", "Strudel with vanilla sauce", 55);
        Dish fruitIceCream = new Dish("Fruit Ice Cream", "Ice cream,banana,orange,kiwi,pineapple", 50);

        //создаём меню ( 2 меню по три блюда каждое)
        Menu mainDish = new Menu("Main dishes");
        Menu dessert = new Menu("Desserts");

        //добавляем блюда в каждое меню
        mainDish.addSDish(greekSalad);
        mainDish.addSDish(pizza4Cheeses);
        mainDish.addSDish(chickenBouillon);
        dessert.addSDish(pancake);
        dessert.addSDish(strudel);
        dessert.addSDish(fruitIceCream);

        //функционал самое дешёвое блюдо
        System.out.println(mainDish.getName() + " cheapest dish is " + mainDish.getCheapestDish());
        System.out.println(dessert.getName() + " cheapest dish is " + dessert.getCheapestDish());

    }
}
