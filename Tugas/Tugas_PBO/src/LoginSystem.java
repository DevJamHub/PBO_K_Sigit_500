import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh data user
        Admin admin = new Admin("Admin", "-", "Adminaja", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("Sigit Novriyanto", "202410370110500");

        while (true) {
            System.out.println("\n=== Sistem Login ===");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.print("Masukkan pilihan (1/2): ");

            int pilihan = 0;
            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Buang newline
            } else {
                scanner.nextLine(); // Buang input non-angka
                System.out.println("Input harus angka! Silakan coba lagi.");
                continue;
            }

            boolean sukses = false;
            User user = null;

            if (pilihan == 1) {
                user = admin;
                sukses = admin.login();
            } else if (pilihan == 2) {
                user = mahasiswa;
                sukses = mahasiswa.login();
            } else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
                continue;
            }

            if (sukses) {
                user.tampilkanInfo();
                break; // keluar dari loop karena login sukses
            } else {
                System.out.println("Login gagal! Silakan coba lagi.");
            }
        }
    }
}