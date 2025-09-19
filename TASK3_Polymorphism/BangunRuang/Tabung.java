package TASK3_Polymorphism.BangunRuang;
import TASK3_Polymorphism.BangunDatar.Lingkaran;

public class Tabung extends Lingkaran {
    double tinggi;

    public Tabung(double r, double tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public double volume() {
        return Math.PI * r * r * tinggi;
    }

    public double luasPermukaan() {
        return 2 * Math.PI * r * (r + tinggi);
    }

}
