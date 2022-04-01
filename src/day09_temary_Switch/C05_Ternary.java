package day09_temary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
          //Bazen ternary'deki iki sonucun data turleri farklı olabilir

        //verilen sayı 100'den buyukse sayının karesini alıp yazdıran
        //100'den kucukse sayı 100'den buyuk olmalı yazdıran bir ternary olusturalım

        int sayı =150;

        //ternary bize sonuc getirdiginden ya sonucu direk yazdırmalıyız
        // veya bir degiskene atamalıyız
        // Eger sonuclar farklı data turlerinde ise
        // atama yapacagımız variablelerin data turu tek olacagından
        // atama yapmayız
        // SADECE direk yazdırırız

        System.out.println(sayı>100 ? sayı*sayı : "sayı 100'den buyuk olmalı");
    }
}
