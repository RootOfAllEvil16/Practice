package oop.Line;

public class LineRunner {
    public static void main(String[] args) {

        Point a = new Point(0,1);
        Point b = new Point(2,-2);
        Line line1 = new Line(a,b);
        System.out.println("Line1 length = " + line1.getLineLength());

        Point a1 = new Point(2,6);
        Point b1 = new Point(6,2);
        Line line2 = new Line(a1,b1);
        System.out.println("Line2 length = " + line2.getLineLength());

        Lines lines = new Lines();
        lines.addLine(line1);
        lines.addLine(line2);
        System.out.println("Total lines length = " + lines.totalLinesLength());
        System.out.println("Longest line = " + lines.longestLine());
    }
}
