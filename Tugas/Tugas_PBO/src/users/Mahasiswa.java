package users;

import actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private final Scanner scanner = new Scanner(System.in);

    public Mahasiswa(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        return super.username.equals(username) && super.password.equals(password);
    }

    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println("\n=== Menu Mahasiswa ===");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilihan: ");
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> reportItem();
                case "2" -> viewReportedItems();
                case "0" -> {
                    System.out.println("Logout berhasil.");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    @Override
    public void reportItem() {
        System.out.print("Nama Barang: ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = scanner.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = scanner.nextLine();

        System.out.printf("Laporan diterima: %s, %s, %s%n", nama, deskripsi, lokasi);
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}
