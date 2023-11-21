package school.lesson8.Task2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phonebook1 = new PhoneBook();
        AddNumberService addNumberService = new AddNumberService(phonebook1);

        addNumberService.addPhoneNumbers();

        phonebook1.get("Wilson");
        phonebook1.get("Davies");
        phonebook1.get("Brown");
        phonebook1.get("Robinson");
    }
}
