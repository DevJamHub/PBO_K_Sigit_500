import java.util.Scanner;

// Kelas utama
public class MainLog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("=== Sistem Login ===");
        System.out.print("Pilih jenis login (Admin/Mahasiswa): ");
        String pilihan = scanner.nextLine();

        if (pilihan.equalsIgnoreCase("Admin")) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            if (admin.login(inputUsername, inputPassword)) {
                System.out.println("Login berhasil sebagai Admin!");
            } else {
                System.out.println("Username atau password salah.");
            }

        } else if (pilihan.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan nama: ");
            String inputNama = scanner.nextLine();
            System.out.print("Masukkan NIM : ");
            String inputNim = scanner.nextLine();

            if (mahasiswa.login(inputNama, inputNim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}