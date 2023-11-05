package school.lesson5.Figures;

public class Triangle implements FigureInterface {
    double sideA, sideB, sideC;
    String fillColor;
    String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double figureArea() {
        double p = figurePerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public void info() {
        System.out.println("Triangle perimeter: " + figurePerimeter() + "\n"
                + "Area of a triangle: " + figureArea() + " square centimeters\n"
                + "Triangle fill color: " + fillColor + "\n"
                + "Triangle border color: " + borderColor);
    }
}
