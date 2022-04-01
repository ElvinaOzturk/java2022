package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1= "Java bir baska guzel valla cok guzel";

        //istersek char olarak verdigimiz bir harfin indexini bize dondurur

        System.out.println( str1.indexOf('J')); //0
        // İstersek bir harf yada metin olarak verdigimiz Stringin indexini dondurur

        System.out.println( str1.indexOf('l')); //19
        System.out.println(str1.length()-1);    //35
        System.out.println(str1.indexOf("aska"));  //10

        //aynı harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); //5 buldugu ilk dogru eslesmenin indexini dondurur

        System.out.println(str1.indexOf('b' , 5)); //5
        //bu metoda2da java aramaya fromIndex olarak yazdıgımız index2den baslar (inclusive)

        //verilen String2deki 2.a harfinin index'ini bulalım
        int ilkindex = str1.indexOf('a'); //1
        System.out.println(str1.indexOf('a', ilkindex+1)); //3


        //verilen String2deki 2.b harfinin index'ini bulalım
        int ilkbindex = str1.indexOf("b"); //1
        System.out.println(str1.indexOf('b', ilkbindex+1)); //9

        //20. index'den sonra güzel aratalım
        System.out.println(str1.indexOf("guzel", 20)); //31

        //String'de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); //y yok demesi lazım ama return type'i index
        //yok demenin sayısal karsılıgı olarak java -1 dondurmeyi tercih eder

        //kullanıcıdan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdırın
        //iceriyorsa mailiniz kabul edildi yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazın");
        String mail = scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");

            //OZET : indexOf metodu icerisine yazılan string ve ya
            // char'ın metinde hangi index'de oldugu bize dondurur
            //eger aradıgımız metin veya char yoksa, olmadıgının delili olarak
            //bize -1 dondurur
        }




    }
}
