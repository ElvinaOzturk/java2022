package day32_dataTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalData {
    public static <Localdate> void main(String[] args) {

        LocalDate trh = LocalDate.now();// objenin olusturdugu tarihi trh'ye atar
        LocalDate baskaTrh = LocalDate.of(1988,1,12);
        //istedigimiz yil,ay ve gun degerlerine gore bize obje olusturur

        System.out.println(trh);//2022-03-31

        System.out.println(trh.getDayOfMonth());//31
        System.out.println(trh.getDayOfWeek());//THURSDAY
        System.out.println(trh.getMonthValue());//3
        System.out.println(trh.getDayOfYear());//90
        System.out.println(trh.getYear());//2022

        //bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//2021-11-11
        System.out.println(trh.minusWeeks(5).minusDays(3));//2022-02-21
        System.out.println(trh.plusMonths(9).plusDays(10));//2023-01-10

        //İstedigimiz ulkeni o andaki tarihini elde etmek istersek





        //is ile baslayan method'lar boolean sonuclar dondurur
        System.out.println(LocalDate.now().isLeapYear());//false
        System.out.println(trh.isAfter(baskaTrh));//true



    }
}
