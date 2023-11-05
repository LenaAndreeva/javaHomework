package school.lesson5.CatsAndPlates;

public class MainApp {
    public static void main(String[] args) {
        Cat charlie = new Cat("Charlie", 4);
        Plate plate = new Plate(3);

        plate.info();
        charlie.eat(plate);
        plate.info();
        charlie.info();

        System.out.println();

        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Barsik", 20);
        arrCats[1] = new Cat("Murzik", 45);
        arrCats[2] = new Cat("Vasya", 5);
        arrCats[3] = new Cat("Murka", 10);
        arrCats[4] = new Cat("Milka", 21);

        Plate plate1 = new Plate(100);

        plate1.info();


        for (int i = 0; i < arrCats.length; i++) {
            if(!arrCats[i].satiety && arrCats[i].hungerLevel <= plate1.food) {
                arrCats[i].eat(plate1);
                arrCats[i].satiety = true;
                System.out.println("Кот " + arrCats[i].name + " поел и сыт");
            } else {
                System.out.println("Кот " + arrCats[i].name + " не поел и голоден");
            }
        }

        System.out.println();

        // вариант 2 -  получение информации о сытости котов через метод info

        for (int i = 0; i < arrCats.length; i++) {
            arrCats[i].eat(plate1);
            arrCats[i].info();
        }

        System.out.println();

        // наполнение тарелки едой

        plate1.info();
        plate1.addFood(50);
        plate1.info();
    }
}
