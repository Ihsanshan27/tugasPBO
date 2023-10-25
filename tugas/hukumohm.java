package tugas;

public class hukumohm {
    private float kuatArus, hambatan;

    public hukumohm(float kuatArus, float hambatan) {
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
        hukumohm baterai = new hukumohm(5.0f, 6.0f);

        System.out.println("Kuat Arus = " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan  = " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan = " + baterai.hitungTegangan() + " volt");
    }
}
