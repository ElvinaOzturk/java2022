package day09_temary_Switch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // ternary ile yapılan tum islemler if else lede yapılabilir
        //if else yerine ternary tercih etme sesebi yapının basit ve anlasılabilir olmasıdır
        //ternary icerisinde kompleks kodlar olmaz
        //sadce sonuc veya bizi sonuca goturen basit islemler olabilir

        //kullanıcıdan bir tamsayı alıp tekmi ciftmi yazdıran bir kod yazalım

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitiv bir tamsayı giriniz");

        int sayı = scan.nextInt();

        if (sayı%2==0){
            System.out.println("sayı cift");
        } else{
            System.out.println("sayı tek");
        }

        System.out.println(sayı%2==0 ? "sayı cıft" : "sayı tek");
    }
}
