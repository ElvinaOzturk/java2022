package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //stringi yazdıran method olusturalım
        //hosgeldiniz diyen bir method olusturalım
        //kapanma mesajı yazan bir method olusturalım

        hosgeldinYazdır();

    }

    private static void kapanmaMethodu() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdır() {
        System.out.println("Hosgeldiniz");
        stringYazdır("Boyle de olur");

    }

    private static void stringYazdır(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
