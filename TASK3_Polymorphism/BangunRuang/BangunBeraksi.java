package TASK3_Polymorphism.BangunRuang;
import TASK3_Polymorphism.BangunDatar.*;
import TASK3_Polymorphism.BangunRuang.*;

public class BangunBeraksi {

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5, 3);
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());

        Kubus kubus = new Kubus(4);
        System.out.println("\nVolume Kubus: " + kubus.volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());

        Tabung tabung = new Tabung(7, 10);
        System.out.println("\nVolume Tabung: " + tabung.volume());
        System.out.println("Luas Permukaan Tabung: " + tabung.luasPermukaan());

        Balok balok = new Balok(5, 3, 7);
        System.out.println("\nVolume Balok: " + balok.volume());
        System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());

        Prisma prisma = new Prisma(3, 4, 5, 4, 10);
        System.out.println("\nVolume Prisma: " + prisma.volume());
        System.out.println("Luas Permukaan Prisma: " + prisma.luasPermukaan());
    }
}

