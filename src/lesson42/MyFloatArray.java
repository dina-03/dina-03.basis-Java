package lesson42;
import java.util.Arrays;
public class MyFloatArray {
    static int count = 0;
    public static void main(String[] args) {
        float[] myFloatArray = createFloatArray(10);
        System.out.println(Arrays.toString(myFloatArray));
        bubbleSort(myFloatArray);
        System.out.println("Количество обменов: " + count);
        System.out.println(Arrays.toString(myFloatArray));
    }

    private static void bubbleSort(float[] myFloatArray) {
        boolean swap = false;
        for (int i = 0; i < myFloatArray.length - 1; i++) {
            if (myFloatArray[i] > myFloatArray[i + 1]) {
                float temp = myFloatArray[i];
                myFloatArray[i] = myFloatArray[i + 1];
                myFloatArray[i + 1] = temp;
                swap = true;
                count++;
            }
        }
        if (swap) {
            bubbleSort(myFloatArray);
        }
    }

    private static float[] createFloatArray(int l) {
        float[] output = new float[l];
        for (int i = 0; i < l; i++) {
            output[i] = (float) Math.random() * 100;
        }
        return output;
    }
}
