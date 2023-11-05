package school.lesson5.CatsAndPlates;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean removeFood(int amount) {
        if (amount > food) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("Amount of food in the plate: " + food);
    }
}
