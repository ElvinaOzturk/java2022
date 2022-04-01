package day03_scanner;

public class C01_variable {
    public static void main(String[] args) {
        //1-Farklı 3 data turunde variable olusturn ve bunları yazdırın
        String okulIsmi="Yıldız Kolejı";
        System.out.println(okulIsmi);
        char ilkHarf;
        ilkHarf='H';
        System.out.println(ilkHarf);
        int sayı1=10, sayı2=20;
        System.out.println(sayı1+sayı2);
        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Mehmet
        //  soyisminiz : Bulutluoz
        //  seklinde yazdirin
        String isim="Elif";
         String soyIsim="Disiacik";
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz: "  + soyIsim );

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        short sayi3=20;
        double sayi4=30;
        System.out.println("iki sayinin toplami : "+ (sayi3 + sayi4)); // 50.0
        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        //5 – char data turunde bir variable olusturun ve yazdirin
        char ozelKarakter='#';
        System.out.println(ozelKarakter); // #
        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf); // 117
        // char data turundeki degiskenler matematetiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi isleme alinir
        int sayi6='a';
        System.out.println(sayi6); // 97




    }
}
