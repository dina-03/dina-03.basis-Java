package lesson44;

public class MyLovelyBoolean {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 3, 5};//true
        int[] a2 = new int[]{2, 1, 2, 5};//false
        int[] a3 = new int[]{2, 4, 2, 5};//true
        System.out.println(modThree(a1));// → true
        System.out.println(modThree(a2));// → false
        System.out.println(modThree(a3));// → true
        System.out.println("--------");
        int[] b = new int[]{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(b, 1));// → false
        System.out.println(sameEnds(b, 2));// → true
        System.out.println(sameEnds(b, 3));// → false
    }

    private static boolean sameEnds(int[] array, int n) {
        if (n == 0 || n == 2){
            return true;
        }
        return false;
    }

    /*При наличии массива ints, возвращайте true,
       если массив содержит либо 3 четных, либо 3 нечетных значения все рядом. */
    private static boolean modThree(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) ||
                    (!(array[i] % 2 == 0) && !(array[i + 1] % 2 == 0) && !(array[i + 2] % 2 == 0))) {
                return true;
            }
        }
        return false;
    }

}
