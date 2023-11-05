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
            System.out.println("Кот " + name + " пробежал " + distance + " метров");
        } else {
            System.out.println("Кот " + name + " не может пробежать больше 200 метров");
        }
    }

    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
