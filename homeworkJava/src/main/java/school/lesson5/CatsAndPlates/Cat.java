package school.lesson5.CatsAndPlates;

public class Cat {
    String name;
    int hungerLevel;
    boolean satiety;

    public Cat(String name, int hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if(!satiety && plate.removeFood(hungerLevel)) {
            satiety = true;
        }
    }

    public void info() {
        if (satiety) {
            System.out.println("Cat " + name + " is full");
        } else {
            System.out.println("Cat " + name + " is hungry");
        }
    }
}
