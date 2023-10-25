package tugas;

import java.util.Scanner;

public class soal42 {
    private int saldo;

    public soal42(int saldoAwal) {
        saldo = saldoAwal;
    }

    public void SetorUang(int jumlah) {
        saldo += jumlah;
    }

    public void TarikUang(int jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo Tidak Mencukupi");
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Saldo Awal: ");
        int saldoAwal = input.nextInt();

        soal42 Tabungan = new soal42(saldoAwal);

        System.out.print("Masukan jumlah uang yang akan diambil: ");
        int jumlahTarik = input.nextInt();

        Tabungan.TarikUang(jumlahTarik);

        System.out.println("Saldo saat ini: " + Tabungan.getSaldo());
        input.close();
    }
}
