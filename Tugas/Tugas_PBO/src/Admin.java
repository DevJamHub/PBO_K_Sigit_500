import java.util.Scanner;

//menggunakan inheritance dari superclass User
public class Admin extends User {

    //atribut tambahan
    private String username;
    private String password;

    //membuat constructor + super
    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    // menggunakan override login() dari superclass User
    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        return inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password);
    }

    // menggunakan override tampilkanInfo dari superclass User
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Login admin berhasil! ===");
        super.tampilkanInfo();
        System.out.println("Anda seorang Admint!");
    }
}
