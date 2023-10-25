package tugas;

import java.text.DecimalFormat;

public class soal50 {
    private double massa, kecepatanAkhir, kecepatanAwal;

    public soal50(double massa, double kecepatanAkhir, double kecepatanAwal) {
        this.massa = massa;
        this.kecepatanAkhir = kecepatanAkhir;
        this.kecepatanAwal = kecepatanAwal;
    }

    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public double getMassa() {
        return massa;
    }

    public double energiKinetik() {
        return 0.5 * massa * kecepatanAkhir * kecepatanAkhir;
    }

    public double usaha() {
        return energiKinetik() - (0.5 * massa * kecepatanAkhir * kecepatanAwal);
    }

    public static void main(String[] args) {
        soal50 energiKinetik = new soal50(0.145, 25, 0);
        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Energi Kinetik yang dihasilkan: " + df.format(energiKinetik.energiKinetik()) + " J");
        System.out.println("Usaha yang dilakukan bola pada saat kecepatan " + df.format(energiKinetik.kecepatanAwal)
                + " = " + df.format(energiKinetik.usaha()) + " J");

    }

}
