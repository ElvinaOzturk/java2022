package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan pozitiv bir tam sayı alıp
        // while loop ile sayidan kucuk pozitiv tam sayıları yazdıralım
        int input = 5;

        int sayi = 1;
        int sayac = 1;
        while (sayi<input){
            System.out.println(sayi);
            sayac++;
            sayi++;
        }
        System.out.println("sayac : " + sayac);

        //aynı soruyu do-while loop ile yapalım
        sayi = 1;

        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<input);


    }
}
