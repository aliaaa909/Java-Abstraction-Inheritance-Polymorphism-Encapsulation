package Task2_Overloading_Overreading;

public class Matematika {
    // overoading
    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    // Overloadinn
    public double pengurangan(double a, double b) {
        return a - b;
    }

    public double pengurangan(double a, double b, double c) {
        return a - b - c;
    }
}


