package tugas;

import java.util.Scanner;

class Age {

}

public class tandanyakamu {
    private int yearBirth, yearNow;

    public tandanyakamu(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <= 5) {
            return "MASIH BAYIII";
        } else if (umur > 5 && umur <= 10) {
            return "LAGI LUCU LUCUNYAAA";
        } else if (umur > 10 && umur <= 13) {
            return "MASIH REMAJA";
        } else if (umur > 13 && umur <= 19) {
            return "Tandanya lagi di fase LABIL";
        } else if (umur > 19 && umur <= 29) {
            return "LAGI PUSING MIKIRIN JODOH DAN KARIR";
        } else if (umur > 29 && umur <= 35) {
            return "FOKUS CARI UANG BIAR KAYA";
        } else if (umur > 35 && umur <= 150) {
            return "MIKIRIN PENSIUNAN";
        } else {
            return "Sudah beda alam. kali";
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        tandanyakamu age = new tandanyakamu(2023);

        System.out.print("Masukan tahun lahir kamu: ");
        int tahunLahir = scanner.nextInt();
        age.setYearBirth(tahunLahir);

        int sekarang = age.getYearNow();
        int umur = age.hitungUmur();
        String tanda = age.tandanyaKamu(umur);

        System.out.println("Tahun lahir kamu: " + tahunLahir);
        System.out.println("Hari ini tahun: " + sekarang);
        System.out.println("Umur kamu sampai hari ini adalah " + umur + " tahun dan Tandanya kamu " + tanda);
        scanner.close();
    }
}
