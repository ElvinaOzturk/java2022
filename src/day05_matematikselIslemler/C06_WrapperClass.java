package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1 ="12345";
        String str2 ="23456";

         //verilen iki string'deki sayıları toplayın

        System.out.println(str1 + str2); //1234523456

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //35801

        //Integer.valueOf(str1) metodu sadece sayısal deger iceren String'lerde kullanılabilir
        //bir tane bile sayı dısında karakter olursa Java hata verir
    }
}
