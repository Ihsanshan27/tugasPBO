package tugas;

import java.util.Scanner;

class nilai {

}

public class soal47 {
    private double quiz, uts, uas;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public soal47(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double NilaiAkhir() {
        return (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
    }

    public String Index(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 68 && score < 80) {
            return "B";
        } else if (score >= 56 && score < 68) {
            return "C";
        } else if (score >= 45 && score < 56) {
            return "D";
        } else if (score >= 0 && score < 45) {
            return "E";
        } else {
            return "tidak diketahui";
        }
    }

    public String Keterangan(String index) {
        if (index.equals("A")) {
            return "Sangat Baik";
        } else if (index.equals("B")) {
            return "Baik";
        } else if (index.equals("C")) {
            return "Cukup";
        } else if (index.equals("D")) {
            return "Kurang";
        } else if (index.equals("E")) {
            return "Sangat Kurang";
        } else {
            return "Tidak Diketahui";
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        soal47 Nilai = new soal47(0, 0, 0);

        System.out.print("Masukan nilai Quiz : ");
        double nilaiQuiz = scanner.nextInt();
        Nilai.setQuiz(nilaiQuiz);

        System.out.print("Masukan nilai UTS : ");
        double nilaiUts = scanner.nextInt();
        Nilai.setUts(nilaiUts);

        System.out.print("Masukan nilai UAS : ");
        double nilaiUas = scanner.nextInt();
        Nilai.setUas(nilaiUas);

        double nilaiakhir = Nilai.NilaiAkhir();

        String indeks = Nilai.Index((int) nilaiakhir);
        String keterangan = Nilai.Keterangan(indeks);

        System.out.println("Nilai Quiz : " + nilaiQuiz);
        System.out.println("Nilai UTS : " + nilaiUts);
        System.out.println("Nilai Quiz : " + nilaiUas);
        System.out.println("Nilai Akhir : " + nilaiakhir);
        System.out.println("Index : " + indeks);
        System.out.println("Keterangan : " + keterangan);

        scanner.close();
    }
}
