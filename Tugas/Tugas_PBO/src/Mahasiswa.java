import java.util.Scanner;

class Mahasiswa {
    private String nama = "Sigit";
    private String nim = "2024500";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil sebagai Mahasiswa!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
