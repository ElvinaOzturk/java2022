package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayı {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin ve
        // sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayı giriniz");

        int sayı=scan.nextInt();

        if (sayı%2 ==0) {
            System.out.println("girilen sayı cift sayıdır");
        }
        if (sayı%2 != 0){
            System.out.println("Girilen sayi tek sayıdır");
        }

            //normalde bir tamsayı ya tektir veya cifttir, ucuncu bir durum yoktur
            //o zaman tek olması ve cift olmasını iki ayrı if ile degil
            //if else ile tek statement'da yapmak daha guzel olur
            //======== if else ile cozum

            if (sayı%2==0){
                System.out.println("girdiginiz sayı cift sayıdır");
                }
            else {
                System.out.println("girdiginiz sayı tek sayıdır");
            }
        }
    }

