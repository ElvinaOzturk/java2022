package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        //Biz String metodlarını arka arkaya da kullanbiliriz
        // mesela ikinci kelimenin ilk harfini kucuk yazdıralım

        //str.charAt(5); boyle yazdıgımızda sonuc artık String degil char olacaktır
        //dolayısıyla String'de yapmak istedigimiz tum degısıklikleri
        //once yapıp sonra charAt() metodunu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));
    }
}
