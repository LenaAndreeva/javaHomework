package school.lesson5.Figures;

public class Rectangle implements figureInterface{
    double figurePerimeter;
    double figureArea;
    float sideA, sideB;
    String fillColor;
    String borderColor;

    public Rectangle(float sideA, float sideB, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double figurePerimeter() {
        return figurePerimeter = 2 * (sideA + sideB) ;
    }

    @Override
    public double figureArea() {
        return figureArea = sideA * sideB;
    }

    public void info() {
        System.out.println("Периметр прямоугольника: " + figurePerimeter() + "\n"
                + "Площадь прямоугольника: " + figureArea()
                + "\n" + "Цвет заливки прямоугольника: " + fillColor
                + "\n" + "Цвет границ прямоугольника: " + borderColor);
    }
}
