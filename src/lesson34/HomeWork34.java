package lesson34;

import java.util.Arrays;

public class HomeWork34 {
    public static void main(String[] args) {
        System.out.println("make2");
        int[] ab1 = new int[]{4, 5};
        int[] ab2 = new int[]{1, 2, 3};
        int[] bc1 = new int[]{4};
        int[] bc2 = new int[]{1, 2, 3};
        int[] cd1 = new int[]{};
        int[] cd2 = new int[]{1, 2};
        System.out.println(Arrays.toString(make2(ab1, ab2)));// → [4, 5]
        System.out.println(Arrays.toString(make2(bc1, bc2)));//→ [4, 1]
        System.out.println(Arrays.toString(make2(cd1, cd2)));//→ [1, 2]
        split();
        System.out.println("makePi");
        System.out.println(Arrays.toString(makePi()));// → [3, 1, 4]
        split();
        System.out.println("rotateLeft3");
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{5, 11, 9};
        int[] a3 = new int[]{7, 0, 0};
        System.out.println(Arrays.toString(rotateLeft3(a1)));// → [2, 3, 1]
        System.out.println(Arrays.toString(rotateLeft3(a2)));// → [11, 9, 5]
        System.out.println(Arrays.toString(rotateLeft3(a3)));// → [0, 0, 7]
        split();
        System.out.println("sum2");
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{1, 1};
        int[] b3 = new int[]{1, 1, 1, 1};
        System.out.println(sum2(b1));// → 3
        System.out.println(sum2(b2));// → 2
        System.out.println(sum2(b3));// → 2
        split();
        System.out.println("has23");
        int[] c1 = new int[]{2, 5};
        int[] c2 = new int[]{4, 3};
        int[] c3 = new int[]{4, 5};
        System.out.println(has23(c1));// → true
        System.out.println(has23(c2));// → true
        System.out.println(has23(c3));// → false
        split();
        System.out.println("double23");
        int[] d1 = new int[]{2, 2};
        int[] d2 = new int[]{3, 3};
        int[] d3 = new int[]{2, 3};
        System.out.println(double23(d1));// → true
        System.out.println(double23(d2));// → true
        System.out.println(double23(d3));// → false
    }

    /* 23.Given an int array, return true if the array contains 2 twice, or 3 twice.
    The array will be length 0, 1, or 2.
    При наличии массива int, возвращаем true, если массив содержит 2 раза или 3 раза.
        Массив будет длиной 0, 1 или 2.*/
    private static boolean double23(int[] input) {
        return input[0] == input[1];
    }

    /*22.Учитывая длину массива int 2, возвращаем true, если он содержит 2 или 3. */
    private static boolean has23(int[] input) {
        return input[0] == 2 || input[1] == 3;
    }

    /*21.При задании массива из нескольких точек возвращаем сумму первых 2-х элементов массива.
        Если длина массива меньше 2, просто просуммируйте существующие элементы,
        возвращая 0, если массив имеет длину 0.*/
    private static int sum2(int[] input) {
        int sum = input[0] + input[1];
        return sum;
    }

    /*20.При заданной длине массива в интах 3 возвращаем массив с элементами,
      "повернутыми влево" таким образом, что {1, 2, 3} дает {2, 3, 1}. */
    private static int[] rotateLeft3(int[] array) {
        int[] input = new int[3];
        input[0] = array[1];
        input[1] = array[2];
        input[2] = array[0];
        return input;
    }


    /*19 Возвращает массив int длиной 3, содержащий первые 3 цифры pi, {3, 1, 4}.*/
    private static int[] makePi() {
        int[] pi = new int[]{3, 1, 4};
        return pi;
    }

    /* 18. Учитывая 2 массива int, a и b, возвращаем новый массив длиной 2, содержащий столько,
        сколько поместится, элементов из a, а затем элементы из b.
        Массивы могут иметь любую длину, включая 0, но между 2 массивами будет 2 и более элементов.
        make2([4, 5], [1, 2, 3]) → [4, 5]
        make2([4], [1, 2, 3]) → [4, 1]
        make2([], [1, 2]) → [1, 2]*/
    private static int[] make2(int[] a, int[] b) {
        int[] output = new int[2];
        if (a.length == 2) {
            output[0] = a[0];
            output[1] = a[1];
        }
        if (a.length == 1) {
            output[0] = a[0];
            output[1] = b[0];
        }
        if (a.length == 0) {
            output[0] = b[0];
            output[1] = b[1];
        }
        return output;
    }

    private static void split() {
        System.out.println("-----------------------");
    }
}
