package day07_ifElseStatements;

import java.util.Scanner;

public class C04_HaftaIcıHaftaSonu {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi ve ya salı ve ya carsamba ve ya persembe ve ya cuma ise ===> hafta ici

        //String case sensitive'dir
        //yani pazar,PAZAR,Pazar PAzar bunlar hep farklı kelimelerdir

        //bu durumda String metodlarından yardım alırız

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazınız");

        String gunİsmi=scan.next().toLowerCase();//kullanıcı nasıl yazarsa yazsın biz kucuk harfe ceviriyoruz

        //String ifadelerde == kullanılması tavsiye edimez
        //cunki bekledigimizden farklı sonuc verebilir

        if (gunİsmi.equals("pazar") || gunİsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunİsmi.equals("pazartesi") || gunİsmi.equals("salı") || gunİsmi.equals("carsamba") || gunİsmi.equals("persembe") ||
        gunİsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
