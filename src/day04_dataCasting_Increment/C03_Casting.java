package day04_dataCasting_Increment;

public class C03_Casting {
    public static void main(String[] args) {
        int sayı1=8;
        int sayı2=4;

        System.out.println(sayı1/sayı2);

        sayı2=3;

        System.out.println(sayı1/sayı2);

        sayı1=22;

        System.out.println(sayı1/sayı2);
        // java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        // eger virgulden sonra kusurat varsa siler

        sayı1=4786;
        sayı2=10;

        sayı1=sayı1/sayı2;

        System.out.println(sayı1);// 478

        sayı1=sayı1/sayı2;

        System.out.println(sayı1); //47

        sayı1= sayı1/sayı2;

        System.out.println(sayı1); // 4

        sayı1= sayı1/sayı2; // 0.4

        System.out.println(sayı1); // 0

        sayı1=4895;
        double sayi3=10;

        // sayi1=sayi1/sayi3; // iki farkli sayi data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autoWidening yapar
        // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder

        System.out.println(sayı1/sayi3); // 489.5
        System.out.println(sayi3/sayı1); // 0.0020429009193054137





    }
}
