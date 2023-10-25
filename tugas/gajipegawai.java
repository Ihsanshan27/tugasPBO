package tugas;

import java.util.Scanner;

class Pegawai {
    private String nama, alamat;
    private int UangTransport, UangTunjangan, GajiPokok, TotalGaji;

    public Pegawai(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok) {
        this.nama = nama;
        this.alamat = alamat;
        UangTransport = uangTransport;
        UangTunjangan = uangTunjangan;
        this.GajiPokok = gajiPokok;
        this.TotalGaji = uangTunjangan + UangTransport + gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return UangTransport;
    }

    public void setUangTransport(int uangTransport) {
        UangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return UangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        UangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return GajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.GajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return TotalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.TotalGaji = totalGaji;
    }

    // public int TotalGaji(){
    // return UangTransport + UangTransport + GajiPokok;
    // }

}

public class gajipegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "ihsan";
        String alamat = "Bogor";
        int uangTransport = 5000;
        int uangTunjangan = 10000;
        int gajiPokok = 5000300;

        Pegawai pegawai = new Pegawai(nama, alamat, uangTransport, uangTunjangan, gajiPokok);

        System.out.println("Data Pegawai:");
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Uang Transport: " + pegawai.getUangTransport());
        System.out.println("Uang Tunjangan: " + pegawai.getUangTunjangan());
        System.out.println("Gaji Pokok: " + pegawai.getGajiPokok());
        System.out.println("Total Gaji: " + pegawai.getTotalGaji());

        input.close();

    }
}
