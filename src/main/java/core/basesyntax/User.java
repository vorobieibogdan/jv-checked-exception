package core.basesyntax;

public class User {
    private String name;
    private String password;
    private String repeatPassword;

    // getters, setters, constructor

    public User(String name, String password, String repeatPassword) {
        this.name = name;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}


