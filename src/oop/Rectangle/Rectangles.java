package oop.Rectangle;

import java.util.ArrayList;

public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<>();

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }
    public double totalSquareOfAllRectangles(){
        double totalSquare = 0;
        for (Rectangle rectangle : rectangles){
            totalSquare += rectangle.getSquare();
        }
        return totalSquare;
    }

}
