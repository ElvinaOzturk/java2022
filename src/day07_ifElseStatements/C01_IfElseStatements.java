package day07_ifElseStatements;

public class C01_IfElseStatements {

    public static void main(String[] args) {

        int a=2;
        int b=3;

        if ( a==b ){
            System.out.println("verilen sayılar esit");

        }

        if (a>100){
            System.out.println("a yuzden buyuk");
        }

        if (a*b>1){
            System.out.println("sayıların carpımı 5 ten buyuk");
        }

        //bagımsız if cumleleri kendileri dışındaki kodlarla ilgilenmezler
        //bir sart ve o sarta baglı sonuca odaklıdır
        //birden fazla bagımsız if cumlesi oldugunda hepsinin body si
        // calısabilecegi gibi hicbirisinin body'si calısmayada bilir
    }

}
