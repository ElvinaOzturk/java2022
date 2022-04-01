package day08_ifElseStatements;

import java.util.Scanner;

public class C01_İfElseStatements {
    public static void main(String[] args) {
        //girilen bir karakterin harf olup olmadıgını bulalım

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='A' && karakter<='Z') ||(karakter>='a' && karakter<='z')){
            System.out.println("Girdiginiz karakter bir harf");
        }
        else{
            System.out.println("Girdiginiz karakter bir harf degil");
        }

    }

}
