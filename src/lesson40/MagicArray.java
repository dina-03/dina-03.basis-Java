package lesson40;

import java.util.Arrays;

public class MagicArray {
    public static void main(String[] args) {
        int[] myArray = createArray(10);
        System.out.println(Arrays.toString(myArray));
        int[] sortArray = getMeSortArray(myArray);
        System.out.println(Arrays.toString(sortArray));
    }

    private static int[] getMeSortArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            //int min =
        }

        return myArray;
    }

    public static int[] createArray(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()) * 100);
        }

        return arr;
    }
}
