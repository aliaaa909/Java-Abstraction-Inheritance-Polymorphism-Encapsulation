package Task2_Inheritance;

class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mtk = new MatematikaCanggihBanget();

        System.out.println("Pertambahan     : " + mtk.pertambahan(20, 10));
        System.out.println("Perkalian       : " + mtk.perkalian(20, 10));
        System.out.println("Modulus         : " + mtk.modulus(20, 3));
        System.out.println("Pertambahan Tiga: " + mtk.pertambahanTiga(5, 10, 15));
    }
}