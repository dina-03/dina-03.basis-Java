package lesson38;

public class CharSwapExercise {
    public static void main(String[] args) {
        char[] myArray = createArray(33);
        //рандомное заполнение массива
        //перемешивание
        myPrint(myArray);
        char[] shakeArray = getShake(myArray);
        myPrint(shakeArray);

    }

    private static char[] getShake(char[] eingabe) {
        char[] result = new char[eingabe.length];
        //myCharDigitPrint(result);
        for (int i = 0; i < result.length; i++) {
            int newPlace = (int) (Math.random() * result.length);
            while (result[newPlace] != 0) {
                newPlace = (int) (Math.random() * result.length);
            }
            result[newPlace] = eingabe[i];
        }
        return result;
    }

    private static void myCharDigitPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + 0 + " ");
        }
        System.out.println();
    }

    public static void myPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    private static char[] createArray(int length) {
        char[] output = new char[length];
        for (int i = 0; i < length; i++) {
            output[i] = myCyrillicChar();
        }
        return output;
    }

    private static char myCyrillicChar() {
        int min = 1072; // "a".codePointAt(0)
        int max = 1103;
        char randomCyrillicChar = (char) (Math.random() * ((max - min) + 1) + min);
        return randomCyrillicChar;
    }
}
