package tugas;

class Persegi {

}

class PersegiPanjang {

}

public class hitungluas {
    private double sisi;
    private double panjang;
    private double lebar;

    public hitungluas(double sisi, double panjang, double lebar) {
        this.sisi = sisi;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double KelilingPersegi() {
        return 4 * sisi;
    }

    public double LuasPersegi() {
        return sisi * sisi;
    }

    public double KelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    public double LuasPersegiPanjang() {
        return panjang * lebar;
    }

    public static void main(String args[]) {
        hitungluas datar = new hitungluas(5, 5, 6);

        System.out.println("Luas Persegi: " + datar.LuasPersegi());
        System.out.println("Keliling Persegi: " + datar.KelilingPersegi());

        System.out.println("Luas Persegi Panjang: " + datar.LuasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang: " + datar.KelilingPersegiPanjang());
    }
}
