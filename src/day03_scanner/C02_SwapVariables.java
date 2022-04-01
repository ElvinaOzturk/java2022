package day03_scanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        //  1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
        //  Orn  : sayi1=10 ve sayi2=20;
        // kod calistiktan sonra
        //       sayi1=20 ve sayi2=10
        int sayı1=10;
        int sayı2=20;
        System.out.println("Swap'dan once sayı1: " + sayı1 + "sayı2 : +sayı2" );
        int temp=sayı1;
        sayı1=sayı2;
        sayı2=temp;

        // 1.adim bos bir variable olusturup
        //   sayi1'i ona atayalim
        // 2.adim sayi1'e yeni degerini atayalim
        // 3. adim sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim


        System.out.println("Swap'dan sonra sayı1: " + sayı1 + "sayı2 : +sayı2" );
    }
}
