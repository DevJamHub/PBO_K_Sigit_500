// Superclass KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter dan Setter untuk kesehatan
    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan dioverride oleh subclass
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama());
    }
}