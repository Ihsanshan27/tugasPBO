package tugas;

import java.util.Scanner;

public class tabungan {
    private int saldo;

    public tabungan(int saldoAwal) {
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

        tabungan Tabungan = new tabungan(saldoAwal);

        System.out.print("Masukan jumlah uang yang akan diambil: ");
        int jumlahTarik = input.nextInt();

        Tabungan.TarikUang(jumlahTarik);

        System.out.println("Saldo saat ini: " + Tabungan.getSaldo());
        input.close();
    }
}
