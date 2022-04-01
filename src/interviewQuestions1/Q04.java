package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String pin = "said.12345";
        int girisHakkı = 4;

        System.out.println("*****Hosgeldiniz******");
        while (true){
            System.out.println("pin kodu giriniz : ");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz..:) ");
                break;

            }else{
                System.out.println("Yalnis giris yaptiniz... ");
                girisHakkı--;
                System.out.println("kalan giris hakkiniz : "  + girisHakkı);
            }if (girisHakkı==0){
                System.out.println("giris hakkiniz kalmadi .. sim kartiniz bloke oldu.. ");
                break;
            }
        }
    }
}
