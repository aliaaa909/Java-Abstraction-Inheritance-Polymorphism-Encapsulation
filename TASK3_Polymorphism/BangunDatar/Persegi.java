package TASK3_Polymorphism.BangunDatar;

public class Persegi {
    protected double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double keliling() {
        return 4 * sisi;
    }

    public double luas() {
        return sisi * sisi;
    }
}
