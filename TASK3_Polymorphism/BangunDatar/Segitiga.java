package TASK3_Polymorphism.BangunDatar;

public class Segitiga {
    double a, b, c, tinggi;

    public Segitiga(double a, double b, double c, double tinggi) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.tinggi = tinggi;
    }

    public double keliling() {
        return a + b + c;
    }

    public double luas() {
        return 0.5 * a * tinggi;
    }
}

