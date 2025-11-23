package core.basesyntax;

public class UserStorage {
    public void saveUser(User user) {
        System.out.println("User " + user.getLogin() + " was saved");
    }
}


