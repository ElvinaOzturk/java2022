package day06_concatenation_Operators;

public class C02_MantıkOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);  //false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc1);//ture

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;

        System.out.println(sonuc2); //false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;

        System.out.println(sonuc3); //false

        //&& ile & arasındaki fark & tum satıra bakar && bır tane false bulursa orda durur

        int sayı3=15;

        //sayı3'un 10 ile 20 arasında oldugunu true diyerek dondurelim
        //java uclu karsılastırma kabul etmez
        //ikili karsılastırmalar yapıp mantıksal operatorlerle bırlestırmelıyiz

        System.out.println(10<sayı3 && sayı3<20); //true

        int sayı4=5;
        //sayı4 un 10 ile 20nin arasında olmadıgını true diyerek dondurelim

        System.out.println(sayı4<10 || sayı4>20 ); //true



    }
}
