package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement {
    public static void main(String[] args) {

        int sayı1=10;
        int sayı2=20;
        int sayı3=30;

        sayı2= sayı1++;

        System.out.println(sayı1 +", " + sayı2 + ", " + sayı3); // 11,10,30

        sayı3 = ++sayı1;

        System.out.println(sayı1 + ", " + sayı2 + ", " + sayı3);//12,10,12

        System.out.println(sayı3++);//once yazdıracak sonra artıracak
                                    // once 12 yazdıracak sonra sayı3=13

        System.out.println(--sayı2); //once azalt sonra yazdır
                                     // once sayı2=9 sonra sayı2'nin son degeri yani 9 yazdırır





    }
    }

