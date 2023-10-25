package tugas;

import java.util.Scanner;

public class soal43 {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok;

    public soal43(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok) {
        this.nama = nama;
        this.alamat = alamat;
        this.uangTransport = uangTransport;
        this.uangTunjangan = uangTunjangan;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int TotalGaji() {
        return uangTransport + uangTunjangan + gajiPokok;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = "ihsan";
        String alamat = "Bogor";
        int uangTransport = 5000;
        int uangTunjangan = 10000;
        int gajiPokok = 500000;

        soal43 pegawai = new soal43(nama, alamat, uangTransport, uangTunjangan, gajiPokok);

        System.out.println("### DATA GAJI KARYAWAN");
        System.out.println("========================");
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Alamat: " + pegawai.getAlamat());
        System.out.println("Uang Transport: " + pegawai.getUangTransport());
        System.out.println("Uang Tunjangan: " + pegawai.getUangTunjangan());
        System.out.println("Gaji Pokok: " + pegawai.getGajiPokok());
        System.out.println("Total Gaji: " + pegawai.TotalGaji());

        input.close();

    }
}
