public class Mahasiswa {
    private String nama = "sigit";
    private String NIM = "202410370110500";

    public void login(String inputNama, String inputNim) {
        if (nama.equals(inputNama) && NIM.equals(inputNim)) {
            System.out.println("Login Mahasiswa berhasil");
            displayInfo();
        } else {
            System.out.println("Login gagal!");
        }
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
    }
}