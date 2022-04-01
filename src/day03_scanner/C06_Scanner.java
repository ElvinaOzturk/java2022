package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // soru6 Kullanıcıdan ismini ve soyismini alıp aralarında bır
        // bosluk olusturarak asagıdakı sekılde yazınız
        //İsim-soyisim:Mehmet Bulutuoz

        Scanner sacn= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= sacn.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= sacn.nextLine();

        System.out.println("Isim - soysisim : " + isim + " " + soyisim );
    }
}
