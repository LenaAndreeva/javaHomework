package school.lesson8.Task2;

public class AddNumberService {
    private final PhoneBook phoneBook;

    public AddNumberService(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void addPhoneNumbers() {
        phoneBook.add("Wilson", "750265489");
        phoneBook.add("Davies", "146093648");
        phoneBook.add("Wilson", "369084167");
        phoneBook.add("Wilson", "673072169");
        phoneBook.add("Brown", "924675489");
    }
}
