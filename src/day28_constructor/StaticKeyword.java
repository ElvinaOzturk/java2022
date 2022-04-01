package day28_constructor;

public class StaticKeyword {
    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        /*Static veriable'ler direk class!a baglidir class icerisinde yapilan her turlu degisiklik
         Stativ veriablelerde kalici olur

        Instance veriable'ler ise obje'ye baglidir
        instance veriable'lara sadece obje uzerinden erisilebilir
        ve bir obje uzerinden erisilerek yapilan degisiklik
        instance veriable'in degerini tum objeler icin kalici olarak degistirilmez
        sadece o obje icin instance veriable degerini kalici olarak degisitirir
        */


        System.out.println("sayi1 : " + sayi1);//0
       // System.out.println("sayi1 : " + sayi2); static olmadigi icin main method'dan direk kullanilmaz

        StaticKeyword obj1 = new StaticKeyword();
        System.out.println(obj1.sayi2);//0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : " + sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//1

        StaticKeyword obj2 = new StaticKeyword();

        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;


        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2


        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//2

        obj1.sayi1++;
        obj1.sayi2++;


        System.out.println(obj1.sayi2);//2
        System.out.println(obj1.sayi1);//3

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//3






    }
}
