import java.util.Scanner;

class Admin {
    private String username = "admin";
    private String password = "1234";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password);
    }
}