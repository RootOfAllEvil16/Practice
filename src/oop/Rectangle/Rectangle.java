package oop.Rectangle;

public class Rectangle {

    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height can`t be 0");
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getSquare() {
        return Math.sqrt(width * height);
    }

   /* @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }*/
}
    /*Написать классы:
        Rectangle (прямоугольник).
        Свойства: ширина, высота.
        Методы: подсчет периметра, подсчет площади.
        Rectangles (прямоугольники).
        Свойства: список прямоугольников.
        Методы: добавление прямоугольника, подсчет суммарной площади всех прямоугольников.
        Клиентский класс RectangleRunner: протестировать функционал предыдущих классов.*/

