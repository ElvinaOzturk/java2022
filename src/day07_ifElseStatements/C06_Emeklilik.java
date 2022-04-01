package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
         //kullanıcıdan yasını isteyin 65 ise veya
        // daha buyukse emekli olabilirsin 65 den kucuksa emekli olamazsın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }
        else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas + "sene daha calısmalısın");
        }

        //if else satement'larda iki durumdan sadece ve sadece biri calısır
        //ikisinin birden calısma ihtimali ====> YOK
        //ikisinin de calısmama ihtimali ====>YOK
    }
}
