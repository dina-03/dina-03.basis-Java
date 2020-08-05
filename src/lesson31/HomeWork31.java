package lesson31;

import lesson30.GoodMorningArraysDayTwo;

public class HomeWork31 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{5, 11, 9};
        int[] b3 = new int[]{7, 0, 0};
        reverse3(b1);// → [3, 2, 1]
        reverse3(b2);// → [9, 11, 5]
        reverse3(b3);// → [0, 0, 7]
        System.out.println("____________");
        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        middleWay(mc1, mc2); //→ [2, 5]
        middleWay(kc1, kc2);// → [7, 8]
        middleWay(nc1, nc2);// → [2, 4]
    }

    /* Даны 2 массива int, a и b, каждый длиной 3, верните новый массив с длиной 2,
       содержащего среднее арифметическое элементов первоначальных массивов.*/
    public static int[] middleWay(int[] a, int[] b) {
        /*a[1] == b[1] || a[a.length / 2] == b.length / 2 */
     /*   if (a[1] == a[a.length / 2] || b[1] == b.length / 2) {
            System.out.println(a[1] + " " + b[1]);
            // System.out.println(b[1]);
            return a;
        }*/
        System.out.println(a[1] + " " + b[1]);
        return a;
    }

    /* Дан массив длиной 3, верните новый массив с элементами в обратном порядке,
        например {1, 2, 3} становится {3, 2, 1}.*/
    private static int[] reverse3(int[] b) {
        /*for (int i = b[b.length - 1]; i >= 0; i--) {
        }*/
        System.out.println(b[2] + " " + b[1] + " " + b[0]);
        return b;
    }
}
