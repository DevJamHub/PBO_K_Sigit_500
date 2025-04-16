public class Admin {
    private String username = "admin";
    private String password = "admin123";

    public void login(String inputUsername, String inputPassword) {
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("Login admin berhasil");
        } else {
            System.out.println("login admin gagal!");
        }
    }
}