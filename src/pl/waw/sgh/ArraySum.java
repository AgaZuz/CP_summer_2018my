package pl.waw.sgh;

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
                4, 5, 2, 8 ,3
        };
        int sum = sumArray(arrayInt);
        System.out.println(sum);
    }
}
