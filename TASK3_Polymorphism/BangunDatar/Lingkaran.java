package TASK3_Polymorphism.BangunDatar;

public class Lingkaran {
    protected double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double keliling() {
        return 2 * Math.PI * r;
    }

    public double luas() {
        return Math.PI * r * r;
    }
}
