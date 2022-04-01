package day15_methodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //iki variable'ın degerlerini toplayan bir method olusturalım
        //1.adım : method adını yazalım
        //2.adım : methoda gondermem gereken argument var mı?
        ikiSayıTopla(25,50);

        C04.dortHarfiTersineCevir("sema");

    }
    //bir methodu olusturmak calısması icin yeterli degildir
    //method ancak cagrılırsa calısır
    //aynı class veya farklı class'da olmasının hic bir onemi yoktur
    //Java main method'da yukarıdan asagıya dogru calısır
    //ve geldigi satırı calıstırır

    private static void ikiSayıTopla(int a, int b) {
        System.out.println("verilen iki sayının toplamı : " +(a+b));
    }
}
