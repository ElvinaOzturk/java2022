package day11_stringManipulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        //kullanıcıya derse katılıp katılmak istemedigini sorun
        //evet derse,cevabını ve "derse katılımınız onaylanmıstır" yazdırın
        //hayır derse cevabını ve "Sonraki derslerimize bekleriz" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz ?  \nEvet veya Hayır yazınız");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabınız : " + cevap + "derse katılımınız onaylanmıstır");
        }else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız : " + cevap + "Sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen evet ve ya hayır yazınız");
        }

    }
}
