package oop.Rectangle;

public class RectangleRunner {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.2,12.5);
        Rectangle rectangle2 = new Rectangle(15,10);
        System.out.println("First rectangle perimeter = " + rectangle1.getPerimeter());
        System.out.println("First rectangle square = " + rectangle1.getSquare());
        System.out.println("Second rectangle perimeter = " + rectangle2.getPerimeter());
        System.out.println("Second rectangle square = " + rectangle2.getSquare());

        Rectangles rectangles = new Rectangles();
        rectangles.addRectangle(rectangle1);
        rectangles.addRectangle(rectangle2);
        System.out.println("Total rectangles square = " + rectangles.totalSquareOfAllRectangles());
    }
}
