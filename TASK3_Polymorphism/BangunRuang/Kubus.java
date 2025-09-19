package TASK3_Polymorphism.BangunRuang;
import TASK3_Polymorphism.BangunDatar.Persegi;

public class Kubus extends Persegi {

    public Kubus(double sisi) {
        super(sisi);
    }

    public double volume() {
        return sisi * sisi * sisi;
    }

    public double luasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
