package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {
        //kullanıcıdan istedigi kadar sayi girmesini isteyin
        //kullanıcının girdigi sayiların toplamı 500'u gecerse
        //artık yeter cok sayı girdin,toplam ....oldu yazsın

        Scanner scan = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;

        while (toplam<500){
            System.out.println("Lutfen bir sayi giriniz");
            sayi= scan.nextInt();
            toplam += sayi;
        }
        System.out.println("artık yeter cok sayı girdin, toplam : " +toplam+ " oldu");

    }
}
