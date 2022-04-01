package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //kullanıcıdan bir kelime isteyin eyer kelime 3 harfden kısa ise kelime "kelime cok kısa" yazdırın
        //eyer kelime 3,4 veya 5 harifli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        //eyer 5 harften uzunsa "kelime cok uzun" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayısı = kelime.length();

        if (harfSayısı < 3) {
            System.out.println("kelime cok kısa");
        } else if (harfSayısı == 3) {
           ucHarfiTersineCevir(kelime);
        } else if (harfSayısı == 4) {
            dortHarfiTersineCevir(kelime);
        } else if (harfSayısı == 5) {
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("Kelime cok uzun");
        }

    }

    private static void besHarfiTersineCevir(String kelime) {

    }

    private static void dortHarfiTersineCevir(String kelime) {
    }

    private static void ucHarfiTersineCevir(String kelime) {
    }
    //1- metod olusturmak icin methodun adını yazarız
    //2-methoda giderken goturmem gereken variable varsa, bunu


}