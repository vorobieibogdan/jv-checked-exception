package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            System.out.println("User registered successfully");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }

    public static void main(String[] args) {
        UserService userService = new UserService();

        // Успішний сценарій: паролі збігаються і мають достатню довжину.
        User correctUser = new User("john_doe@example.com", "password12345", "password12345");
        System.out.println("Спроба реєстрації з коректними даними:");
        userService.registerUser(correctUser);

        System.out.println("\n----------------------------------\n");

        // Невдалий сценарій: паролі занадто короткі.
        User shortPassUser = new User("jane_doe@example.com", "pass", "pass");
        System.out.println("Спроба реєстрації з занадто короткими паролями:");
        userService.registerUser(shortPassUser);

        System.out.println("\n----------------------------------\n");

        // Невдалий сценарій: паролі не збігаються.
        User mismatchPassUser = new User("test_user@example.com", "password12345", "different_pass");
        System.out.println("Спроба реєстрації з паролями, що не збігаються:");
        userService.registerUser(mismatchPassUser);
    }
}

