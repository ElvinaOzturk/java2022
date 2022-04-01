package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

         //kullanıcıdan ismini alıp basharfini ve son harfini Buyuk harflerla yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi girin");
        String isim = scan.nextLine();

        System.out.println("ilk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String  str1 ="";
        System.out.println(str1.length()); //0

        String str2 = null;
        System.out.println(str2); //hata verir

        String str3;
        // System.out.println(str3);
        //satr3 ile str2' ye deger atanmamıstır
        //str2 null pointer ile isaretlendiginden java durumun kontrol altında oldugunu bilir
        //ve geriye kalan kodun calısmasına engel olmaz
        //ancak str3'e bir deger ataması olmayınca java altını kırmızı cizer
        //ve bu durum duzeltilinceye kadar kodun geriye kalanının calısmasınada izin vermez
    }
}
