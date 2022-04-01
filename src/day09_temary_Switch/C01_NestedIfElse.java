package day09_temary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir tam sayı giriniz :");

        int sayı=scan.nextInt();

        if (sayı<1000 || sayı>9999){  //istenmeyen bir durumu yazıyoruz
            System.out.println("Lutfen 4 basamaklı sayı giriniz :");
        }else if (sayı%5==0){// 4 basamaklı ve sayı 5'e tam bolunuyor
            if (sayı%10==0){  // 4 basamaklı, 5 ile bolunebilen ve son rakamı 0 olan
                System.out.println("5'e bolunen cift sayı");
                }else{  //// 4 basamaklı, 5 ile bolunebilen ve son rakamı 0 olmayan
                System.out.println("5'bolunen tek sayı");
            }

        }else {   // 4 basamaklı ve 5'bolunemiyor
            System.out.println("Tekrar deneyin");
        }
    }
}
