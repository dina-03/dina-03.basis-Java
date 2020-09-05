package lesson54;

public class MyLovelyArray01 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 6};
        int[] a2 = {6, 1, 2, 3};
        int[] a3 = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(a1));// → true
        System.out.println(firstLast6(a2));// → true
        System.out.println(firstLast6(a3));// → false
        int[] b1 = {2, 1, 2, 3, 4};
        int[] b2 = {2, 2, 0};
        int[] b3 = {1, 3, 5};
        System.out.println(countEvens(b1));// → 3
        System.out.println(countEvens(b2));// → 3
        System.out.println(countEvens(b3));// → 0
        System.out.println("-----");
        int[] c1 = {1, 2, 2, 1};
        int[] c2 = {1, 1};
        int[] c3 = {1, 2, 2, 1, 13};
        System.out.println(sum13(c1));// → 6
        System.out.println(sum13(c2));// → 2
        System.out.println(sum13(c3));// → 6
        System.out.println("----");
        int[] numbers = {10, 20, 30, 40, 50};
        testContinue(numbers);
    }

    public static void testContinue(int[] num) {
        for (int x : num) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println();
    }

    private static int sum13(int[] c) {
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 13 || i > 0 && c[i - 1] == 13) {
                continue;
            } else {
                count += c[i];
            }
        }
        return count;
    }

    private static int countEvens(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                int count = b[i];
                count++;
                return count;
            }
        }
        return 0;
    }

    private static boolean firstLast6(int[] a) {
        if (a[0] == 6 || a[a.length - 1] == 6) {
            return true;
        }
        return false;
    }
}
