package lesson28;

public class Array01 {
    public static void main(String[] args) {
       /* firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false*/
        int[] var1 = new int[]{1, 2, 6}; // true
        System.out.println(firstLast6(var1));
        int[] var2 = new int[]{6, 1, 2, 3}; // true
        System.out.println(firstLast6(var2));
        int[] var3 = new int[]{13, 6, 1, 2, 3}; // false
        System.out.println(firstLast6(var3));

    }

    public static boolean firstLast6(int[] myArray) {
       /* if (myArray[0] == 6 || myArray[myArray.length - 1] == 6) {
            return true;
        }*/

        return myArray[0] == 6 || myArray[myArray.length - 1] == 6;
    }

}
