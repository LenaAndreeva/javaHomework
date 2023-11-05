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
            System.out.println("Собака " + name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " не может пробежать больше 500 метров");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistLimit) {
            System.out.println("Собака " + name + " проплыл " + distance + " метров");
        } else {
            System.out.println("Собака " + name + " не может проплыть больше 10 метров");
        }
    }
}
