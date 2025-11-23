package core.basesyntax;

public class UserService {
    private PasswordValidator passwordValidator = new PasswordValidator();
    private UserStorage userStorage = new UserStorage();

    public void registerUser(String login, String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            User user = new User(login, password);
            userStorage.saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your password is incorrect. Try again.");
        }
    }
}


