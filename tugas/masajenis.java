package tugas;

class Kubus {
    private int sisi;
    private int massa;

    public Kubus(int sisi, int massa){
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
        return sisi*sisi*sisi;
    }

    public double massaJenis(){
        return massa / volume();
    }

}

public class masajenis {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5, 250);

        System.out.println("Volume : " + kubus.volume());
        System.out.println("Massa Jenis : " + kubus.massaJenis());
    }
}