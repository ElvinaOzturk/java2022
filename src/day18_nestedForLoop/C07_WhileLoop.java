package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan kac sayı toplamak istedigini alın
        //bu sayilari alin ve bu sayiların toplamini ekrana yazdırın

        int sayiAdedi = 5;

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplama = 0;

        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("Lutfen bir sayı giriniz");
            sayi = scan.nextInt();
            toplama += sayi;
        }
        System.out.println("girilen " + sayiAdedi + "sayının toplamı : " +toplama);
        //while loop ile yapalım

        sayi = 0;
       toplama = 0;
       int sayac = 1;

       while (sayac<=sayiAdedi){
           System.out.println("Lutfen bir sayı giriniz");
           sayi = scan.nextInt();
           toplama += sayi;
           sayac++;
       }
        System.out.println("girilen " + sayiAdedi + "sayının toplamı : " +toplama);


    }
}
