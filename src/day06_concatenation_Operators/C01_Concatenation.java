package day06_concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayı1=5;
        int sayı2=3;

        //variable'ların deferlerini degistirmeden asgıdakı ifadeleri, bu variable'ları kullanarak yazdırın

        System.out.println(str1+sayı1+str2); //Java5Guzel

        System.out.println(sayı1-sayı2+str2+sayı1*sayı2); //2Guzel15

        System.out.println(str1+(sayı1-sayı2)+(sayı1-sayı2)); //Java22

        System.out.println(sayı1+ (sayı2+str2)); // 53Guzel

        System.out.println("" +sayı1+ sayı2 +str2 );  //53Guzel

        //eger tamamen sayılardan olusan bir String varsa ve biz bunu Int'a cevirmek istersek Integer.valueof(str)
        //bir sayıyı stringe cevirmek istersem ""+sayı


    }
}
