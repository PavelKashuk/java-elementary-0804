package solidPrinciples.openClosedPrinciple;

public class AreaCalculator {
    public double areaCalc(Shape... shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
