package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {
        // primitiv data turu ile non primitive arasındaki farklar nelerdir?

        String str= "Java";
        int sayı=10;

        System.out.println(str.toUpperCase());
        System.out.println(str);

        //non-primitiv data turleri data depolamak yanında bir cok faydalı motoda sahiptir
        //ancak primitiv data turlerinin boyle bir ozellikleri yoktur
        //primitive data turleri sadece degerleri saklarlar(container)

        //primitive data turleri icin de bazı metodlar gerekli oldugunda
        //java aa bir cozum uretmistır
        //Java her bir primitive data turunu, non-primitive olarak kullanabilmek ıcın
        //ozel Class'lar olusturmus ve bunlara Wrapper Class adını vermıstır

        double sayı2=20.5;

        //sayı2 primitive oldugundan say2 dedigimizde hıc bir metod gelmez

        Double sayı3=15.2;
        //sayı3 wrapper Class'ını kullandıgından
        //sayı3 dedigimizde bir cok metod gelir
    }
}
