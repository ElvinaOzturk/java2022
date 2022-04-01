package interviewQuestions1;

import java.util.Scanner;

public class Q02 {
    /*
     * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str = scan.nextLine();

        System.out.println("Bir sayi giriniz :");
        int sayi = scan.nextInt();
        ilkSonHarf(str,sayi);
        System.out.println("Girilen stringin ilk ve son harfinin istenilen sayi kadar birlesik hali :" + ilkSonHarf(str,sayi));


    }//main sonu

    private static String ilkSonHarf(String str, int sayi) {
        String s = str.substring(0,1) + str.substring(str.length()-1);

        String output = "";
        for (int i = 0; i <sayi ; i++) {
           output+=s ;  //b = b+s
        }
        return output;

    }
}
