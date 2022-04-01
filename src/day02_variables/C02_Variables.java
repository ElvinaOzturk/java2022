package day02_variables;

public class C02_Variables {
    public static void main(String[] args) {
        // java calısmaya main metotdan baslar
        // sonra yukarıdan asgıya, soldan saga dogru calısmaya baslar


        //eger ıstersek bır varıablı once declare edıp sonra atayabılırız
         String okulIsmi;
         okulIsmi="Yıldız Kolejı";
         //java deger ataması yapmadıgımız bır variable olusturmamıza itiraz etmez
        // ancak deger atamsı yapıncaya kadar o variableyi kullanmamıza ızın vermez
        //System.out.println(okulIsmi);

        System.out.println(okulIsmi);
        okulIsmi="Star Koleji";
        System.out.println(okulIsmi);
        okulIsmi="Java Koleji";
        System.out.println(okulIsmi);
        //println ile print arasındakı fark
        // println dediginizde yazdırma ıslemınden sonra alt satıra gecerken
        //sadece print dedigimizde yazdırma isleminden sonra alt satıra gecmez

    }
}
