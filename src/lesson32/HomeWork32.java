package lesson32;

import lesson30.GoodMorningArraysDayTwo;

public class HomeWork32 {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5};
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
        System.out.println(unlucky1(b4));// → true
        split();
        System.out.println("sameFirstLast");
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 2, 3, 1};
        int[] c3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(c1));// → false
        System.out.println(sameFirstLast(c2));// → true
        System.out.println(sameFirstLast(c3));// → true
        split();
        System.out.println("sum3");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{5, 11, 2};
        int[] d3 = new int[]{7, 0, 0};
        System.out.println(sum3(d1));//6
        System.out.println(sum3(d2));// → 18
        System.out.println(sum3(d3));// → 7
        split();
    }

    private static int sum3(int[] input) {
        int sum = 0;
        sum = input[0] + input[1] + input[2];
        return sum;
    }

    /* Если массив имеет длину 1 или более, то возвращаем true, если первый и
     последний элементы равны.*/
    private static boolean sameFirstLast(int[] input) {

        return input[0] == input[input.length - 1];
    }

    /* Скажем, что 1, за которой сразу же следует 3 в массиве, является
    "неудачной" 1.
       Возвращаем true, если в данном массиве есть неудачный 1 в первых 2 или
        последних 2 позициях массива.*/
    private static boolean unlucky1(int[] input) {
        /* input[0] == 1 && input[1] == 3 || input[1] == 1 && input[2] == 3*/
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] == 1 && input[j] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Получив массив нечетной длины, верните новую длину массива 3,
    содержащего элементы из середины массива. .
    Длина массива будет не менее 3.*/
    private static int[] midThree(int[] input) {
        int[] output = new int[3];
        for (int i = 0; i < input.length; i++) {
            output[0] = input[input.length / 2 - 1];
            output[1] = input[input.length / 2];
            output[2] = input[input.length / 2 + 1];
        }
        return output;
    }

    public static void split() {
        System.out.println("---------------------------");
    }

}
