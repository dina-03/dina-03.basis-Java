package lesson45;

public class StringExercise {
    public static void main(String[] args) {
        /* Возвращает true, если строка "кот" и "собака" появляются в данной строке
         одинаковое количество раз.*/
      /*  System.out.println(catDog("catdog"));// → true
        System.out.println(catDog("catcat"));// → false
        System.out.println(catDog("1cat1cadodog"));// → true
        System.out.println(catDog("catdogdog"));// → false*/
        /*Возвращает true, если заданная строка содержит видимость "xyz",
        где xyz не предшествует непосредственно точке (.).
        Таким образом, "xxyz" считается, а "x.xyz" нет. */
        //System.out.println(xyzThere("abcxyz"));// → true
        //System.out.println(xyzThere("abc.xyz"));// → false
        //System.out.println(xyzThere("xyz.abc"));// → true
        /*Учитывая две строки, a и b, создайте большую строку из первой символа a,
        первой символа b, второй символа a, второй символа b, и так далее.
        Любой оставшийся символ проходит в конце результата. */
        //System.out.println(mixString("abc", "xyz"));// → "axbycz"
        // System.out.println(mixString("Hi", "There"));// → "HTihere"
        //System.out.println(mixString("xxxx", "There"));// → "xTxhxexre"
        /*Получив две строки, слово и разделитель, верните большую строку,
        состоящую из счетных вхождений слова, разделенных строкой разделителя. */
        System.out.println(repeatSeparator("Word", "X", 3));// →"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// →"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// →"This"
    }

    private static String repeatSeparator(String a, String b, int count) {
        StringBuilder output = new StringBuilder(a);
        if (count > 1) {
            for (int i = 0; i < count; i++) {
                output.append(b).append(a);
            }
        }
        return output.toString();
    }

    private static String mixString(String a, String b) {
        StringBuilder output = new StringBuilder();
        int length = Math.min(a.length(), b.length());
        for (int i = 0; i < length; i++) {
            output.append(a.charAt(i)).append(b.charAt(i));
        }
        if (b.length() > a.length()) {
            output.append(b.substring(length));
        } else if (b.length() < a.length()) {
            output.append(a.substring(length));
        }
        return output.toString();
    }

    private static boolean xyzThere(String str) {
        if (str.contains(".xyz")) {
            return false;
        } else if (str.contains("xyz")) {
            return true;
        }
        return false;
    }

    private static boolean catDog(String str) {
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                countDog++;
            } else if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
        }
        //return str.contains("dog") && str.contains("cat");
        return countDog == countCat;
    }
}
