package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayı1=879;
        double sayı2=10;

        double sayı3=sayı1/sayı2;
        System.out.println(sayı3);//87.9

        int sayı4 = (int) (sayı1/sayı2);
        //deger double, variable int
        //yani variable daha dar dolayisiyla java bunu otomatik olarak yapmaz
        //sorumlulugu ustlenmemizi ister
        //sag tarafa yazdigimiz (int) sorumluluk bende demek

        System.out.println(sayı4);//87

        int sayı5=140;
        byte sayı6=(byte) sayı5; //sag taraftaki deger int > sol taraftaki variable byte
        System.out.println(sayı6);//-116

        sayı5=129;
        sayı6=(byte) sayı5;
        System.out.println(sayı6);//-127

        sayı5=260;
        sayı6=(byte) sayı5;
        System.out.println(sayı6);//4

        sayı5=520;
        sayı6=(byte) sayı5;
        System.out.println(sayı6);//8

        sayı5=-130;
        sayı6=(byte) sayı5;
        System.out.println(sayı6); //126
        sayı5=44;
        sayı6=(byte)sayı5;
        System.out.println(sayı6);//44






    }
    }

