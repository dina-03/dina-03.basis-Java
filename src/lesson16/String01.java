package lesson16;

public class String01 {
    public static void main(String[] args) {
        /*System.out.println(helloName("Bob"));// → "Hello Bob!"
        System.out.println(helloName("Alice"));// → "Hello Alice!"
        System.out.println(helloName("X"));// → "Hello X!"
        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
        System.out.println(firstHalf("WooHoo"));// →"Woo"
        System.out.println(firstHalf("HelloThere"));// →"Hello"
        System.out.println(firstHalf("abcdef"));// →"abc"
        System.out.println(nonStart("Hello", "There"));// →"ellohere"
        System.out.println(nonStart("java", "code"));// →"avaode"
        System.out.println(nonStart("shotl", "java"));// →"hotlava"
        System.out.println(theEnd("Hello", true));// →"H"
        System.out.println(theEnd("Hello", false));// →"o"
        System.out.println(theEnd("oh", true));// →"o"
        System.out.println(endsLy("oddly"));// →true
        System.out.println(endsLy("y"));// →false
        System.out.println(endsLy("oddy"));// →false
        System.out.println(endsLyDos("oddly"));
        System.out.println(endsLyDos("oddy"));
        System.out.println(extraFront("Hello"));// →"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));// →"HHH"*/
        System.out.println(makeOutWord("<<>>", "Yay"));// → "<<Yay>>"
        System.out.println(makeOutWord("<<>>", "WooHoo"));// → "<<WooHoo>>"
        System.out.println(makeOutWord("[[]]", "word"));// → "[[word]]"
    }

    /* Получив строку, верните новую строку, сделанную из 3 копий первых 2-х графиков исходной строки.
    Строка может быть любой длины. Если их меньше 2-х, используйте все, что есть.*/
    public static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            String newString = str.substring(0, 2);
            return newString + newString + newString;
        }

    }

    /*Получив строку, верните true, если она заканчивается на "ly". */
    public static boolean endsLyDos(String str) {
        String reference = "ly";
        int length = str.length();
        if (length < 2) {
            return false;

        }
        return reference.equals(str.substring(str.length() - 2));
    }

    public static boolean endsLy(String str) {
        //str.endsWith()
        return str.endsWith("ly");
    }

    /* Получив строку, верните строку длиной 1 спереди, если спереди нет ложного срабатывания,
    в этом случае верните строку длиной 1 сзади. Строка будет непустой. */
    public static String theEnd(String s, boolean front) {
        if (front) {
            return s.substring(0, 1);
        } else {
            return s.substring(s.length() - 1);
        }

    }

    /*Учитывая 2 строки, верните их конкатенцию,
    за исключением того, что опустите первый символ каждой из них.
    Строки будут иметь длину не менее 1. */
    public static String nonStart(String a, String b) {

        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public static String firstHalf(String word) {

        return word.substring(0, word.length() / 2);
    }

    /* Получив длину строки "out" 4, например, "<<>>",
   и слово, верните новую строку, где слово находится в середине строки "out",
   например, "<>". Замечание: используйте str.substring(i, j) для извлечения строки,
   начинающейся с индекса i и идущей вверх, но не включающей индекс j.*/
    public static String makeOutWord(String symbol, String word) {
        /*String start = "";
        symbol = symbol.substring(0, symbol.length() / 2);
        System.out.println(symbol);*/
        return symbol.substring(0, symbol.length() / 2) + word + symbol.substring(symbol.length() / 2);
    }

    // Получив имя строки, например, "Боб", верните приветствие формы "Привет, Боб!".

    public static String helloName(String name) {
        String hello = "Hello ";
        String symbol = "!";
        char quotationMark = '"';
        String result = quotationMark + hello.concat(name + symbol) + quotationMark;
        return result;
    }
    public static void ggg() {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = new Integer(number).toString();
        char [] arr = s.toCharArray();
        int result = Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[1])
                + Character.getNumericValue(arr[2]);
        return result;
    }

}
