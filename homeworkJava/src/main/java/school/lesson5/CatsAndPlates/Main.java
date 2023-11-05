package school.lesson5.CatsAndPlates;

public class Main {
    public static void main(String[] args) {

        Cat charlie = new Cat("Charlie", 4);
        Plate charliePlate = new Plate(3);

        Cat bob = new Cat("Bob", 10);
        Plate bobPlate = new Plate(10);

        charliePlate.info();
        charlie.eat(charliePlate);
        charliePlate.info();
        charlie.info();

        System.out.println();

        bobPlate.info();
        bob.eat(bobPlate);
        bobPlate.info();
        bob.info();

        System.out.println();

        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Barsik", 20);
        arrCats[1] = new Cat("Murzik", 45);
        arrCats[2] = new Cat("Vasya", 5);
        arrCats[3] = new Cat("Murka", 10);
        arrCats[4] = new Cat("Milka", 21);

        Plate arrOfCatsPlate = new Plate(100);

        arrOfCatsPlate.info();

        for (int i = 0; i < arrCats.length; i++) {
            if(!arrCats[i].satiety && arrCats[i].hungerLevel <= arrOfCatsPlate.food) {
                arrCats[i].eat(arrOfCatsPlate);
                arrCats[i].satiety = true;
                System.out.println("Cat " + arrCats[i].name + " has eaten and is full");
            } else {
                System.out.println("Cat " + arrCats[i].name + " has not eaten and is hungry");
            }
        }

        System.out.println();

        // вариант 2 -  получение информации о сытости котов через метод info

        for (int i = 0; i < arrCats.length; i++) {
            arrCats[i].eat(arrOfCatsPlate);
            arrCats[i].info();
        }

        System.out.println();

        // наполнение тарелки едой

        arrOfCatsPlate.info();
        arrOfCatsPlate.addFood(50);
        arrOfCatsPlate.info();
    }
}
