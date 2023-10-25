package tugas;

public class test {
    private float kuatArus;
    private float hambatan;

    public test(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public test() {
        this.kuatArus = 0.0f;
        this.hambatan = 0.0f;
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
        test baterai = new test(5.0f, 6.0f);

        System.out.println("Kuat Arus = " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan  = " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan = " + baterai.hitungTegangan() + " volt");
    }
}
