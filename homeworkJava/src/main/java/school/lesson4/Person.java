package school.lesson4;

public class Person {
    private String FNLN;
    private String position;
    private String email;
    private long phoneNumber;
    private String salary;
    private int age;

    public Person(String FNLN, String position, String email, long phoneNumber,
                  String salary, int age) {
        this.FNLN = FNLN;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {

        System.out.println(" ФИО: " + FNLN + "; \n должность: " + position +
                "; \n email: " + email + "; \n номер телефона: " + phoneNumber +
                "; \n зарплата: " + salary + "; \n возраст: " + age);
    }

    // variant 2
    public String toString() {
        return "{" +
                "ФИО: " + FNLN + ";\n" +
                " должность: " + position + ";\n" +
                " email: " + email + ";\n" +
                " телефон: " + phoneNumber + ";\n" +
                " зарплата: " + salary + ";\n" +
                " возраст:  " + age + ";" + '}';
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5];

        persArray[0] = new Person("Andrey Andreev", "sales manager",
                "andreyAndreev@gmail.com", 5678945, "$700", 48);

        persArray[1] = new Person("Anna Ivanova", "project manager",
                "annaIvanova@gmail.com", 3657891, "$650", 35);

        persArray[2] = new Person("Irina Petrova", "analyst",
                "irinaPetrova@gmail.com", 7856980, "750", 42);

        persArray[3] = new Person("Anton Vasil'ev", "accountant",
                "antonVasil@gmail.com", 9783455, "$600", 32);

        persArray[4] = new Person("Aleksey Alekseev", "designer",
                "alekseyAlekseev@gmail.com", 5646589, "$700", 36);


        // список сотрудников старше 40 лет

        for (int i = 0; i < persArray.length; i++) {
            if(persArray[i].age > 40) {
                System.out.println(persArray[i]);
            }
        }

        System.out.println();

        // информация об объекте
        persArray[3].info();

        System.out.println();

        // variant 2
        System.out.println(persArray[1]);
    }
}
