package lesson45;

import java.util.Arrays;

// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
//a b c d e f g h i j k l m n o p q r s t u v w x y z
//Задачи для закрепления цикла for, введение — 05
public class IndividualWork {
    public static void main(String[] args) {
        System.out.println(reverseOrder(123));// -> 321
        System.out.println(reverseOrder(768));// -> 867
        split();
        System.out.println(reverseNumber(1234));// -> 4321
        System.out.println(reverseNumber(7685));// -> 5867
        split();
        //myLine(100) ->7 14 21 28 35 42 49 56 63 70 77 84 91 98
        myLine(100);
        split();
        mySecondLine(1000);//->1 2 4 8 16 32 64 128 256 512
        System.out.println();
        split();
        alphabetFour();//Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
        split();
        alphabetRepeatFour();//Вывести каждую букву американского алфавита от A-Z по 4 буквы в строке.
        split();
        fibonacciTwo();//1 1 2 3 5 8 13 21 34 55 89 -> lesson14
        split();
        System.out.println(printLineNTimes("hello", 3));//hello hello hello
        split();
        evenOrOdd(123);//1 – нечет. 2- чет. 3-нечет.
        evenOrOdd(76857);//1 – нечет. 2- чет. 3-чет. 4.– нечет. 5. – нечет.
        evenOrOdd(998866);//1 – нечет. 2- нечет. 3-чет. 4-чет. 5.-чет. 6-чет
        split();
        countdown(5);
        split();
        countdownTwo(); //-> five  four  three  two  one  start
    }

    private static void countdownTwo() {
        String[] str = new String[]{"one", "two", "three", "four", "five",};
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.println(str[i]);
        }
        /*System.out.println(str[4]);
        System.out.println(str[3]);
        System.out.println(str[2]);
        System.out.println(str[1]);
        System.out.println(str[0]);*/
        System.out.println("start");
    }

    private static void countdown(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("start");
    }

    private static void evenOrOdd(int n) {
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i)) % 2 == 0) {
                System.out.print(i + " - четное число; ");
            } else {
                System.out.print(i + " - нечетное число; ");
            }
        }
        System.out.println();
    }

    private static String printLineNTimes(String str, int n) {
        String line = "";
        for (int i = 0; i < n; i++) {
            line = line + "\n" + str;
        }
        return line;
    }

    private static void fibonacciTwo() {
        int n1 = 1, n2 = 1, n3, count = 11;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }

    private static void alphabetRepeatFour() {
        for (int i = 65; i <= 90; i++) {
            char a = (char) i;
            String str = String.valueOf(a);
            System.out.print(repeatSymbol(str + " ", 4) + "\n");
        }
    }

    private static String repeatSymbol(String symbol, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + symbol;
        }
        return output;
    }

    private static void alphabetFour() {
        String alphabet = new String("a b c d-e f g h-i j k l-m n o p-q r s t-u v w x-y z");
        for (String retval : alphabet.split("-", 7)) {
            System.out.println(retval);
        }
    }

    private static void mySecondLine(int n) {
        int a = 1;
        while (a <= n) {
            System.out.print(a + " ");
            a *= 2;
        }
    }

    private static void myLine(int n) {
        for (int i = 7; i < n; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void myLineTwo(int n) {
        int a = 7;
        while (a <= n) {
            System.out.print(a + " ");
            a += 7;
        }
        System.out.println();
    }

    //Универсальный метод reverse
    private static int reverseNumber(int n) {
        String s = String.valueOf(n); // int to String
        String output = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            output = output + s.substring(i, i + 1);
        }
        int result = Integer.parseInt(output); // String to int
        return result;
    }

    private static char[] reverseOrder(int input) {
        String s = Integer.toString(input);
        char[] output = s.toCharArray();
        char[] result = new char[3];
        result[0] = output[2];
        result[1] = output[1];
        result[2] = output[0];
        return result;
    }

    public static void split() {
        System.out.println("--------------------");
    }

}
