package tugas;

public class soal49 {
    private double beratEmas, hargaPerGram;

    public double getBeratEmas() {
        return beratEmas;
    }

    public double getHargaPerGram() {
        return hargaPerGram;
    }

    public soal49(double beratEmas, double hargaPerGram) {
        this.beratEmas = beratEmas;
        this.hargaPerGram = hargaPerGram;
    }

    public double totalHargaEmas() {
        return beratEmas * hargaPerGram;
    }

    public static void main(String[] args) {
        soal49 hitungHargaEmas = new soal49(15.7, 570000);

        // hitungHargaEmas.setBeratEmas(15,7);
        // hitungHargaEmas.setHargaPerGram(570000);
        System.out.println("Berat Emas Yang Dibeli: " + hitungHargaEmas.beratEmas);
        System.out.println("Harga emas per gram: " + hitungHargaEmas.hargaPerGram);
        System.out.println("Total Bayar: " + hitungHargaEmas.totalHargaEmas());
    }

}
