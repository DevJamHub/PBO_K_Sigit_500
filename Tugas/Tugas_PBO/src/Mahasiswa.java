import java.util.Scanner;

public class Mahasiswa extends User {
    //membuat constructor menggunakan super
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // menggunakan override login() untuk mencocokan nama dan nim menggunakan superclass
    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("NIM: ");
        String inputNIM = scanner.nextLine();
        return inputNama.equalsIgnoreCase(getNama()) && inputNIM.equals(getNim());
    }

    // menggunakan override tampilkanInfo() untuk pesan login suskses
    @Override
    public void tampilkanInfo() {
        System.out.println(" === Login Mahasiswa berhasil!! ====");
        super.tampilkanInfo();
        System.out.println("Anda seorang Mahasiswa gantenk!");
    }
}