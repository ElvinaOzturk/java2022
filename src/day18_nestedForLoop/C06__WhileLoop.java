package day18_nestedForLoop;

public class C06__WhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan iki tam sayı alıp bu sayıları aralarındaki tum tamsayıları yazdıran bir kod olusturun

        int baslangic = 40;
        int bitis = 60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        // aynı soruyu While Loop'la yapalım

        int i = baslangic;
        while (baslangic<=bitis){
            baslangic++;

            System.out.print(baslangic + " ");
        }
        System.out.println("");





    }

}
