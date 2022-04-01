package day09_temary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        // OCA ve ISTQB
        //verilen sayının pozitivmi negativmi oldugunu kontrol edib
        //0 veya pozitiv sayı ise tek ve ya cift
        //negativ sayı ise -100-den buyuk veyakucuk
        //oldugunu belirleyen bir ternary yazınız

        int sayı=121;

        if (sayı>=0){
            if (sayı%2==0){
                System.out.println("sayı pozitiv cift sayı");
            }else{
                System.out.println("Sayı pozitiv tek sayı");
            }
        }else{
            if (sayı<=-100){
                System.out.println("Sayı -100'den kucuk negativ sayı");
            }else{
                System.out.println("Sayı -100'den buyuk negativ sayı");
            }

        }
        String sonuc= sayı>=0 ?
                      (sayı%2==0 ?"pozitif cift sayı" : "pozitif tek sayı") :
                      (sayı<-100 ? "-100 den kucuk negatif sayı" : "-100 den buyuk negativ sayı");

        System.out.println(sonuc);


    }
}
