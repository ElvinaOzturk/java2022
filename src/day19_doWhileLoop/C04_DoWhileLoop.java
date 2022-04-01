package day19_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
        // “Negatif sayi giremezsiniz” yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        // yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int sayi = 1000;
        int toplam = 0;
        int sayacPozitiv = 0;
        int sayacNegativ = 0;

        do {
            System.out.println("Lutfen pozitiv bir tam sayi girin \nbitirmek icin 0'a basın ");
            sayi =scan.nextInt();

            if (sayi<0 ){
                System.out.println("Negativ sayı giremezsiniz");
                sayacNegativ++;

            }else if (sayi>0){
                toplam += sayi;
                sayacPozitiv++;

            }
        }while (sayi != 0);
        System.out.println("yalnıslıkla girilen negativ sayı adedi : " + sayacNegativ );
        System.out.println("girilen pozitiv tam sayı : " + sayacPozitiv );
        System.out.println("girilen pozitiv sayıların toplamı : " + toplam );

    }
}
