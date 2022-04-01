package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //kullanıcıdan bir kelime isteyin eyer kelime 3 harfden kısa ise kelime "kelime cok kısa" yazdırın
        //eyer kelime 3,4 veya 5 harifli ise harf sayısını ve kelimenin tersten yazılısını yazdırın
        //eyer 5 harften uzunsa "kelime cok uzun" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        String  tersKelime = "";

        if (kelime.length()<3){
            System.out.println("kelime cok kısa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
              tersKelime = kelime.substring(2)+
                           kelime.substring(1,2)+
                           kelime.substring(0,1);
            }else if (kelime.length()==4){
                tersKelime = kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }else{tersKelime = kelime.substring(4)+
                               kelime.substring(3,4)+
                               kelime.substring(2,3)+
                               kelime.substring(1,2)+
                               kelime.substring(0,1);

            }
            System.out.println("girdiginiz kelimedeki harf sayısı : " + kelime.length());
            System.out.println("kelimenin tersten yazılısı : " + tersKelime);

        }else{
            System.out.println("kelime cok uzun");
        }
    }
}
