package lesson19;

public class HomeWork19 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false
    }

    /*Возвращает true, если заданная строка содержит "bob",
    но где средний 'o' char может быть любым char. */
    public static boolean bobThere(String input) {
        int index = 1;
        char b = 'b';
        /*char o = 'o';
        String result = "";*/
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == b && input.charAt(i + 2) == b) {
                return true;
            }
            //for (int i = 0; i < str.length(); i++) {
            //result = str.substring(0,index) + o + str.substring(index + 1);
            //System.out.println(result);
            /*if(str.charAt(i) == str.length()){

            }*/
        }

        return false;
    }
}
