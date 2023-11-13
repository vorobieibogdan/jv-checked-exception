package core.basesyntax;

public class UserService {
    public void registerUser(User user) {
        try {
            PasswordValidator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
            System.out.println("Use registered successfully");
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again. Reason: " + e.getMessage());
        }
        //write your code here
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("john_doe", "password123", "password123");
        userService.registerUser("john_doe", "pass", "pass");
    }

    private void registerUser(String janeDoe, String pass, String pass1) {

    }
}
