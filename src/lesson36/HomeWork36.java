package lesson36;

import java.util.Arrays;
import java.util.Random;

//Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
public class HomeWork36 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cyrillicAlphabet()));
        System.out.println(Arrays.toString(randomAlphabet(cyrillicAlphabet())));
        alphabetMix(cyrillicAlphabet());
    }

    public static void alphabetMix(char[] array) {
        for (int i = 0; i < array.length; i++) {
        }
    }

    /*Объявите массив char и заполните его кириллическим алфавитом. */
    public static char[] cyrillicAlphabet() {
        return new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О',
                'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    }

    /* Перемешать его элементы случайным образом так, чтобы каждый элемент оказался на новом месте. ****/
    public static char[] randomAlphabet(char[] output) {
        for (int i = 0; i < output.length; i++) {
            output[i] = output[(int) (Math.random() * cyrillicAlphabet().length)];
        }

        return output;
    }

}