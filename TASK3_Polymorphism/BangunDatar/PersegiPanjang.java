package TASK3_Polymorphism.BangunDatar;

public class PersegiPanjang {
    protected double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public double luas() {
        return panjang * lebar;
    }
}
