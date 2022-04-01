package day04_dataCasting_Increment;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;

        System.out.println(sayi+ 10);
        //bu satırda sayıyı 10 artırmadım
        //sayının 10 fazlasını yazdırdım

        System.out.println(sayi);
        //eger atama yapmazsak sayıda yaptıgımız artırma veya azaltma kalıcı olmaz

        sayi=sayi+10;
        System.out.println(sayi);

        System.out.println(sayi=sayi+10);

        System.out.println(sayi);

        System.out.println(sayi+=10);

        System.out.println(sayi);

        //bır variablenin degerini kalıcı olarak artırmak ve ya azaltmak ıstersenız assignment sarttır

        System.out.println("27.satır:" + sayi++);

        System.out.println("29.satır:" + sayi);

        System.out.println("31.satır:" +  ++sayi);

        System.out.println("33.satır:" + sayi);

    }
}
