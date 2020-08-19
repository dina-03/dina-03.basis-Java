package lesson44;

import java.util.Arrays;

public class Array02Exercise {
    public static void main(String[] args) {
        /*int[] a1 = new int[]{10, 3, 5, 6};
        int[] a2 = new int[]{7, 2, 10, 9};
        int[] a3 = new int[]{2, 10, 7, 2};
        System.out.println(bigDiff(a1));// → 7
        System.out.println(bigDiff(a2));// → 8
        System.out.println(bigDiff(a3));// → 8*/
        int[] b1 = new int[]{1, 2, 2};
        int[] b2 = new int[]{1, 2, 2, 6, 99, 99, 7};
        int[] b3 = new int[]{1, 1, 6, 7, 2};
        System.out.println(sum67(b1));// → 5
        System.out.println(sum67(b2));// → 5
        System.out.println(sum67(b3));// → 4
    }

    private static int sum67(int[] arr) {
        int sum = 0;
        int indexOfSix = findIndex(arr, 6);
        int indexOfSeven = findIndex(arr, 7);
        sum = findSum(arr, 0, arr.length);
        if (indexOfSeven == -1) {
            sum = findSum(arr, 0, arr.length);
        } else {
            sum = findSum(arr, 0, indexOfSix);
            sum += findSum(arr, indexOfSeven + 1, arr.length);
        }
        return sum;
    }

    private static int findIndex(int[] arr, int n) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
            }
        }
        return index;
    }

    public static int findSum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int sum67One(int[] array) {
        int sum = 0;
        boolean sixMode = false;
        for (int i = 0; i < array.length; i++) {
            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) {
                sixMode = true;
            } else
                sum += array[i];
        }
        return sum;
    }

    private static int bigDiff(int[] input) {
        // int max = findMax();
        // int min = findMin();
        return 0;
    }

    private static int findMax(int[] input) {
        int max = input[0];
        for (int j : input) {
            max = Math.min(max, j);
        }
        return max;
    }

    private static int findMin(int[] input) {
        int min = input[0];
        for (int j : input) {
            min = Math.min(min, j);
        }
        return min;
    }
}
