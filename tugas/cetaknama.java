package tugas;

import java.util.Scanner;

class Printer {
    private int jmlCetak;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }

}

public class cetaknama {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Aplikasi Cetak Nama=====");
        System.out.print("Masukan nama anda: ");
        String nama = scanner.nextLine();

        System.out.print("Mau cetak berapa kali? ");
        int cetak = scanner.nextInt();

        Printer printer = new Printer();
        printer.setNama(nama);
        printer.setJmlCetak(cetak);

        System.out.println("Nama anda : " + printer.getNama());
        System.out.println("Hasil Cetak : ");
        printer.cetak(printer.getNama());

        scanner.close();
    }

}
