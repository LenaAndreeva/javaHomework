package school.lesson9.Task5;
import java.util.*;
public class LoginProcessor {

    private List<String> userLogins;

    public LoginProcessor() {
        userLogins = new ArrayList<>();
    }

    public void collectLogins() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your logins: \nIf you want to quit, enter an empty line");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            userLogins.add(input);
        }
    }
    public void printLoginsStartingWithF() {
        System.out.println("Logins starting with the letter 'f':");
        userLogins.stream()
                .filter(login -> login.toLowerCase().startsWith("f"))
                .forEach(System.out::println);
    }
}
