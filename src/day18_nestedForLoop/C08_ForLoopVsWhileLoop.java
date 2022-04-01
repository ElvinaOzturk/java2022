package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan toplamak istedigi sayilari alın
        //ve kullanıcı 0'a basıncaya kadardevam edin
        //kullanıcı 0'a bastıgında
        //girdigi tum sayıların toplamını yazdırın

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        /*
        for (int i = 1; i <100000 ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();

            if (sayi==0){
                break;
            }else{
                toplam+=sayi;
            }

        }
        System.out.println(toplam);
        */

        sayi =1;
        toplam=0;

        while (sayi!=0){
            System.out.println("Lutfen bir sayı giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
        }
        System.out.println(toplam);

        //baslangic,bitis ve degisim degerleri net olan durumlarda for loop daha avantajlıdır
        //ama adım sayısı belli olmayan durumlarda while loop daha avantajlıdır
    }
}
