package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yazınız" +
                "\nKadın icin K \nErkek ıcın E harfini giriniz");
        char cinsiyet =scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasınızı giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            }
            else if (yas<60){
                System.out.println("emekli olamzsın \nDaha" + (60-yas) + "yıl calısman gerekir");
            }
            else{
                System.out.println("emekli olabilirsin");
            }
        }
        else if (cinsiyet=='E'){
            if (yas<0 || yas>120){
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            }
            else if (yas<65){
                System.out.println("emekli olamzsın \nDaha" + (65-yas) + "yıl calısman gerekir");
            }
            else{
                System.out.println("emekli olabilirsin");
            }
        }
        else{
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }
        }
    }

