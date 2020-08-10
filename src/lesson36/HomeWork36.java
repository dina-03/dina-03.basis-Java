package lesson36;

import java.util.Arrays;

//Исходный алфавит: А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я
public class HomeWork36 {
    public static void main(String[] args) {
        System.out.println(cyrillicAlphabet());
        System.out.println(intermingleAlphabet(cyrillicAlphabet()));

    }

    /*Объявите массив char и заполните его кириллическим алфавитом. */
    public static char[] cyrillicAlphabet() {
        return new char[]{'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р',
                'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
    }

    /* Перемешать его элементы случайным образом так, чтобы каждый элемент оказался на новом месте. ****/
    public static char[] intermingleAlphabet(char[] output) {
        for (int i = 0; i < output.length; i++) {
            output[i] = output[(int) (Math.random() * cyrillicAlphabet().length)];
        }

        return output;
    }

}
