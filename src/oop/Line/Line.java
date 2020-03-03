package oop.Line;

public class Line {

    private final Point startPoint;
    private final Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    /*
    Рассчитайте длину исходного отрезка (A),
    найдя квадратный корень из суммы квадратов рассчитанных на предыдущем шаге длин проекций на оси координат:
    A = √(X²+Y²) = √ ((X2-X1)²+(Y2-Y1)²).
     */

    public double getLineLength() {
        return Math.sqrt(Math.pow((endPoint.getX()-startPoint.getX()),2)+Math.pow((endPoint.getY()-startPoint.getY()),2));
    }
    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
