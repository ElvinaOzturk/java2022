package day05_matematikselIslemler;

public class C05_WrapperClass {
    public static void main(String[] args) {
         short sayı1=20;
         Short sayı2=30;

          sayı1=sayı2; // wrapper class ile aynı ısımdeki primitive data turu arasında gecis olabilir

        System.out.println(sayı1);//30
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.BYTES);// 2 Byte=16 bit
    }
}
