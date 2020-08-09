package lesson34;

import java.util.Arrays;

public class Front11Ex {
    public static void main(String[] args) {
        System.out.println("front11Ex");
        int[] d01 = new int[]{1, 2, 3};
        int[] d02 = new int[]{7, 9, 8};
        int[] d03 = new int[]{1};
        int[] d04 = new int[]{2};
        int[] d05 = new int[]{1, 7};
        int[] d06 = new int[]{};
        System.out.println(Arrays.toString(front11Ex(d01, d02)));// → [1, 7]
        System.out.println(Arrays.toString(front11Ex(d03, d04)));// → [1, 2]
        System.out.println(Arrays.toString(front11Ex(d05, d06)));// → [1]
    }
    public static int[] front11Ex(int[] a, int[] b) {
        int[] f;
        if (a.length == 0 || b.length == 0) {
            f = new int[1];
            if (a.length == 0)
                f[0] = b[0];
            else if (b.length == 0)
                f[0] = a[0];
        } else {
            f = new int[2];
            f[0] = a[0];
            f[1] = b[0];
        }
        return f;  //вариант первый

    }

}
