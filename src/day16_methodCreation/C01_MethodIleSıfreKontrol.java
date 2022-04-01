package day16_methodCreation;

import java.util.Scanner;

public class C01_MethodIleSıfreKontrol {
    public static void main(String[] args) {

        //Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmal
        // bu 4 kontrolu method ile yapın

        String sifre = "Asdf163y";

        boolean ilkHarfKontrol = ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol = sonHarfKontrolEt(sifre);
        boolean boslukKontrol = boslukKontrolEt(sifre);
        boolean uzunlukKontrol = uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukKontrol && uzunlukKontrol){
            System.out.println("Sifre basarı ile tanımlandı");
        }else{
            System.out.println("İslem basarısız, Lutfen yeni bir sifre giriniz");
        }

    }

    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc = false;

        if (sifre.length() >= 8){
            uzunlukKontrolSonuc = true;
        }else{
            System.out.println("Sifre uzunlugu en az 8 karakter olmalı");
           // uzunlukKontrolSonuc = false;
        }

        return  uzunlukKontrolSonuc;
    }

    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc = false;

        if (!sifre.contains(" ")){
            boslukKontrolSonuc = true;
        }else{
            System.out.println("Sifre bosluk icermemeli");
           // boslukKontrolSonuc = false;
        }

        return  boslukKontrolSonuc;
    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf = sifre.charAt(sifre.length()-1);

        if (sonHarf >= 'a'  &&  sonHarf <= 'z'){
            sonHarfSonuc = true;
        }else{
            System.out.println("Sifrenizin son harfi kucuk harf olmalı");
           // sonHarfSonuc = false;

        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolEt(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc = false;

        if (ilkHarf >= 'A'  &&  ilkHarf <= 'Z'){
            ilkHarfSonuc = true;
        }else{
            System.out.println("Sifreniz ilk harfi Buyuk harf olmalı");
           // ilkHarfSonuc = false;

        }
        return  ilkHarfSonuc;
    }

}
