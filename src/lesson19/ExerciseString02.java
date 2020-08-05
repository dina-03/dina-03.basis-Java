package lesson19;

public class ExerciseString02 {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
        //test();

    }

    // Если символ из с1 содержится в с2, то оставь этот символ без изменений.
    //Иначе замени этот символ на +
    public static String plusOut(String s1, String s2) {
        char plus = '+';
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            /*for (int j = 0; j < s2.length(); j++) {
                if ((s1.charAt(i)) != s2.charAt(j)) {
                    result = Main.myReplace(result, plus, i);
                }
            }*/
        }

        return result;
    }

    public static void test() {
        String input = "test";
        String etalon = "te";
        input = input + input.contains(etalon.substring(0, 1));
        System.out.println(input);
    }
}
