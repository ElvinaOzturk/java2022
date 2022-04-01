package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5));
        //yukardaki String'i Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java", "Mehmet hoca"));

        System.out.println("Mehmet hoca " + str.substring(5));

        System.out.println(str.substring(9));  //yazılan index inclusive

        //Eger bir index'den sona kadar olan parcayı degil
        //belirli bir parcayı almak istersek
        //2 parametre yazmak gerekir str.substring(baslangıcIndexi, bitmisIndexi)
        // baslangıc indexi ==> inclusive/dahil
        //bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5)); //Java

        System.out.println(str.substring(0,1));  //J

        String harf = str.substring(5,6); // bana 6. karakteri String olarak bulun
        System.out.println(harf);

        str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));// hiçlik dondurur

      //  System.out.println(str.substring(5,2)); //bıtıs index'i baslangıc  idexsinden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); //son harfi verir
        System.out.println(str.substring(str.length()-5));  //son 5 harfi yazdıralım
        System.out.println(str.substring(str.length()));  //son harften sonraki kısmı yani hiclik
    }
}
