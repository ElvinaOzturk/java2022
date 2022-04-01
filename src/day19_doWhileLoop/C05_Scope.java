package day19_doWhileLoop;

public class C05_Scope {
    //1- Bir method icerisinde olusturulan veriable'lar sadece olusturuldukları method'da kullanılabilir,
    //baska method'larda kullanılamaz
    //2- Tum method'ların kullanılabilmesini istedigimiz veriable'ları
    //Class level'da olustururuz
    //Class level'da olusturdugumuz veriable'i
    //-- static yaparsak tum methodlar kullanılabilir
    //-- static olmazsa



    public static void main(String[] args) {

        int sayi = 10;
        // isim = "Vali Yan";

    }
    public static void method1(){
        String isim = "Ali Can";
        // sayi = 20;
    }
    public void method2(){
        //sayi = 30;
        //isim = "Ayse San";

    }
}
