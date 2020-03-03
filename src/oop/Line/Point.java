package oop.Line;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
    /*Point (точка).
        Свойства: x, y.
        Line (линия).
        Свойства: начальная точка, конечная точка.
        Методы: подсчет длины линии.
        Lines (линии).
        Свойства: список линий.
        Методы: добавление линии, суммарная длина всех линий, нахождение самой длинной линии.
        Клиентский класс LineRunner: протестировать функционал предыдущих классов.*/

