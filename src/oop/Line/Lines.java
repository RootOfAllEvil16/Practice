package oop.Line;

import java.util.ArrayList;

public class Lines {

    ArrayList<Line> lines = new ArrayList<>();

    public void addLine(Line line) {
        lines.add(line);
    }

    public double totalLinesLength() {
        double totalLength = 0;
        for (Line line : lines) {
            totalLength += line.getLineLength();
        }
        return totalLength;
    }
    public double longestLine(){
        double longestLine = lines.get(0).getLineLength();
        for (Line line : lines){
            if(line.getLineLength() > longestLine){
                longestLine = line.getLineLength();
            }
        }
        return longestLine;
    }
}
