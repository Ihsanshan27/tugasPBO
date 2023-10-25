package tugas;

public class soal48 {
    private double value1, value2;

    public soal48(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public String NameProject() {
        return "Project Kalkulator";
    }

    public String NoteProject() {
        return "This project shown you how to manage method in java";
    }

    public double add() {
        return value1 + value2;
    }

    public double minus() {
        return value1 - value2;
    }

    public double multiply() {
        return value1 * value2;
    }

    public double divide() {
        return value1 / value2;
    }

    public static void main(String[] args) {
        soal48 kalkulator = new soal48(5, 10);

        System.out.println(kalkulator.NameProject());
        System.out.println(kalkulator.NoteProject());
        System.out.println("Result add is: " + kalkulator.add());
        System.out.println("Result minus is: " + kalkulator.minus());
        System.out.println("Result multiply is: " + kalkulator.multiply());
        System.out.println("Result divide is: " + kalkulator.divide());
    }

}
