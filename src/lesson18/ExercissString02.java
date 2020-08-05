package lesson18;

public class ExercissString02 {
    public static void main(String[] args) {
       /* System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"
        System.out.println(withouEnd2("Hello"));// →"ell"
        System.out.println(withouEnd2("abc"));// →"b"
        System.out.println(withouEnd2("ab"));// →""*/
        System.out.println(nTwice("Hello", 2));// →"Helo"
        System.out.println(nTwice("Chocolate", 3));// →"Choate"
        System.out.println(nTwice("Chocolate", 1));// →"Ce"

    }

    /* Получив строку и int n, верните из строки строку, сделанную из первого и последнего n символов.
    Длина строки будет как минимум n.*/
    public static String nTwice(String s, int n) {

        return "";
    }

    /* Получив строку, верните "повернутые влево 2" версии,
    в которых первые 2 графика сдвинуты на конец.
    Длина строки будет не менее 2.*/
    public static String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public static String withouEnd2(String str) {

        return str.substring(1, str.length() - 1);
    }


}
