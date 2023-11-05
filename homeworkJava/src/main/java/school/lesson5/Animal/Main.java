package school.lesson5.Animal;

public class Main {
    public static void main(String[] args) {

        Animal catBob;
        Animal catBill;
        Animal dogSharik;
        Animal dogTuzik;

        catBob = new Cat("Bob");
        catBill = new Cat("Bill");
        dogSharik = new Dog("Sharik");
        dogTuzik = new Dog("Tuzik");


        catBob.run(199);
        catBill.run(201);
        catBill.swim(5);
        dogSharik.run(450);
        dogSharik.run(501);
        dogTuzik.swim(10);
        dogSharik.swim(12);

        System.out.println();

        System.out.println("Quantity of animals: " + Animal.getCountAnimal());
        System.out.println("Quantity of cats: " + Cat.getCountCat());
        System.out.println("Quantity of dogs: " + Dog.getCountDog());
    }
}
