package TASK3_Polymorphism.BangunRuang;
import TASK3_Polymorphism.BangunDatar.PersegiPanjang;

public class Balok extends PersegiPanjang{
    double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
