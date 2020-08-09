package lesson34;

import java.util.Arrays;

public class HomeWork32Two {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2};
        int[] a2 = new int[]{3, 4};
        int[] a3 = new int[]{3, 4};
        int[] a4 = new int[]{1, 2};
        int[] a5 = new int[]{1, 1};
        int[] a6 = new int[]{1, 2};
        System.out.println("biggerTwo");
        System.out.println(Arrays.toString(biggerTwo(a1, a2)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(a3, a4)));// → [3, 4]
        System.out.println(Arrays.toString(biggerTwo(a5, a6)));// → [1, 2]
        split();
        System.out.println("swapEnds");
        int[] b1 = new int[]{1, 2, 3, 4};
        int[] b2 = new int[]{1, 2, 3};
        int[] b3 = new int[]{8, 6, 7, 9, 5};
        System.out.println(Arrays.toString(swapEnds(b1)));// → [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapEnds(b2)));// → [3, 2, 1]
        System.out.println(Arrays.toString(swapEnds(b3)));// → [5, 6, 7, 9, 8]
        split();
        System.out.println("frontPiece");
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 2};
        int[] c3 = new int[]{1};
        System.out.println(Arrays.toString(frontPiece(c1)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(c2)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(c3)));// → [1]
        split();
        System.out.println("front11");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{7, 9, 8};
        int[] d3 = new int[]{1};
        int[] d4 = new int[]{2};
        int[] d5 = new int[]{1, 7};
        int[] d6 = new int[]{};
        System.out.println(Arrays.toString(front11(d1, d2)));// → [1, 7]
        System.out.println(Arrays.toString(front11(d3, d4)));// → [1, 2]
        System.out.println(Arrays.toString(front11(d5, d6)));// → [1]

    }

    /*27.Учитывая 2 массива int, a и b любой длины, возвращаем новый массив с первым элементом каждого массива.
    Если любой из массивов имеет длину 0, проигнорируйте этот массив. */
    private static int[] front11(int[] a, int[] b) {
        int[] result;               //я не знала что так можно делать! Google был мне в помощь!!!!
        if (a.length == 0 || b.length == 0) {
            result = new int[1];
            if (a.length == 0) {  //начинается цикл в цикле
                result[0] = b[0];
            } else if (b.length == 0) {
                result[0] = a[0];
            }  // заканчивается цикл в цикле

        } else {
            result = new int[2];
            result[0] = a[0];
            result[1] = b[0];
        }
        return result;

    }

    /*26.Получив массив int любой длины, верните новый массив из его первых 2-х элементов.
    Если массив меньше, чем длина 2, используйте все элементы, присутствующие в массиве. */
    private static int[] frontPiece(int[] array) {
        int[] output;

        if (array.length > 1) {
            output = new int[2];
            output[0] = array[0];
            output[1] = array[1];
        } else {
            output = new int[1];
            output[0] = array[0];
        }

        return output;
    }

    /*25.Получив массив ints, поменяйте местами первый и последний элементы в массиве.
    Возвратить измененный массив. Длина массива будет не менее 1.*/
    private static int[] swapEnds(int[] b) {
        int[] output = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            output[0] = b[b.length - 1];
            output[i] = b[i];
            output[output.length - 1] = b[0];
        }

        return output;
    }

    /*24.Начните с 2 массивов int, a и b, каждая длина 2. Рассмотрим сумму значений в каждом массиве.
        Возвратить массив, имеющий наибольшую сумму. В случае ничьей вернуть a. */
    private static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = a[0] + a[1];
        int sum2 = b[0] + b[1];
        if (sum1 > sum2) {
            return a;
        }
        if (sum2 > sum1) {
            return b;
        }
        return a;
    }

    public static void split() {
        System.out.println("---------------------------");
    }
}
