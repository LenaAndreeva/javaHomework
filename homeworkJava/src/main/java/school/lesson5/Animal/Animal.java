package school.lesson5.Animal;

public class Animal {
    String name;
    static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    static int getCountAnimal() {
        return countAnimal;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало" + distance + " m");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло" + distance + " m");
    }
}
