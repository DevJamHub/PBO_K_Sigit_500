package users;

import actions.AdminActions;
import java.util.Scanner;

public class Admin extends User implements AdminActions {
    private final Scanner scanner = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        return super.username.equals(username) && super.password.equals(password);
    }

    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println("\n=== Menu Admin ===");
            System.out.println("1. Kelola Laporan Barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> manageItems();
                case "2" -> manageUsers();
                case "0" -> {
                    System.out.println("Logout berhasil.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println(">> Fitur Kelola Barang Belum Tersedia <<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">> Fitur Kelola Mahasiswa Belum Tersedia <<");
    }
}
