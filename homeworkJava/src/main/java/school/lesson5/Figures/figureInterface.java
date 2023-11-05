package school.lesson5.Figures;

public interface figureInterface {
    double figurePerimeter = 0;
    double figureArea = 0;

    default double figurePerimeter() {
        return figurePerimeter;
    };
    default double figureArea() {
        return figureArea;
    }
}
