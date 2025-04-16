import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih jenis login (1/2): ");
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":
                System.out.print("Masukkan Username: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan Password: ");
                String password = scanner.nextLine();

                admin.login(username, password); // Langsung panggil login
                break;

            case "2":
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                mahasiswa.login(nama, nim); // Langsung panggil login
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}