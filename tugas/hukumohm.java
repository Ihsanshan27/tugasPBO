package tugas;

class Baterai {
    private float kuatArus, hambatan;

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public Baterai() {
        this.kuatArus = 0.0f;
        this.hambatan = 0.0f;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}

public class hukumohm {
    public static void main(String args[]){
        Baterai baterai = new Baterai(5.0f, 6.0f);

        System.out.println("Kuat Arus = " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan  = " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan = " + baterai.hitungTegangan() + " volt");
    } 
}
