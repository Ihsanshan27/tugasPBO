package tugas;

public class masajenis {
    private int sisi;
    private int massa;

    public masajenis(int sisi, int massa) {
        this.sisi = sisi;
        this.massa = massa;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public double volume() {
        return sisi * sisi * sisi;
    }

    public double massaJenis() {
        return massa / volume();
    }

    public static void main(String[] args) {
        masajenis kubus = new masajenis(5, 250);

        System.out.println("Volume : " + kubus.volume());
        System.out.println("Massa Jenis : " + kubus.massaJenis());
    }
}