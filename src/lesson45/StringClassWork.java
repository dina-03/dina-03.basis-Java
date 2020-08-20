package lesson45;

public class StringClassWork {
    public static void main(String[] args) {

        System.out.println(oneTwo("abc"));// → "bca"
        System.out.println(oneTwo("tca"));// → "cat"
        System.out.println(oneTwo("tcagdo"));// → "catdog"
        System.out.println(oneTwo("TelRan!?"));// → "elTanR"
    }

    /* Получив строку, вычислите новую строку, перемещая первый пришедший после двух следующих символов,
     так что "abc" дает "bca". Повторите этот процесс для каждой последующей группы из 3-х символов,
      так что "abcdef" дает "bcaefd". Игнорировать любую группу из менее чем 3-х символов в конце.*/
    private static String oneTwo(String str) {
        String output = "";
        int index = 0;
        String symbol = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            if (str.length() - i < 3) {
                //nothing
            } else {
                output = output + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
            }
        }
        return output;
    }
}
