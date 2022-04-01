package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";
        //str'ın ilk 4 harfini almak istersek
        str.substring(0,4);

        //Bir program yaparken kodlarımızın daha kısa ve anlasılır olması icin surekli kullanabilecegimiz
        //kod bloklarını hazır olarak bir yere koyar ihtiyacımız oldukca oradan alıp kullanırız

        //metod'lar robotlara benzer
        //method olusturmak bazen o metodun yapacagı isi yapmaktan zor olabilir
        //bir islemi sadce bir kere yapacaksak method kullanmamıza gerek olmayabilir
        //ancak ozellikle cok kullanacagımız islemler icin her seferinde yeniden aynı kodları
        //yazmak yerine bu islemi yapan hazır bir method olusturmak cok daha pratiktir

        //bazen bir classın icerisinde cok uzun kodlar yazarsak tum classın anlasılması zorlasabilir
        //bunu yerine kodun belli kısımlarını ayrı metodlar olarak olusturup main method icerisinden
        //istedigimiz sekilde bu metodları yönetebiliriz

    }
}
