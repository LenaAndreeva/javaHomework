package school.lesson8.Task2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phonebook1 = new PhoneBook();

        phonebook1.add("Wilson", "750265489");
        phonebook1.add("Davies", "146093648");
        phonebook1.add("Wilson", "369084167");
        phonebook1.add("Wilson", "673072169");
        phonebook1.add("Brown", "924675489");

        phonebook1.get("Wilson");
        phonebook1.get("Davies");
        phonebook1.get("Brown");
        phonebook1.get("Robinson");
    }
}
