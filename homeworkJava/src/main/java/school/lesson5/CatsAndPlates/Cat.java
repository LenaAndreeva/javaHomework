package school.lesson5.CatsAndPlates;

public class Cat {
    String name;
    int hungerLevel;
    boolean satiety;

    int fullnesLevel;

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
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
