package Task2_Inheritance;

public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public int pembagian(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Error: Pembagi tidak boleh 0");
        }
    }
}
