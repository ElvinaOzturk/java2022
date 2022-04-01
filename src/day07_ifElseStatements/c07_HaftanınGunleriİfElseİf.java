package day07_ifElseStatements;

import java.util.Scanner;

public class c07_HaftanınGunleriİfElseİf {
    public static void main(String[] args) {
        // //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanıcı gun ismini yalnıs girerse "Yalnıs giris" yazdırın
        // Ornek:  gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi ve ya salı ve ya carsamba ve ya persembe ve ya cuma ise ===> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazınız");
        String gunIsmi= scan.next().toLowerCase();

        //hatalı girişleride yazdırmak icin olasılıkları 3 e cıkardım
        //hafta sonu-hafta ici-yalnıs giris

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gün hafta sonu");

        }else if (gunIsmi.equals("pazartesi")  ||  gunIsmi.equals("salı")  ||
                gunIsmi.equals("carsamba") || gunIsmi.equals("persembe")  ||
                gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun hafta ici");

        }else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
        //eger if else if ..... sattemen else ile bitiyorsa
        // olasılıklardan sadece bir tanesi mutlaka calısır



            }
    }

