package Task2_Overloading_Overreading;

public class MatematikaCanggih extends Matematika {
    private String nim;
    private String nama;

    // konstrukdtor
    public MatematikaCanggih(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void info() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan 0!");
            return 0;
        }
    }

    public double modulus(double a, double b) {
        return a % b;
    }
}


