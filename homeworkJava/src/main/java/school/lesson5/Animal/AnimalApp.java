package school.lesson5.Animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal catBob;
        Animal catBill;
        Animal dogSharik;
        Animal dogTuzik;

        catBob = new Cat("Bob");
        catBill = new Cat("Bill");
        dogSharik = new Dog("Sharik");
        dogTuzik = new Dog("Tuzik");


        catBob.run(201);
        catBill.swim(5);
        dogSharik.run(450);
        dogTuzik.swim(10);

        System.out.println("Всего животных: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDog());
    }
}
