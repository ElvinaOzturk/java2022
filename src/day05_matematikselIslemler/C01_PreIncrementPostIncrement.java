package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayı=10;
        //bu sayıyı bir artırmak istersek

        sayı++;
        System.out.println(sayı);//11

        sayı++;
        System.out.println("pre-incrementten once" + sayı);//12

        //eger 11. ve 12. satırda yapdıgım 2 islemi  tek satırda yaparsam
        //java iki islemden once hangisini yapacagını bilmek ister
        //once artırır sonra yazdırırsak java yeni degeri yazdırır
        //ama once yazdırır sonra artırırsak, bu durumda eski deger yazdırılır

        System.out.println("pre-increment satırında"  +  ++sayı);// 13 once artır sonra yazdır
        System.out.println("pre-incrementden sonra" +sayı); //13

        System.out.println("post-increment satırında" + sayı++ );//13 once yazdır sonra yazdır
        System.out.println("post-increment satırından sonra" +sayı);//14

    }
}
