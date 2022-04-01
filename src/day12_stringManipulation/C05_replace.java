package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str = "Bugun ne cok sey ogrendik";

        //bu cumdeledeki bosluk dısındaki karakter sayısını bulunuz
        System.out.println("sapace haric karakter sayısı :" + str.replace(" ", ""));

        //atama yapılmadıgı surece orjinal String kalıcı olarak degısmez
        // sadece o satır icin degısiklik yapılır sonuc yazdırılmıs olur

        System.out.println("orjinal str karakter sayısı : " +str.length() );

        //str da kalıcı degısıklık yapalım
        //bunu yerine yarın ogrendik yerine ogrenecegiz

        str=str.replace("Bugun", "Yarın");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalıcı degısiklikten sonra : " + str);

        str.replace("ne cok", "ne az");//atama yoksa kalıcı degısıklıkde yokdur

        System.out.println(str);


    }
}
