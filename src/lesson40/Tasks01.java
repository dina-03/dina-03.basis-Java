package lesson40;

import java.util.Arrays;
import java.util.Scanner;

public class Tasks01 {
    public static void main(String[] args) {
        //myLine();
        //mySecondLine();
        System.out.println(alphabet());


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

    public static void myPrint(char[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    private static char alphabet() {
        // String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //System.out.println(" ABCD \n EFGH \n IJKL \n MNOP \n QRST \n UVWX \n YZAB");
        char min = 'a';
        char max = 'z';
        char randomChar = (char) (Math.random() * (max + min));
        return randomChar;
    }

    private static void mySecondLine() {
        int a = 1;
        while (a <= 1025) {
            System.out.print(a + " ");
            a *= 2;
        }
    }

    private static void myLine() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
