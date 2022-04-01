package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayı giriniz");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,

        if (sayı1>0 &&  sayı2>0){
            System.out.println("girdiginiz iki sayı da pozitiv oldugunda toplamları=" + (sayı1+sayı2));
        }
        else if (sayı1<0  &&  sayı2<0){
            //sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
            System.out.println("girdiginiz iki sayı da negativ oldugundan carpımları=" + (sayı1*sayı2));
        }
        else if (sayı1*sayı2<0){
            //sayilarin ikisi farkli isaretlere sahipse
            //"farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
            System.out.println("farklı ısaretlerde sayılarla islem yapamazsın");
        }
        else{
            System.out.println("sıfır carpmaya gore yutan elemandır");
        }

    }
}
