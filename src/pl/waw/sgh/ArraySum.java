package pl.waw.sgh;

import java.util.Scanner;

public class ArraySum {

    public static int sumArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result =result + array[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arrayInt = new int[]{
               5, 6,31,2

        };
        int sum = sumArray(arrayInt);
        System.out.println(sum);
    }
}
