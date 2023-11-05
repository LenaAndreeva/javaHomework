package school.lesson5.Figures;

public interface FigureInterface {
    default double figurePerimeter() {
        return 0;
    }

    default double figureArea() {
        return 0;
    }
}
