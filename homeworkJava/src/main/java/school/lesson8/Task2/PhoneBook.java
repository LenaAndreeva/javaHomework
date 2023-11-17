package school.lesson8.Task2;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String surname, String number) {

        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(surname, numbers);
        }
    }

    public void get(String lastName) {
        List<String> phones = phoneBook.get(lastName);
        if (phones == null) {
            System.out.println("\nNo phone phone numbers were found for the surname " + lastName);
        } else {
            System.out.println("\nThe following numbers were found for the surname " + lastName + ":");
            for (String phone : phones) {
                System.out.println(phone);
            }
        }
    }
}
