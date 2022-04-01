package day32_dataTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);//22:08:54.734706800

        int sayi = 0;

        for (int i = 0; i < 100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi);//22:14:20.731793300

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1) + "nanosaniyede bitti");

        //ileri ve ya geriye gidebiliriz

        System.out.println(tm.plusMinutes(1000));//14:59:21.967900400

        //istersek zone id kullanarak istedigimiz bolgenin saati icin de obje olusturabilir

    }
}
