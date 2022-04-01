package day13_stringManipulation;

public class C02_substring {
    public static void main(String[] args) {

        //1-48 of 104 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayısı 100'den cok ise super
        //az ise "az sonuc bulundu"

        String str =" 1-48 of 104 results for \"nutella\"";

        int ilkSpaca = str.indexOf(" "); //4
        int ikinciSpace = str.indexOf(" ", ilkSpaca+1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace+1);

        String aramaSonucSayısıStr = str.substring(ikinciSpace+1,ucuncuSpace);

        //int aramaSonucSayısıInt = Integer.valueOf(aramaSonucSayısıStr);

        //if (aramaSonucSayısıInt>100){
            System.out.println("Super");
       // }else{
        //    System.out.println("az sonuc bulundu");
       // }

    }
}
