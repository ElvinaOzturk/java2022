package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        // kullanıcıdan aldıgınız 4 basamaklı bir sayının basamaklardakı rakamlar toplamını bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bir tam sayı giriniz");

        int sayı=scan.nextInt();

        int rakam=0;
        int rakamlarToplamı=0;
        // 1.adım r=0 rt=0 sayı7532

        rakam=sayı%10;  //2
        rakamlarToplamı +=rakam; //2
        sayı/=10; //753

        //2.adım r=2 rt=2 sayı753

        rakam=sayı%10; //3
        rakamlarToplamı +=rakam; //5
        sayı/=10;  //75

        //3.adım r=3 rt=5 sayı75

        rakam=sayı%10;  //5
        rakamlarToplamı += rakam;  //10
        sayı/=10; //7

        //4. adım r=5 rt=10 sayı7

        rakam=sayı%10; //7
        rakamlarToplamı += rakam; //17
        sayı/=10; // 7/10=> 0.7    0
        System.out.println("girdiginiz sayının rakamlar toplamı giriniz : " + rakamlarToplamı); //17

    }
}
