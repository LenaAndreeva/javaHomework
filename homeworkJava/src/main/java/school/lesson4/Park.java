package school.lesson4;

public class Park {
    String parkName;
    Attraction attr1, attr2, attr3, attr4, attr5;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    {
        attr1 = new Attraction("Cars", "10:00 - 18:00", "$20");
        attr2 = new Attraction("Ferris wheel", "10:00 - 20:00", "$15");
        attr3 = new Attraction("Roller coaster", "10:00 - 19:00", "$25");
        attr4 = new Attraction("Lottery", "10:00 - 17:00", "$5");
        attr5 = new Attraction("Shooting gallery", "10:00 - 20:00", "$10");
    }

    public void greeting() {
        System.out.println("Добро пожаловать в " + parkName + "! \nCписок аттракционов:\n" +
                attr1.nameOfAttr + "\n" +
                attr2.nameOfAttr + "\n" +
                attr3.nameOfAttr + "\n" +
                attr4.nameOfAttr + "\n" +
                attr5.nameOfAttr + "\n");
    }
    public class Attraction {
        String nameOfAttr;
        String workTime;
        String ticketPrice;

        public Attraction(String nameOfAttr, String workTime, String ticketPrice) {
            this.nameOfAttr = nameOfAttr;
            this.workTime = workTime;
            this.ticketPrice = ticketPrice;
        }

        public void attrInfo() {
            System.out.println("Название аттракциона: " + nameOfAttr + "; " + "\n" +
                    "Время работы: " + workTime + "; \n" + "Стоимость билета: " + ticketPrice + "; \n" );
        }
    }

    public static void main(String[] args) {

        Park park = new Park("Wonderland");

        park.greeting();

        park.attr1.attrInfo();
        park.attr2.attrInfo();
        park.attr3.attrInfo();
        park.attr4.attrInfo();
        park.attr5.attrInfo();
    }
}
