package lesson34;

import java.util.Arrays;

public class HW33 {
    public static void main(String[] args) {
       /* int[] a1 = new int[]{4, 5, 6};
        int[] a2 = new int[]{1, 2};
        int[] a3 = new int[]{3};
        System.out.println(Arrays.toString(makeLast(a1)));//→ [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(makeLast(a2)));//→ [0, 0, 0, 2]
        System.out.println(Arrays.toString(makeLast(a3)));//→ [0, 3]
        int[] ab1 = new int[]{1, 2, 3};
        int[] ab2 = new int[]{1, 3};
        int[] ac1 = new int[]{7, 2, 3};
        int[] ac2 = new int[]{1};
        int[] ad1 = new int[]{1, 2};
        int[] ad2 = new int[]{};
        *//*start1([1, 2, 3], [1, 3]) → 2
          start1([7, 2, 3], [1]) → 1
          start1([1, 2], []) → 1 *//*
        System.out.println(start1(ab1, ab2));
        System.out.println(start1(ac1, ac2));
        System.out.println(start1(ad1, ad2));*/
        System.out.println("-----------");
        int[] a01 = new int[]{1, 2};
        int[] a02 = new int[]{3, 4};
        int[] b01 = new int[]{4, 4};
        int[] b02 = new int[]{2, 2};
        int[] c01 = new int[]{9, 2};
        int[] c02 = new int[]{3, 4};
        System.out.println("plusTwo");
        System.out.println(Arrays.toString(plusTwo(a01, a02)));
        System.out.println(Arrays.toString(plusTwo(b01, b02)));
        System.out.println(Arrays.toString(plusTwo(c01, c02)));
    }

    /*16. Учитывая 2 массива int, каждая длина 2, возвращает новую длину массива 4, содержащего все свои элементы.*/
    private static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            output[i + a.length] = b[i];
        }
        return output;
    }

    /*16. Учитывая 2 массива int, каждая длина 2, возвращает новую длину массива 4, содержащего все свои элементы.*/
    private static int[] plusTwoSimple(int[] a, int[] b) {
        int[] output = new int[4];
        output[0] = a[0];
        output[1] = a[1];
        output[2] = b[0];
        output[3] = b[1];
        return output;
    }

    /* Начните с 2 int-массивов, a и b, любой длины.
      Верните, сколько массивов имеют 1 в качестве первого элемента.*/
    private static int start1(int[] a, int[] b) {
        //проверить массив на пустоту
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count = count + 1;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }

        return count;
    }

    private static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        output[output.length - 1] = array[array.length - 1];


        return output;
    }

    public static void myArrayPrint(int[] arrayToPrint) {
        System.out.println("Длина массива - " + arrayToPrint.length);
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
