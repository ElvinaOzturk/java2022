package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim = "Elvina";
        String soyisim = "Ozturk";
        String kkNo = "1234567890123456";

        //eger bir method'dan bir islem yapmasını ve yaptıgı islemi bize getirmesini isterseniz
        //return type void degil, bize getirecegi sonucun data turunde olmalıdır

        isimSoyisimGizle(isim,soyisim);
        //bana isim ve soyisimin gizlenmis halini getirmesini istiyorum
        //bekledigim donus String olur
        krediKartıGizle(kkNo);

        String yeniİsim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo = "**** **** **** " + kkNo.substring(12);

        System.out.println("isim-soyisim :" +yeniİsim+ " " +yeniSoyisim+
                "\nkart No : " +yeniKKNo);
    }


    public static void isimSoyisimGizle(String isim, String soyisim) {
        String yeniİsim = isim.substring(0,1).toUpperCase()+
                          isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+
                             soyisim.substring(1).replaceAll("\\S","*");
        //method olusturmada 3. adım
        //method calisinca sadece birsey mi yazdıracak
        //yoksa bize bir data mi dondurecek buna karar vermektir
        //Bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        //return Type'i void degil String sectik
        //ve metdod'un sonuna return edilecek datayı yazdık
       // return yeniİsim + " " + yeniSoyisim;
    }

    private static void krediKartıGizle(String kkNo) {
    }
}
