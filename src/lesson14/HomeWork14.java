package lesson14;

import sun.lwawt.macosx.CInputMethod;

public class HomeWork14 {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));//"loHi"
        System.out.println(minCat("Hello", "java"));//"ellojava"
        System.out.println(minCat("java", "Hello"));//"javaello"
        split();
        System.out.println(doubleChar("The"));//   → "TThhee"
        System.out.println(doubleChar("AAbb"));//  → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        split();
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        split();
        System.out.println(sumNumbers(123));
        System.out.println(sumNumbers(768));
        System.out.println(sumNumbers(999));
    }

    public static void split() {
        System.out.println("_______________________");
    }

    /* Учитывая 3 int значения, a b c, возвращают свою сумму.
    Однако, если одно из значений совпадает с другим, то оно не засчитывается в сумму.*/
    public static int loneSum(int a, int b, int c) {
        int result = a + b + c;
        if (a == b) {
            result = result - a - b;
        }
        if (b == c) {
            result = result - b - c;
        }
        if (c == a) {
            result = result - c - a;
        }
        if ((a == b) && (b == c)) {
            result = 0;
        }
        return result;
    }


    /* Получив две строки, сложите их вместе (так называемая "конкатенация") и верните результат.
    Однако, если строки разной длины, опустите символы из более длинной строки,
    чтобы она была такой же длины, как и более короткая строка.
    Таким образом, "Hello" и "Hi" дают результат "loHi". Строки могут быть любой длины.*/
    public static String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a + b;
        }
        if (a.length() > b.length()) {
            int difference = a.length() - b.length();
            return a.substring(difference, a.length()) + b;
        } else {
            int difference = b.length() - a.length();
            return a + b.substring(difference, b.length());
        }

    }

    /*Получив строку, верните строку, где для каждого символа в оригинале есть два. */
    public static String doubleChar(String symbol) {
        String str = "";
        for (int i = 0; i < symbol.length(); i++) {
            str = str + symbol.charAt(i) + symbol.charAt(i);
        }
        return str;
    }

    /*Дано целое трехзначное число. Написать метод,
    который возвращает сумму разрядов этого числа, например:
    123 -> 6  (1+2+3)
    768 -> 21 (7+6+8)*/
    public static int sumNumbers(int n) {
        String s = new Integer(n).toString();
        char[] arr = s.toCharArray();
        int result = Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[1])
                + Character.getNumericValue(arr[2]);

        /*String output = "";
        String input = String.valueOf(n);// n to String
        char[] result = input.toCharArray();// n to char
        // output = output + result + result + result;
        for (int i = 0; i < n; i++) {
            output = output + result + result + result;
        }
        int sum = Integer.parseInt(output);
        return sum;*/
        return result;
    }

}
