package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //array'i nasıl declare ederiz
        //data turu, array'ın ismi ve koseliparantez yazarak array declare edilir

        int arr1[] = {1, 3, 5};
        int arr2[] = {2, 3, 5};
        int arr3[] = {1, 4, 5};

        double arr[] = {10.2,20.1,5};

        String arr5 []= {"Ali", "Veli", "Ayse"};

        //assign mecburi midir?

        int sayi;

        int arr6[];

        //kullanmadan once mutlaka deger ataması yapmamız gerekir

        //hem declare edip hemde atama yapacaksam nasıl yapabilirim?
        //1- declare edip esitligin sagına suslu parantez icerisinde degerleri yazdırabilirim
        String arr7 []= {"Ali", "Veli", "Ayse"};
        //2- icine deger atamadan olusturmak isterseniz, boyutunu belirlememiz gerekir

        int arr8[] = new int[5]; //Java icine 5 tane default deger olan bir array olusturur
                                 // [0,0,0,0,0]

    }
}
