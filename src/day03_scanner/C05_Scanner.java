package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner sacn = new Scanner(System.in);

        System.out.println("Lutfen cemberın yarıcapını gırınız");

        double yarıcap= sacn.nextDouble();

        System.out.println("gırdıgınız yarıcap:" + yarıcap);
        System.out.println("Cemberın cevresı:" + 2*3.14*yarıcap);
        System.out.println("daırenın alanı:" +3.14* yarıcap*yarıcap);
    }
}
