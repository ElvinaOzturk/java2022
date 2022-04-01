package day16_methodCreation;

public class C02_OverLoading {
    public static void main(String[] args) {

        String str = "Bu da gecer ya Huu";
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a",5));
        System.out.println(str.indexOf('a',5));

        //bir class'da aynı isimde birden fazla method olmasına overloading denilir
        //ya parametre sayısı farklı olmalı
        //veya parametre sayısı aynı ise argumentlerin data turleri farklı olmalı
    }
}
