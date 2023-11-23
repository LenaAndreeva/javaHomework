package school.lesson10;
import java.util.*;
public class Box <T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float fruitWeight = 0.0f;

        for (T fruit : fruits) {
            fruitWeight += fruit.getWeight();
        }
        return fruitWeight;
    }

    public boolean compare(Box<?> anotherBox) {

        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
