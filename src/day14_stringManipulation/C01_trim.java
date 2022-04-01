package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = "   Siz ne derseniz deyin, Java bildiyini okur.   ";

        str.trim();
        System.out.println(str);//"metin" bosluklu
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);//"metin" bosluksuz
        System.out.println(str.length());
    }
}
