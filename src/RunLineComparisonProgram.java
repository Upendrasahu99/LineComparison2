public class RunLineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparison line1 = new LineComparison(1);
        line1.enterCoordinate(5,5,4,3);
        line1.calculatingLength();
        LineComparison line2 = new LineComparison(2);
        line2.enterCoordinate(4,7,6,5);
        line2.calculatingLength();
        if(line1.equals(line2)){
            System.out.println("Both lines are equal.");
        }else {
            System.out.println("Both lines are not equal.");
        }

    }
}
