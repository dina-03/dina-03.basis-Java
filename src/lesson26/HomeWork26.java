package lesson26;

public class HomeWork26 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));// →"ad"
        System.out.println(starOut("ab**cd"));// →"ad"
        System.out.println(starOut("sm*eilly"));// →"silly"
        System.out.println("_______________________");
        System.out.println(countHi("abc hi ho"));// →1
        System.out.println(countHi("ABChi hi"));// →2
        System.out.println(countHi("hihi"));// →2
    }

    /* Возвращает количество раз, когда строка "hi" появляется в любом месте данной строки.*/
    private static int countHi(String s) {
        char sh = 'h';
        char si = 'i';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == sh && s.charAt(i + 1) == si) {
                count++;
            }
        }

        return count;
    }

    private static String starOut(String input) {
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                //output = output + input.charAt(i - 1) + input.charAt(i) + input.charAt(i + 1);
                output = input.substring(0, (i - 1)) + input.substring(i + 2);
                //input = input + replaceDuplicates(input);
            }
        }

       /* for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '*' && input.charAt(i + 1) == '*') {
                output = output + input.substring(0, i - 2);
            }
        }*/
        //input = input.replace(output, "");
        return output;
    }

    public static String replaceDuplicates(String inputString) {
        if (inputString == null || inputString.length() < 2) {
            return inputString;
        }
        int position = 1;
        char[] characters = inputString.toCharArray();
        for (int i = 1; i < inputString.length(); i++) {
            int j;
            for (j = 0; j < position; j++) {
                if (characters[i] == characters[j]) {
                    break;
                }
            }
            if (j == position) {
                characters[position] = characters[i];
                position++;
            } else {
                characters[position] = 0;
                position++;
            }
        }
        return getStringWithoutDuplicates(characters);
    }

    public static String getStringWithoutDuplicates(char[] inputChars) {
        StringBuilder stringBuilder = new StringBuilder(inputChars.length);
        for (char character : inputChars) {
            if (character != 0) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }

}
