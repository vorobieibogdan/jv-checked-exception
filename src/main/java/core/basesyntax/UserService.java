package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        try {
            validator.validate(user);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    private void saveUser(User user) {
        // Your logic to save the user to DB.
        System.out.println("User " + user.getName() + " was successfully registered!");
    }
}




