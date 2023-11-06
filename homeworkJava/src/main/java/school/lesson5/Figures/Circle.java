package school.lesson5.Figures;

public class Circle implements FigureInterface {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return Math.round(2 * Math.PI * radius);
    }

    @Override
    public double figureArea() {
        return Math.round(Math.PI * radius * radius);
    }

    public void info() {
        System.out.println("Circle perimeter: " + figurePerimeter() + "\n"
                + "Area of a circle: " + figureArea() + "\n"
                + "Circle fill color: " + fillColor + "\n"
                + "Circle border color: " + borderColor);
    }
}
