package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //kullanıcıdan isim- soyisim bilgisini alıp butun harfleri * yapalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi girin");
        String isimsSoyisim = scan.nextLine();

        System.out.println(isimsSoyisim.replaceAll("\\S", "*"));
    }
}
