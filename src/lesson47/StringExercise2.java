package lesson47;

public class StringExercise2 {
    public static void main(String[] args) {
        /*Ищите такие детали как "zip" и "zap" в строке - длина-3, начиная с 'z' и заканчивая 'p'.
        Возвращаем строку, в которой для всех таких слов средняя буква отсутствует, поэтому "zipXzap" дает "zpXzp".*/
        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
        System.out.println("--------------");
        System.out.println(zipZapThree("zipXzap"));// → "zpXzp"
        System.out.println(zipZapThree("zopzop"));// → "zpzp"
        System.out.println(zipZapThree("zzzopzop"));// → "zzzpzp"
        System.out.println("--------------");
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"
        System.out.println(wordEnds("9AB186ABk", "AB"));// → "916k"
    }

    private static String wordEnds(String str, String strChar) {


        return "";
    }

    /*Получив строку и непустое слово, возвращайте строку,
      сделанную из каждого символа char непосредственно перед и сразу после каждого появления слова в строке.
      Игнорируйте случаи, когда до или после слова нет символа char,
      а символ char может быть включен дважды, если он находится между двумя словами. */
    private static String wordEndsOld(String str, String strChar) {
        int start = str.length();
        int end = strChar.length();
        String result = "";
        for (int i = 0; i < start - end + 1; i++) {
            String temp = str.substring(i, i + end);
            if (i > 0 && temp.equals(strChar)){
                result += str.substring(i - 1, i);
            }
            if (i < start - end && temp.equals(strChar)){
                result += str.substring(i + end, i + end + 1);
            }
        }
        return result;
    }

    public static String zipZapTwo(String str) {
        String z = "";
        String p = "";
        String temp = "";
        for (int i = 0; i < str.length() - 2; i++) {
            temp = str.substring(i, i + 3);
            if (temp.charAt(0) == 'z' && temp.charAt(2) == 'p') {
                z = str.substring(0, i + 1);
                p = str.substring(i + 2);
                str = z + p;
            }
        }
        return str;
    }

    private static String zipZap(String str) {
        int length = str.length();
        String output = "";
        for (int i = 0; i < length; i++) {
            output += str.substring(i, i + 1);
            if (i > 0 && i < length - 1) {
                if (str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'p') {
                    output = output.substring(0, output.length() - 1);
                }
            }
        }
        return output;
    }

    public static String zipZapThree(String str) {
        return str.replaceAll("z.p", "zp");
    }
}
