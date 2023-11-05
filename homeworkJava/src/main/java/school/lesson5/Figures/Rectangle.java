package school.lesson5.Figures;

public class Rectangle implements FigureInterface {
    double sideA, sideB;
    String fillColor;
    String borderColor;

    public Rectangle(double sideA, double sideB, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public double figureArea() {
        return sideA * sideB;
    }

    public void info() {
        System.out.println("Rectangle perimeter: " + figurePerimeter() + "\n"
                + "Area of a rectangle: " + figureArea() + "\n"
                + "Rectangle fill color: " + fillColor + "\n"
                + "Rectangle border color: " + borderColor);
    }
}
