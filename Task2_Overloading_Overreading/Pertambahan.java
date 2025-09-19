package Task2_Overloading_Overreading;

public class Pertambahan {
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih("2410631170006", "Alia Hamzah");

        mc.info();
        System.out.println();

        System.out.println("Pertambahan 3 variabel:");
        System.out.println("==> 12.5 + 28.7 + 14.2 = " + mc.pertambahan(12.5, 28.7, 14.2));

        System.out.println("Pertambahan 2 variabel:");
        System.out.println("==> 23 + 34.5 = " + mc.pertambahan(23, 34.5));

        System.out.println("\nPengurangan 3 variabel: ");
        System.out.println("==> 50 + 12.5 = " + mc.pengurangan(50, 12.5));

        System.out.println("\nPerkalian:");
        System.out.println("==> 12.6 * 28 = " + mc.perkalian(12.6, 28));

        System.out.println("\nPembagian:");
        System.out.println("==> 100, 25 = " + mc.pembagian(100, 25));

        System.out.println("\nModulus:");
        System.out.println("==> 9 % 4 = " + mc.modulus(9, 4));
    }
}
