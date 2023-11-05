package school.lesson5.Animal;

public class Cat extends Animal {
    int runDistLimit = 200;
    static int countCat;

    public Cat(String name) {
        super(name);
        countCat++;
    }

    static int getCountCat() {
        return countCat;
    }

    public void run(int distance) {
        if (distance <= runDistLimit) {
            System.out.println("Cat " + name + " ran " + distance + " meters");
        } else {
            System.out.println("Cat " + name + " cannot run more than 200 meters");
        }
    }

    public void swim(int distance) {
        System.out.println("Cat " + name + " can't swim");
    }
}
