package lesson33;

import lesson30.GoodMorningArraysDayTwo;

import java.util.Arrays;

public class HW32 {
    public static void main(String[] args) {
    /*  int[] a1 = new int[]{1, 2, 3, 4, 5};
        int[] a2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] a3 = new int[]{1, 2, 3};
        GoodMorningArraysDayTwo.myArrayPrint(midThree(a1)); //→ [2, 3, 4]
        GoodMorningArraysDayTwo.myArrayPrint(midThree(a2)); //→ [7, 5, 3]
        GoodMorningArraysDayTwo.myArrayPrint(midThree(a3)); //→ [1, 2, 3]
        split();
        System.out.println("unlucky1");
        int[] b1 = new int[]{1, 3, 4, 5};
        int[] b2 = new int[]{2, 1, 3, 4, 5};
        int[] b3 = new int[]{1, 1, 1};
        int[] b4 = new int[]{1, 1, 1, 1, 1, 3};
        System.out.println(unlucky1(b1));// → true
        System.out.println(unlucky1(b2));// → true
        System.out.println(unlucky1(b3));// → false
        //System.out.println(unlucky1(b4));// → true
        split();
        System.out.println("sameFirstLast");
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 2, 3, 1};
        int[] c3 = new int[]{1, 2, 1};
        int[] c4 = new int[0];
        System.out.println(sameFirstLast(c1));// → false
        System.out.println(sameFirstLast(c2));// → true
        System.out.println(sameFirstLast(c3));// → true
        System.out.println(sameFirstLast(c4));// → false
        split();
        System.out.println("sum3");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{5, 11, 2};
        int[] d3 = new int[]{7, 0, 0};
        System.out.println(sum3(d1));//6
        System.out.println(sum3(d2));// → 18
        System.out.println(sum3(d3));// → 7
        split();
        // Given an array of ints length 3, figure out which is larger, the first or last element in the array,
        // and set all the other elements to be that value. Return the changed array.
        int[] gf1 = new int[]{1, 2, 3};
        int[] gf2 = new int[]{11, 5, 9};
        int[] gf3 = new int[]{2, 11, 3};
        GoodMorningArraysDayTwo.myArrayPrint(maxEnd3(gf1)); //→ [3, 3, 3]
        GoodMorningArraysDayTwo.myArrayPrint(maxEnd3(gf2)); //→ [11, 11, 11]
        GoodMorningArraysDayTwo.myArrayPrint(maxEnd3(gf3)); //→ [3, 3, 3]
        split();*/
        int[] a1 = new int[]{1, 2, 3,};// → [1, 3]
        int[] a2 = new int[]{1, 2, 3, 4};// → [1, 4]
        int[] a3 = new int[]{7, 4, 6, 2};// → [7, 2]
        myArrayPrint(makeEnds(a1));// → [1, 3]
        myArrayPrint(makeEnds(a2));// → [1, 4]
        myArrayPrint(makeEnds(a3));// → [7, 2]
    }

    public static int[] makeEnds(int[] input) {
        int[] output = new int[2];
        output[0] = input[0];
        output[output.length - 1] = input[input.length - 1];
        return output;
    }

    private static int[] maxEnd3(int[] array) {
        if (array[0] > array[array.length - 1]) {
            fillArray(array, array[0]);
        } else if (array[0] < array[array.length - 1]) {
            Arrays.fill(array, array[array.length - 1]);  //fillArray(array, array[array.length - 1]);
        }

        return array;
    }

    public static int[] fillArray(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            input[i] = value;
        }

        return input;
    }

    private static int[] maxEnd3One(int[] array) {
        if (array[0] > array[array.length - 1]) {
            array[1] = array[0];
            array[2] = array[0];
        } else if (array[0] < array[array.length - 1]) {
            array[0] = array[array.length - 1];
            array[1] = array[array.length - 1];
        }

        return array;
    }

    private static int sum3(int[] array) {
        return array[0] + array[1] + array[2];
    }

    /* Если массив имеет длину 1 или более, то возвращаем true, если первый и
     последний элементы равны.*/
    private static boolean sameFirstLast(int[] input) {

        return input.length >= 1 && input[0] == input[input.length - 1];
    }

    /* Скажем, что 1, за которой сразу же следует 3 в массиве, является
    "неудачной" 1.
       Возвращаем true, если в данном массиве есть неудачный 1 в первых 2 или
        последних 2 позициях массива.*/
    private static boolean unlucky1(int[] input) {
        if ((input[0] == 1 && input[1] == 3) || (input[input[input.length - 2]] == 1 && input[input.length - 1] == 3)
                || input[1] == 1 && input[2] == 3) {
            return true;
        }
        return false;
    }

    /* Получив массив нечетной длины, верните новую длину массива 3,
    содержащего элементы из середины массива. .
    Длина массива будет не менее 3.*/
    private static int[] midThree(int[] array) {
        int[] myArray = new int[3];
        int middle = array.length / 2;
        myArray[0] = array[middle - 1];
        myArray[1] = array[middle];
        myArray[2] = array[middle + 1];

        return myArray;
    }

    public static void split() {
        System.out.println("---------------------------");
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
