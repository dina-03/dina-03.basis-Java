package lesson36;

import java.util.Arrays;

public class HW36CharArrayMaria {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createCharArray()));
        makeRandomChars(createCharArray());

    }

    private static String[] createCharArray() {
        String[] charArray = new String[33];
        String source = "А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я";
        source = source.replace(" ", "");
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = String.valueOf(source.charAt(i));
        }
        return charArray;
    }

    private static void makeRandomChars(String[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = charArray[(int) (Math.random() * charArray.length)];
        }
        System.out.println(Arrays.toString(charArray));
    }
}
