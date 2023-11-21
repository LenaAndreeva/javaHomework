package school.lesson9.Task5;

public class Main {
    public static void main(String[] args) {

        LoginProcessor loginProcessor = new LoginProcessor();

        loginProcessor.collectLogins();
        loginProcessor.printLoginsStartingWithF();
    }
}
