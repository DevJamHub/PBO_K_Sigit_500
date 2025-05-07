package main;

import users.User;
import users.Admin;
import users.Mahasiswa;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;

        // Menu pilihan peran
        System.out.println("\n-- Meminta pilihan login --");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int roleChoice = Integer.parseInt(scanner.nextLine());

        // Input kredensial
        System.out.print("Username: ");
        String userInput = scanner.nextLine();
        System.out.print("Password: ");
        String passInput = scanner.nextLine();

        // Buat objek sesuai pilihan dengan switch
        switch (roleChoice) {
            case 1:
                user = new Admin("atmint", "atmint123");
                break;
            case 2:
                user = new Mahasiswa("andre", "andriana123");
                break;
            default:
                System.out.println("Pilihan peran tidak valid.");
                scanner.close();
                return;  // keluar dari main
        }

        // Verifikasi dan jalankan menu peran
        if (user.login(userInput, passInput)) {
            String roleName = (roleChoice == 1) ? "Admin" : "Mahasiswa";
            System.out.println("Login berhasil sebagai " + roleName);
            user.displayAppMenu();
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }
}
