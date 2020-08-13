package lesson38;

public class HomeWork38 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 2, 3, 4};// → 3
        int[] a2 = new int[]{2, 2, 0};      // → 3
        int[] a3 = new int[]{1, 3, 5};      // → 0
        System.out.println(countEvens(a1));// → 3
        System.out.println(countEvens(a2));// → 3
        System.out.println(countEvens(a3));// → 0
        System.out.println("-----------");
        int[] b1 = new int[]{1, 2, 1, 1, 3};             // → 4
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4};      // → 6
        int[] b3 = new int[]{1, 4, 2, 1, 4, 4, 4};      // → 6
        System.out.println(maxSpan(b1));// → 4
        System.out.println(maxSpan(b2));// → 6
        System.out.println(maxSpan(b3));// → 6
    }

    /*Рассмотрим самые левые и самые правые появления некоторого значения в массиве.
    Скажем, что "промежуток" - это количество элементов между двумя включёнными.
    Одиночное значение имеет диапазон 1. Возвращает наибольший диапазон, найденный в данном массиве.
     (Эффективность не является приоритетом.) */
    public static int maxSpan(int[] nums) {
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tmp = j - i + 1;
                    result = Math.max(tmp, result);
                }
            }
        }
        return result;
    }

    /*Возвращает количество четных дюймов в данном массиве. Примечание: оператор % "mod" вычисляет остаток,
      например, 5 % 2 равно 1 */
    private static int countEvens(int[] input) {
        int result = 0;
        for (int i : input) {
            if (i % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
