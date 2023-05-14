import java.util.Scanner;

public class LineComparison {

    int lineNumber;
    double firstPointX, firstPointY;
    double secondPointX, secondPointY;

    public LineComparison(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void enterCoordinate(double firstPointX, double firstPointY, double secondPointX, double secondPointY) {
        this.firstPointX = firstPointX;
        this.firstPointY = firstPointY;
        this.secondPointX = secondPointX;
        this.secondPointY = secondPointY;
    }

    public double calculatingLength() {

        double length = Math.sqrt(Math.pow((secondPointX - firstPointX), 2) + Math.pow((secondPointY - firstPointY), 2));
        System.out.println("Length of Line" + lineNumber + " = " + length);
        return length;
    }
}
