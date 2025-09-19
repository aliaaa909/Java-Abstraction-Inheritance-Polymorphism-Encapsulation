package TASK3_Polymorphism.BangunRuang;
import TASK3_Polymorphism.BangunDatar.Segitiga;

public class Prisma extends Segitiga {
double tinggiPrisma;

    public Prisma(double a, double b, double c, double tinggiSegitiga, double tinggiPrisma) {
        super(a, b, c, tinggiSegitiga);
        this.tinggiPrisma = tinggiPrisma;
    }

    public double volume() {
        return luas() * tinggiPrisma;
    }

    public double luasPermukaan() {
        return 2 * luas() + keliling() * tinggiPrisma;
    }
}
