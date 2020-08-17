package lesson42;
import java.util.Arrays;
public class MyLongSort {
    static int count = 0;
    public static void main(String[] args) {
        long[] myArray = createArray(10);
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("Количество обменов " + count);
        System.out.println(Arrays.toString(myArray));
    }

    private static void bubbleSort(long[] myLongArray) {
        boolean swap = false;
        for (int i = 0; i < myLongArray.length - 1; i++) {
            if (myLongArray[i] > myLongArray[i + 1]) {
                long temp = myLongArray[i];
                myLongArray[i] = myLongArray[i + 1];
                myLongArray[i + 1] = temp;
                swap = true;
                count++;
            }
        }
            if (swap){
                bubbleSort(myLongArray);
            }
    }

    private static long[] createArray(int l) {
        long[] array = new long[l];
        for (int i = 0; i < l; i++) {
            array[i] = (long) (Math.random() * 100);
        }
        return array;
    }

}
