package school.lesson5.Animal;

public class Dog extends Animal{
    int runDistLimit = 500;
    int swimDistLimit = 10;
    static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    static int getCountDog() {
        return countDog;
    }

    public void run(int distance) {
        if (distance <= runDistLimit) {
            System.out.println("Dog " + name + " ran " + distance + " meters");
        } else {
            System.out.println("Dog " + name + " cannot run more than 500 meters");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistLimit) {
            System.out.println("Dog " + name + " swam " + distance + " meters");
        } else {
            System.out.println("Dog " + name + " cannot swim more than 10 meters");
        }
    }
}
