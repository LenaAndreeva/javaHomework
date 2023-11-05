package school.lesson5.Figures;

public class Triangle implements figureInterface{
    double figurePerimeter;
    double figureArea;
    double sideA, sideB, sideC;
    String fillColor;
    String borderColor;

    public Triangle(float sideA, float sideB, float sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return figurePerimeter = sideA + sideB + sideC;
    }

    @Override
    public double figureArea() {
        double p = figurePerimeter() / 2;
        return figureArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public void info() {
        System.out.println("Периметр треугольника: " + figurePerimeter() + "\n"
                + "Площадь треугольника: " + figureArea() + "\n" + "Цвет заливки треугольника: "
                + fillColor + "\n" + "Цвет границ треугольника: " + borderColor);
    }
}
