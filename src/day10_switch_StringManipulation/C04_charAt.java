package day10_switch_StringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {
         //String'de her hangi bir karakteri almak istedigimizde o harfin indeksini kullanarak
        //str.charAt(istenenIndex) yazdırabiliriz

        String str="Java Cok Guzel";

        //J yi yazdıralım

        System.out.println(str.charAt(0));

        //G'yi yazdıralım
        System.out.println(str.charAt(9));

        // va yazdıralım
        System.out.println(""+str.charAt(2) + str.charAt(3));

        //cOK seklinde yazdıralım

        System.out.println(str.toLowerCase().charAt(5) + ""+str.toUpperCase().charAt(6)+
                str.toUpperCase().charAt(7));

        //son karakteri yazdır
        //Stringde 14 harf var, son harfin index i 14-1
        System.out.println(str.charAt(14-1)); //uzunluk -1

        //eger uzunlugu index olarak girersek
        //java calıstıktan sonra hata verir

        System.out.println(str.charAt(14));//hata verir


    }
}
