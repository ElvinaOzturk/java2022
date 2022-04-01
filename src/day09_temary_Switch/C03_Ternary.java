package day09_temary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayı=140;
        //verilen syının 3 veya daha cok basamaklı olup olmadıgını kontrol eden
        // ve sonucu yazdıran bir ternary olusturun

        String sonuc=sayı>=100  ?  "Sayı3 basamaklı veya daha buyuk" : "sayı negativ veya 3 basamaktan kucuk";

        //Ternary bize sonuc dondurdugu icin ya bu sonucu direk yazdırmalıyız
        //yada sonucun data turune uygun bir variable'a atama yapabiliriz

        System.out.println("girdiginiz sayı analizi :" + sonuc);
    }
}
