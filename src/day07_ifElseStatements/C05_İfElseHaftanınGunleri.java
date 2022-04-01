package day07_ifElseStatements;

import java.util.Scanner;

public class C05_İfElseHaftanınGunleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi ve ya salı ve ya carsamba ve ya persembe ve ya cuma ise ===> hafta ici

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazınız");
        String gunİsmi=scan.next().toUpperCase();

        if (gunİsmi.equals("PAZAR") || gunİsmi.equals("CUMARTESİ")){
            System.out.println("girdiginiz gun haftasonu");
        }
        else {
            System.out.println("girdiginiz gun hafta ici");

        }
    }
}
