public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Davut Çağrı", "Akbıyık");

        System.out.println("Numara: "+ ogrenci1.getNo());
        System.out.println("İsim: "+ ogrenci1.getIsim());
        System.out.println("Soyisim: "+ ogrenci1.getSoyisim());

        //Öğrencinin notlarının set edilmesi.
        //ogrenci1.setNot(95);
        //ogrenci1.setNot(91, 100);
        ogrenci1.setNot(85, 78, 99);

        System.out.println("Not 1: " + ogrenci1.getNot1());
        System.out.println("Not 2: " + ogrenci1.getNot2());
        System.out.println("Not 3: " + ogrenci1.getNot3());
    }
}