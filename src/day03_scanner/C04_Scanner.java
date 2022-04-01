package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Scanner kullanmak ıcın 3 adım takıp edıyoruz
        //1.adım kendimize bir scanner olusturmak

        Scanner scan = new Scanner(System.in);

        // Sadece ilk kelimeyi alır(ilk space'e kadar olan bolumu alır
        // esitlıgin sagında bır scanner olusturulur ve olusturulan bu scanner scan variable'na assign edilir
        //scan variablenin ismidir istedigimiz ismi verebiliriz

        //2.adım : Kullanıcıdan ıstedıgımız degerı gırmesı ıcın acıklayıcı bır bılgı yazdırınız

        System.out.println("Lutfen isminizi giriniz");

        //3. adım kullanıcının gırdıgı degerı uygun bır varıable olusturup kaydedın

        String kullanıcıIsmi= scan.nextLine(); // sadece next olursa ilk kelimeyi alır
                                               // (ilk space'e kadar olan bolumu alır)
                                               //nextLine ise satır sonuna kadar girilen tum degerleri alır

        System.out.println("Kullanıcının gırdıgı ısım: " + kullanıcıIsmi);
    }
}
