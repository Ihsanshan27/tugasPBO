package tugas;

public class soal44 {
    private float kuatArus, hambatan;

    public soal44(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }

    public static void main(String args[]) {
        soal44 baterai = new soal44(5.0f, 6.0f);

        System.out.println("Kuat Arus = " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan  = " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan = " + baterai.hitungTegangan() + " volt");
    }
}
