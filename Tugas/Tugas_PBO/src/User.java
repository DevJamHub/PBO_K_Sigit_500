public class User {
    // Enkapsulasi atrribut string
    private String nama;
    private String nim;

    //membuat konstruktor
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //membuat setter dan getter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    //membuat method login, yang akan di override oleh subclass
    public boolean login() {
        return false;
    }

    //method tampilkanInfo() untuk menampilkan info umum
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
