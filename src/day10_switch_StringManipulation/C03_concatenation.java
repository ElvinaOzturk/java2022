package day10_switch_StringManipulation;

public class C03_concatenation {
    public static void main(String[] args) {

        //Concatenation yapmak icin iki ihtimalimiz var
        //İstersek daha once yaptıgımız gibi + operatorunu kullana biliriz veya
        //String  class'ından gelen concat metodunu kullanabiliriz

        String str1="Java";
        String  str2="Candır";

        //Java Candır yazdıralım

        System.out.println(str1 + " " + str2);

        String cumle= str1.concat(str2); //Java Candır

        cumle= str1.concat(" ").concat(str2);

        System.out.println(cumle);

        //concat icine String degil de sayı veya boolean deger yazsak?
        //concat metodu icine String parametre ister String dısında bir data turu yazdıgınızda onu
        // String haline getirmelisiniz

        cumle=str1.concat(""+5);
        cumle=str1.concat(true+"");

    }
}
