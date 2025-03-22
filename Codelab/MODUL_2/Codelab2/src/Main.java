public class Main {
    public static void main(String[] args) {
        RekeningBank rek1 = new RekeningBank();
        RekeningBank rek2 = new RekeningBank();

        rek1.nomorR = "202410370110500";
        rek1.namaP = "Sigit Novriyanto";
        rek1.saldo = 2000000;

        rek2.nomorR = "202410370110534";
        rek2.namaP = "BOY";
        rek2.saldo = 500000;

        rek1.tampilkanInfo();
        rek2.tampilkanInfo();

        rek1.setorUang(200000);
        rek2.setorUang(100000);
        System.out.println();

        rek1.tarikTunai(100000);
        rek2.tarikTunai(1000000);

    }
}