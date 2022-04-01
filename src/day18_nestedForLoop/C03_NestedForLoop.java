package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //        *
        //        * *
        //        * * *
        //        * * * *

        int input = 5;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input ; j++) {
                //Nested for loop ya dikdörtgen veya ucgen formatında olabilir
                //dikdortgen istedigimizde iki loop icin de bagımsız en point belirleriz
                //ucgen sekli vermek icin inner loop2un end poin'ini olarak outer degiskene baglarız
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
