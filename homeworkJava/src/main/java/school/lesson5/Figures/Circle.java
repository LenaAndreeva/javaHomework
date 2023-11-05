package school.lesson5.Figures;

public class Circle implements figureInterface{
    double figurePerimeter;
    double figureArea;
    float radius;
    String fillColor;
    String borderColor;

    public Circle(float radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return figurePerimeter =  (2 * Math.PI * radius);
    }

    @Override
    public double figureArea() {
        return figureArea = (Math.PI * radius * radius);
    }

    public void info() {
        System.out.println("Периметр круга: " + figurePerimeter() + "\n"
                + "Площадь круга: " + figureArea() + "\n" + "Цвет заливки круга: "
                + fillColor + "\n" + "Цвет границ круга: " + borderColor);
    }
}
