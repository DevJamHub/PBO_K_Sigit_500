// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan Chamber = new Pahlawan("Chamber", 150);
        Musuh jett = new Musuh("Jett", 150);

        // Menampilkan status awal
        System.out.println("Status awal:");
        System.out.println(Chamber.getNama() + " memiliki kesehatan: " + Chamber.getKesehatan());
        System.out.println(jett.getNama() + " memiliki kesehatan: " + jett.getKesehatan());

        // Simulasi pertarungan
        Chamber.serang(jett); // Chamber menyerang Jett
        jett.serang(Chamber); // Jett menyerang Chamber
    }
}