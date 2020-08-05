package lesson10;

public class WarmUp {
    public static void main(String[] args) {
        /*System.out.println(sleepIn(false, false));//true
        System.out.println(sleepIn(true, false));//false
        System.out.println(sleepIn(false, true));//true
        System.out.println(missingChar("kitten", 1));//→ "ktten"
        System.out.println(missingChar("kitten", 0));//→ "itten"
        System.out.println(missingChar("kitten", 4));//→ "kittn"
        System.out.println(missingChar("Andrey", 2));//→ "An"*/
        System.out.println(backAround("cat"));
        System.out.println(backAround("hello"));
        System.out.println(backAround("a"));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;
    }

    /*Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
    Получив int n, верните абсолютную разницу между n и 21,
    за исключением того, что верните двойную абсолютную разницу, если n больше 21. */
    public static double diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return Math.abs(n - 21);
        }
    }

    /*Получив непустую строку и int n, верните новую строку,
    в которой был удален символ в индексе n.
    Значение n будет корректным индексом char в исходной строке
    (т.е. n будет в диапазоне 0..str.length()-1 включительно).*/
    public static String missingChar(String s, int n) {
        //s =
        String output = "";
        output = s.substring(0, n);// + s.substring(n + 1);

        return output;
    }

    /*Получив строку, возьмите последний символ и верните новую строку
    с последним добавленным символом спереди и сзади,
    так что "cat" дает "tcatt". Оригинальная строка будет длиной 1 или более. */

    public static String backAround(String str) {
        String output = "";
        int lestSymbol = str.length() - 1;
        output = str.substring(str.length() - 1);


        return output + str + output;
    }
}
