package day30_passByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {

        int arr [] = {1,2,3};
        System.out.println(Arrays.toString(arr));
        arrdegistir(arr);
        System.out.println("method call sonrası : " + Arrays.toString(arr));

    }

    private static void arrdegistir(int[] arr) {

        arr = new int[5];
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0]
    }
}
